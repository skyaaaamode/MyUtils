/**
 * @author zhouzf32074
 * @Classname ListSpider
 * @Description TODO
 * @Date 2021/11/17 17:04
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * @ClassName: HupuNewsSpider
 * @author LJH
 * @date 2017年11月27日 下午4:54:48
 */
public class ListSpider implements PageProcessor {

    // 抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me().setRetryTimes(3).setSleepTime(100);

    public Site getSite() {
        return site;
    }

    public void process(Page page) {
        // 文章页，匹配 https://voice.hupu.com/nba/七位数字.html
        if (!page.getUrl().toString().equals("https://www.oschina.net/blog?classification=20&groupType=3")) {
            page.putField("Title", page.getHtml().xpath("//*[@id=\"mainScreen\"]/div/div[1]/div[1]/div[2]/div[1]/div/div[2]/div/div[1]/h1/a/text()").toString());
            page.putField("Content",
                    page.getHtml().xpath("//*[@id=\"mainScreen\"]/div/div[1]/div[1]/div[2]/div[1]/div/div[2]/div/div[2]/div[1]/div[1]/div/p[1]/text()").all().toString());
        }
        // 列表页
        else {
            // 文章url
            page.addTargetRequests(
                    page.getHtml().xpath("//*[@id=\"recommendArticleList\"]/div[1]/div/div/a/@href").all());
        }
    }

    public static void main(String[] args) {
        Spider.create(new ListSpider()).addUrl("https://www.oschina.net/blog?classification=20&groupType=3").addPipeline(new MysqlPipeline())
                .thread(3).run();
    }
}

// 自定义实现Pipeline接口
class MysqlPipeline implements Pipeline {

    public MysqlPipeline() {
    }

    @Override
    public void process(ResultItems resultitems, Task task) {
        Map<String, Object> mapResults = resultitems.getAll();
        Iterator<Entry<String, Object>> iter = mapResults.entrySet().iterator();
        Map.Entry<String, Object> entry;
        // 输出到控制台
        while (iter.hasNext()) {
            entry = iter.next();
            System.out.println(entry.getKey() + "：" + entry.getValue());
        }
    }
}
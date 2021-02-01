package json.bean;

import java.util.List;

/**
 * @author zhouzf32074
 * @Classname Crash
 * @Description TODO
 * @Date 2021/1/27 16:35
 */
public class Crash {


    /**
     * err_no : 0
     * err_info : 操作成功
     * data : {"pageNo":1,"pageSize":10,"total":0,"pages":0,"result":[{"crash_count":0,"crash_model":0,"start_model":1,"appid":"com.hundsun.light.componentshow.appstore","start_count":3},{"crash_count":0,"crash_model":0,"start_model":2,"appid":"com.hs.light112","start_count":14}],"pageable":true,"appid":null,"appversion":null,"id":null,"maxtime":1611158399999,"mintime":1611072000000,"crashtime":null,"mappingFile":null,"channel":null,"platform":null,"model":null,"exceptiondesType":null,"fwversion":null,"crashtype":"NATIVE_CRASH","type":1,"orderColumn":null,"asc":false,"aggColumn":null,"queryType":null,"period":1}
     */

    private int err_no;
    private String err_info;
    private DataBean data;

    public int getErr_no() {
        return err_no;
    }

    public void setErr_no(int err_no) {
        this.err_no = err_no;
    }

    public String getErr_info() {
        return err_info;
    }

    public void setErr_info(String err_info) {
        this.err_info = err_info;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * pageNo : 1
         * pageSize : 10
         * total : 0
         * pages : 0
         * result : [{"crash_count":0,"crash_model":0,"start_model":1,"appid":"com.hundsun.light.componentshow.appstore","start_count":3},{"crash_count":0,"crash_model":0,"start_model":2,"appid":"com.hs.light112","start_count":14}]
         * pageable : true
         * appid : null
         * appversion : null
         * id : null
         * maxtime : 1611158399999
         * mintime : 1611072000000
         * crashtime : null
         * mappingFile : null
         * channel : null
         * platform : null
         * model : null
         * exceptiondesType : null
         * fwversion : null
         * crashtype : NATIVE_CRASH
         * type : 1
         * orderColumn : null
         * asc : false
         * aggColumn : null
         * queryType : null
         * period : 1
         */

        private int pageNo;
        private int pageSize;
        private int total;
        private int pages;
        private boolean pageable;
        private Object appid;
        private Object appversion;
        private Object id;
        private long maxtime;
        private long mintime;
        private Object crashtime;
        private Object mappingFile;
        private Object channel;
        private Object platform;
        private Object model;
        private Object exceptiondesType;
        private Object fwversion;
        private String crashtype;
        private int type;
        private Object orderColumn;
        private boolean asc;
        private Object aggColumn;
        private Object queryType;
        private int period;
        private List<ResultBean> result;

        public int getPageNo() {
            return pageNo;
        }

        public void setPageNo(int pageNo) {
            this.pageNo = pageNo;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getPages() {
            return pages;
        }

        public void setPages(int pages) {
            this.pages = pages;
        }

        public boolean isPageable() {
            return pageable;
        }

        public void setPageable(boolean pageable) {
            this.pageable = pageable;
        }

        public Object getAppid() {
            return appid;
        }

        public void setAppid(Object appid) {
            this.appid = appid;
        }

        public Object getAppversion() {
            return appversion;
        }

        public void setAppversion(Object appversion) {
            this.appversion = appversion;
        }

        public Object getId() {
            return id;
        }

        public void setId(Object id) {
            this.id = id;
        }

        public long getMaxtime() {
            return maxtime;
        }

        public void setMaxtime(long maxtime) {
            this.maxtime = maxtime;
        }

        public long getMintime() {
            return mintime;
        }

        public void setMintime(long mintime) {
            this.mintime = mintime;
        }

        public Object getCrashtime() {
            return crashtime;
        }

        public void setCrashtime(Object crashtime) {
            this.crashtime = crashtime;
        }

        public Object getMappingFile() {
            return mappingFile;
        }

        public void setMappingFile(Object mappingFile) {
            this.mappingFile = mappingFile;
        }

        public Object getChannel() {
            return channel;
        }

        public void setChannel(Object channel) {
            this.channel = channel;
        }

        public Object getPlatform() {
            return platform;
        }

        public void setPlatform(Object platform) {
            this.platform = platform;
        }

        public Object getModel() {
            return model;
        }

        public void setModel(Object model) {
            this.model = model;
        }

        public Object getExceptiondesType() {
            return exceptiondesType;
        }

        public void setExceptiondesType(Object exceptiondesType) {
            this.exceptiondesType = exceptiondesType;
        }

        public Object getFwversion() {
            return fwversion;
        }

        public void setFwversion(Object fwversion) {
            this.fwversion = fwversion;
        }

        public String getCrashtype() {
            return crashtype;
        }

        public void setCrashtype(String crashtype) {
            this.crashtype = crashtype;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public Object getOrderColumn() {
            return orderColumn;
        }

        public void setOrderColumn(Object orderColumn) {
            this.orderColumn = orderColumn;
        }

        public boolean isAsc() {
            return asc;
        }

        public void setAsc(boolean asc) {
            this.asc = asc;
        }

        public Object getAggColumn() {
            return aggColumn;
        }

        public void setAggColumn(Object aggColumn) {
            this.aggColumn = aggColumn;
        }

        public Object getQueryType() {
            return queryType;
        }

        public void setQueryType(Object queryType) {
            this.queryType = queryType;
        }

        public int getPeriod() {
            return period;
        }

        public void setPeriod(int period) {
            this.period = period;
        }

        public List<ResultBean> getResult() {
            return result;
        }

        public void setResult(List<ResultBean> result) {
            this.result = result;
        }

        public static class ResultBean {
            /**
             * crash_count : 0.0
             * crash_model : 0
             * start_model : 1
             * appid : com.hundsun.light.componentshow.appstore
             * start_count : 3.0
             */

            private double crash_count;
            private int crash_model;
            private int start_model;
            private String appid;
            private double start_count;

            public double getCrash_count() {
                return crash_count;
            }

            public void setCrash_count(double crash_count) {
                this.crash_count = crash_count;
            }

            public int getCrash_model() {
                return crash_model;
            }

            public void setCrash_model(int crash_model) {
                this.crash_model = crash_model;
            }

            public int getStart_model() {
                return start_model;
            }

            public void setStart_model(int start_model) {
                this.start_model = start_model;
            }

            public String getAppid() {
                return appid;
            }

            public void setAppid(String appid) {
                this.appid = appid;
            }

            public double getStart_count() {
                return start_count;
            }

            public void setStart_count(double start_count) {
                this.start_count = start_count;
            }
        }
    }
}


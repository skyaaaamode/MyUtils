package popj;

/**
 * @author zhouzf32074
 * @Classname CrashCount
 * @Description TODO
 * @Date 2021/1/28 17:19
 */
public class CrashCount {
    private Float crash_count;

    private Integer crash_model;

    private Integer start_model;

    private String  app_id;

    private Float start_count;

    public Float getCrash_count() {
        return crash_count;
    }

    public void setCrash_count(Float crash_count) {
        this.crash_count = crash_count;
    }

    public Integer getCrash_model() {
        return crash_model;
    }

    public void setCrash_model(Integer crash_model) {
        this.crash_model = crash_model;
    }

    public Integer getStart_model() {
        return start_model;
    }

    public void setStart_model(Integer start_model) {
        this.start_model = start_model;
    }

    public String getApp_id() {
        return app_id;
    }

    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }

    public Float getStart_count() {
        return start_count;
    }

    public void setStart_count(Float start_count) {
        this.start_count = start_count;
    }
}

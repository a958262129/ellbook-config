package cunyun.zone.server.entity.Vo;


import java.io.Serializable;

/**
 * Created by Administrator on 2017/8/30.
 */
public class PageVo implements Serializable {

    private static final long serialVersionUID = 7407799577753226119L;
    private Integer pageSize;

    private Integer page;

    private Integer limitStart;

    private Integer limitEnd;


    public PageVo() {
        super();
        this.page = 0;
        this.pageSize = 10;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize == null || pageSize < 1 ? 10 : pageSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page == null ? 0 : page;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitStart(Integer limitStart) {
        this.limitStart = limitStart;
    }

    public Integer getLimitEnd() {
        return limitEnd;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd = limitEnd;
    }

    public void setStartAndEnd() {
        this.limitStart = (this.page) * this.pageSize;
    }
}

package cunyun.zone.server.entity;

import java.util.Date;

public class CyTwitterAtts {
    private Integer id;

    private String twitterId;

    private String attsType;

    private Date createdTime;

    private String attsUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId == null ? null : twitterId.trim();
    }

    public String getAttsType() {
        return attsType;
    }

    public void setAttsType(String attsType) {
        this.attsType = attsType == null ? null : attsType.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getAttsUrl() {
        return attsUrl;
    }

    public void setAttsUrl(String attsUrl) {
        this.attsUrl = attsUrl == null ? null : attsUrl.trim();
    }
}
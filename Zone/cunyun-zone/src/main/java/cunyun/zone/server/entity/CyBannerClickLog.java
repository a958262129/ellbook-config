package cunyun.zone.server.entity;

import java.util.Date;

public class CyBannerClickLog {
    private Integer id;

    private String bannerId;

    private String twitterId;

    private String uid;

    private Date createdTime;

    private String hasFee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBannerId() {
        return bannerId;
    }

    public void setBannerId(String bannerId) {
        this.bannerId = bannerId == null ? null : bannerId.trim();
    }

    public String getTwitterId() {
        return twitterId;
    }

    public void setTwitterId(String twitterId) {
        this.twitterId = twitterId == null ? null : twitterId.trim();
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getHasFee() {
        return hasFee;
    }

    public void setHasFee(String hasFee) {
        this.hasFee = hasFee == null ? null : hasFee.trim();
    }
}
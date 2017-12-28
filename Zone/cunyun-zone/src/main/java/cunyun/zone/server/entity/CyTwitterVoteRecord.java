package cunyun.zone.server.entity;

import java.util.Date;

public class CyTwitterVoteRecord {
    private Integer id;

    private String twitterId;

    private Date createdTime;

    private String uid;

    private String voteRecord;

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

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getVoteRecord() {
        return voteRecord;
    }

    public void setVoteRecord(String voteRecord) {
        this.voteRecord = voteRecord == null ? null : voteRecord.trim();
    }
}
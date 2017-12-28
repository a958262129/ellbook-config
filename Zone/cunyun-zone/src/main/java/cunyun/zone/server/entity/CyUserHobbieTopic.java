package cunyun.zone.server.entity;

import java.util.Date;

public class CyUserHobbieTopic {
    private Integer id;

    private String uid;

    private String topicName;

    private String topicId;

    private Date createdTime;

    private String pushModel;

    private String pushTimes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid == null ? null : uid.trim();
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName == null ? null : topicName.trim();
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public String getPushModel() {
        return pushModel;
    }

    public void setPushModel(String pushModel) {
        this.pushModel = pushModel == null ? null : pushModel.trim();
    }

    public String getPushTimes() {
        return pushTimes;
    }

    public void setPushTimes(String pushTimes) {
        this.pushTimes = pushTimes == null ? null : pushTimes.trim();
    }
}
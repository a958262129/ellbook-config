package cunyun.zone.server.entity;

import java.util.Date;

public class CyTopic {
    private String topicId;

    private String topicName;

    private Date createdTime;

    private String uid;

    private String topicClass;

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId == null ? null : topicId.trim();
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName == null ? null : topicName.trim();
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

    public String getTopicClass() {
        return topicClass;
    }

    public void setTopicClass(String topicClass) {
        this.topicClass = topicClass == null ? null : topicClass.trim();
    }
}
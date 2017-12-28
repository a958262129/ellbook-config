package cunyun.zone.server.entity;

import java.util.Date;

public class CyUserInviteRecord {
    private Integer id;

    private String uid;

    private String invitedUid;

    private String invitedName;

    private Date createdTime;

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

    public String getInvitedUid() {
        return invitedUid;
    }

    public void setInvitedUid(String invitedUid) {
        this.invitedUid = invitedUid == null ? null : invitedUid.trim();
    }

    public String getInvitedName() {
        return invitedName;
    }

    public void setInvitedName(String invitedName) {
        this.invitedName = invitedName == null ? null : invitedName.trim();
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }
}
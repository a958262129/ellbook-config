package cunyun.zone.server.entity;

import java.util.Date;

public class CyUser {
    private Integer id;

    private String uid;

    private String nickName;

    private String userAvatar;

    private String userSign;

    private String userMobile;

    private String userType;

    private String wcUserName;

    private String wcNickName;

    private String inviteUid;

    private String wcQrCode;

    private Date lastLoginTime;

    private Date createdTime;

    private Date updateTime;

    private String status;

    private String aliUserName;

    private String aliNickName;

    private String aliUserid;

    private String vipLevel;

    private Integer cyScoreCount;

    private Integer cyScoreBalance;

    private Integer balance;

    private String name;

    private Integer isRealName;

    private Integer isRealMobile;

    private String cid;

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar == null ? null : userAvatar.trim();
    }

    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign == null ? null : userSign.trim();
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getWcUserName() {
        return wcUserName;
    }

    public void setWcUserName(String wcUserName) {
        this.wcUserName = wcUserName == null ? null : wcUserName.trim();
    }

    public String getWcNickName() {
        return wcNickName;
    }

    public void setWcNickName(String wcNickName) {
        this.wcNickName = wcNickName == null ? null : wcNickName.trim();
    }

    public String getInviteUid() {
        return inviteUid;
    }

    public void setInviteUid(String inviteUid) {
        this.inviteUid = inviteUid == null ? null : inviteUid.trim();
    }

    public String getWcQrCode() {
        return wcQrCode;
    }

    public void setWcQrCode(String wcQrCode) {
        this.wcQrCode = wcQrCode == null ? null : wcQrCode.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getAliUserName() {
        return aliUserName;
    }

    public void setAliUserName(String aliUserName) {
        this.aliUserName = aliUserName == null ? null : aliUserName.trim();
    }

    public String getAliNickName() {
        return aliNickName;
    }

    public void setAliNickName(String aliNickName) {
        this.aliNickName = aliNickName == null ? null : aliNickName.trim();
    }

    public String getAliUserid() {
        return aliUserid;
    }

    public void setAliUserid(String aliUserid) {
        this.aliUserid = aliUserid == null ? null : aliUserid.trim();
    }

    public String getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(String vipLevel) {
        this.vipLevel = vipLevel == null ? null : vipLevel.trim();
    }

    public Integer getCyScoreCount() {
        return cyScoreCount;
    }

    public void setCyScoreCount(Integer cyScoreCount) {
        this.cyScoreCount = cyScoreCount;
    }

    public Integer getCyScoreBalance() {
        return cyScoreBalance;
    }

    public void setCyScoreBalance(Integer cyScoreBalance) {
        this.cyScoreBalance = cyScoreBalance;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getIsRealName() {
        return isRealName;
    }

    public void setIsRealName(Integer isRealName) {
        this.isRealName = isRealName;
    }

    public Integer getIsRealMobile() {
        return isRealMobile;
    }

    public void setIsRealMobile(Integer isRealMobile) {
        this.isRealMobile = isRealMobile;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }
}
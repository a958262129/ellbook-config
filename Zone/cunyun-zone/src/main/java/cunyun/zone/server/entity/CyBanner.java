package cunyun.zone.server.entity;

import java.util.Date;

public class CyBanner {
	private String bannerId;

	private Date createdTime;

	private Date startTime;

	private Date endTime;

	private String deliveryVipLevel;

	private String content;

	private String clickUrl;

	private String deliveryTopicClass;

	private String deliveryTopic;

	private String deliveryRuleExt;

	public String getBannerId() {
		return bannerId;
	}

	public void setBannerId(String bannerId) {
		this.bannerId = bannerId == null ? null : bannerId.trim();
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getDeliveryVipLevel() {
		return deliveryVipLevel;
	}

	public void setDeliveryVipLevel(String deliveryVipLevel) {
		this.deliveryVipLevel = deliveryVipLevel == null ? null : deliveryVipLevel.trim();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content == null ? null : content.trim();
	}

	public String getClickUrl() {
		return clickUrl;
	}

	public void setClickUrl(String clickUrl) {
		this.clickUrl = clickUrl == null ? null : clickUrl.trim();
	}

	public String getDeliveryTopicClass() {
		return deliveryTopicClass;
	}

	public void setDeliveryTopicClass(String deliveryTopicClass) {
		this.deliveryTopicClass = deliveryTopicClass == null ? null : deliveryTopicClass.trim();
	}

	public String getDeliveryTopic() {
		return deliveryTopic;
	}

	public void setDeliveryTopic(String deliveryTopic) {
		this.deliveryTopic = deliveryTopic == null ? null : deliveryTopic.trim();
	}

	public String getDeliveryRuleExt() {
		return deliveryRuleExt;
	}

	public void setDeliveryRuleExt(String deliveryRuleExt) {
		this.deliveryRuleExt = deliveryRuleExt == null ? null : deliveryRuleExt.trim();
	}
}
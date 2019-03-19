package com.cjt.entity;

import java.sql.Date;

public class Bbscomment {

	private Integer bbsCommentId;
	private String content;
	private String userId;
	private Integer bbsId;
	private Date pushtime;
	public Integer getBbsCommentId() {
		return bbsCommentId;
	}
	public void setBbsCommentId(Integer bbsCommentId) {
		this.bbsCommentId = bbsCommentId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getBbsId() {
		return bbsId;
	}
	public void setBbsId(Integer bbsId) {
		this.bbsId = bbsId;
	}
	public Date getPushtime() {
		return pushtime;
	}
	public void setPushtime(Date pushtime) {
		this.pushtime = pushtime;
	}
	@Override
	public String toString() {
		return "Bbscomment [bbsCommentId=" + bbsCommentId + ", content="
				+ content + ", userId=" + userId + ", bbsId=" + bbsId
				+ ", pushtime=" + pushtime + "]";
	}
	
	

}

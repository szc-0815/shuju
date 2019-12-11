package com.shizhichao.bawei.entity;

public class comment {

	private Integer id;
	private Integer articleId;//文章id
	private Integer userId;//用户id
	private String content;//评论内容
	private String created;//发布时间
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getArticleId() {
		return articleId;
	}
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	public comment(Integer id, Integer articleId, Integer userId, String content, String created) {
		super();
		this.id = id;
		this.articleId = articleId;
		this.userId = userId;
		this.content = content;
		this.created = created;
	}
	public comment() {
		super();
	}
	@Override
	public String toString() {
		return "comment [id=" + id + ", articleId=" + articleId + ", userId=" + userId + ", content=" + content
				+ ", created=" + created + "]";
	}
	
	
	
}

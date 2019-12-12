package com.shizhichao.bawei.pojo;

public class VoteContent {

	private Integer id;
	private String content;
	private String title;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public VoteContent(Integer id, String content, String title) {
		super();
		this.id = id;
		this.content = content;
		this.title = title;
	}
	public VoteContent() {
		super();
	}
	@Override
	public String toString() {
		return "Vote_content [id=" + id + ", content=" + content + ", title=" + title + "]";
	}
	
}

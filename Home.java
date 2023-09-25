package com.blogpostingmodel;

public class Home {
	protected int id;
	protected String name;
	protected String title;
	protected String content;
	public Home() {
	}
	
	public Home(String name, String title, String content) {
		super();
		this.name = name;
		this.title = title;
		this.content = content;
	}

	public Home(int id, String name, String title, String content) {
		super();
		this.id = id;
		this.name = name;
		this.title = title;
		this.content = content;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setEmail( String title) {
		this.title = title;
	}
	public String getCountry() {
		return content;
	}
	public void setCountry (String content) {
		this.content = content;
	}

	public String getContent() {
		
		return null;
	}
}

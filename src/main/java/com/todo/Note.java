package com.todo;
import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Note {
	@Id
   private int id;
   private String title;
    @Column(length = 1000)
   private String content;

public Note(int id, String title, String content) {
	super();
	this.id = new Random().nextInt(1000);
	this.title = title;
	this.content = content;
}
public Note() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}

}
   
   

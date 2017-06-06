package com.javaWeb;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class bookDemo {
	private String bookName;
	private int bookNum;

	public bookDemo() {
		super();

	}
	
	public bookDemo(String bookName,int bookNum){
		this.bookName=bookName;
		this.bookNum=bookNum;
	}
	
    
}

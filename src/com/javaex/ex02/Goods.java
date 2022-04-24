package com.javaex.ex02;

public class Goods {
	
	//필드
	private String name;
	private String id;
	private int point;
	
	//생성자
	public Goods() {
		
	}
	public Goods( String name, String id, int point) {
		this.name = name;
		this.id = id;
		this.point = point;
	}
	
	//메소드 - gs
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	//메소드 - 일반
	public void member() {
		System.out.println("회원정보 : "+name+"("+id+"), "+point+"점");
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", id=" + id + ", point=" + point + "]";
	}
	
}





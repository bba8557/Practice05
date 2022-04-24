package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods jws  = new Goods("정우성", "jws", 50000);
		Goods yis  = new Goods("유재석", "yjs", 30000);
		Goods lhr  = new Goods("이효리", "lhr", 40000);
		
		//System.out.println(jws.toString());
		//System.out.println(yis.toString());
	    //System.out.println(lhr.toString());
	    
	    jws.member();
	    yis.member();
	    lhr.member();
	}

}



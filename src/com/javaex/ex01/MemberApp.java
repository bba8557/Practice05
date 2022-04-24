package com.javaex.ex01;

import com.javaex.ex02.Goods;

public class MemberApp {

	public static void main(String[] args) {

		Member jws = new Member("정우성", "jws", 50000);
		Member yis = new Member("유재석", "yjs", 30000);
		Member lhr = new Member("이효리", "lhr", 40000);

		// System.out.println(jws.toString());
		// System.out.println(yis.toString());
		// System.out.println(lhr.toString());

		jws.member();
		yis.member();
		lhr.member();

	}

}

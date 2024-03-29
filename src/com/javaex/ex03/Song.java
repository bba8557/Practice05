package com.javaex.ex03;

public class Song {
	
	//필드
	private String title;
 	private String artist;
	private String album;
	private String composer;
	private String year; // 숫자가 문자로 분류되있다
	private int track;
	
	//생성자
	public Song() {
		System.out.println("song(파라미터0개)");
	}
	public Song(String title, String artist, String album, String composer, String year) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System.out.println("Song(파라미터5개)"); //1번
	}
	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title,artist,album,composer,year);
		this.track = track;
		System.out.println("Song(파라미터6개)"); //2번
	}
	
	//메소드 - gs
	
	//메소드 - 일반
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
}




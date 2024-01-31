package ch08.class09;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public void setSongInfo(String title,String artist,String album,String composer,int year,int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	public void show() {
		System.out.println("노래제목 : " + title);
		System.out.println("가수 : " + artist);
		System.out.println("앨범제목 : " + album);
		System.out.println("작곡가 : " + composer);
		System.out.println("발표년도 : " + year);
		System.out.println("track : " + track);
	}
}

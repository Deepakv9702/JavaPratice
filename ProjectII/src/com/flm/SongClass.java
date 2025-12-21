package com.flm;

public class SongClass {
	
	private String songId;
	private String title;
	private String artist;
	private double duration;
	
	public String getSongId() {
		return songId;
	}
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public double getDuration() {
		return duration;
	}
	public void setSongId(String songId) {
		this.songId = songId;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	
	@Override
	public String toString() {
		return "SongClass [songId=" + songId + ", title=" + title + ", artist=" + artist + ", duration=" + duration
				+ "]";
	}
	
	
	
	
}

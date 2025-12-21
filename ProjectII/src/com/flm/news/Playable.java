package com.flm.news;

public interface Playable {
	
	void play(String title);
	void play(int songId);
	
	void pause(String title);
	void pause(int songId);
	
	void stop(String songId);
	void stop(int songId);

	
}

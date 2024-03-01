package com.kh.test240208;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MusicController {
	private List<Music> list = new ArrayList<>();
	
	public int addList(Music music) {
		
		boolean isAdd = list.add(music);
		if(isAdd == false) {
			return 0;
		}
		return 1;
	}
	
	public int addAtZero(Music music) {
		list.add(0, music);

		return 1;
	}
	
	public List printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				return m;
			}
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				list.remove(m);
				return m;
			}
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				list.set(list.indexOf(m), music);
				return m;
			}
		}
		return null;
	}
	
	public int ascTitle() {
		if(list == null) {
			return 0;
		}
		return 1;
	}
	
	public int descSinger() {
		if(list == null) {
			return 0;
		}
		return 1;
	}
}

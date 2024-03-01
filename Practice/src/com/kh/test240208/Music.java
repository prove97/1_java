package com.kh.test240208;

import java.util.Objects;

import com.kh.test240206_2.Lottery;

public class Music {
	private String title;
	private String singer;

	public Music() {
		super();
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	@Override
	public String toString() {
		return title + " - " + singer;
	}

	@Override
	public int hashCode() {
		String str = title + singer;
		return str.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Music) {
			Music other = (Music)obj;
			if(this.getTitle().equals(other.getTitle()) &&
					this.getSinger().equals(other.getSinger())) {
				return true;
			} else
				return false;
		} else {
			return false;
		}
	}
	
//	@Override
//	public int compareTo(Object o) {
//		return 0;
//	}
	
}

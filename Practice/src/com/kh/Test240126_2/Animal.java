package com.kh.Test240126_2;

public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {
		super();
	}

	protected Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "저의 이름은 " + this.name + "이고, 종류는 " + this.kinds + "입니다. ";
	}
	
	public abstract void speak();
	
}

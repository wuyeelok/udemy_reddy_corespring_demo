package com.kenneth.SpringDemo;

public class NavinAlien implements Alien {

	private int age;

	public NavinAlien() {
		System.out.println("Navin Alien Object Created..");
	}

	@Override
	public void code() {

		System.out.println("Im Coding...");

	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public void setAge(int age) {
		System.out.println("Age assigned");
		this.age = age;
	}

}

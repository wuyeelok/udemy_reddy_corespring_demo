package com.kenneth.SpringDemo;

public class NavinAlien implements Alien {

	private int age;
	private Computer com;

	public NavinAlien() {
		System.out.println("Navin Alien Object Created..");
	}

	public NavinAlien(int age) {

		System.out.println("Navin Alien contructor with args");

		this.age = age;
	}

	@Override
	public void code() {

		System.out.println("Im Coding...");
		this.com.compile();

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

	@Override
	public Computer getCom() {
		return com;
	}

	@Override
	public void setCom(Computer com) {
		this.com = com;
	}

}

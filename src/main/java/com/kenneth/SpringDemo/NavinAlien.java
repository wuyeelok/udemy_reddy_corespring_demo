package com.kenneth.SpringDemo;

public class NavinAlien implements Alien {

	private int age;
	private Laptop laptop;

	public NavinAlien() {
		System.out.println("Navin Alien Object Created..");
	}

	@Override
	public void code() {

		System.out.println("Im Coding...");
		this.laptop.compile();

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
	public Laptop getLaptop() {
		return laptop;
	}

	@Override
	public void setLaptop(Laptop laptop) {
		System.out.println("Setting laptop");
		this.laptop = laptop;
	}

}

package com.kenneth.SpringDemo;

public class NavinAlien implements Alien {

	private final int age;
	private final Computer com;

	/*
	 * public NavinAlien() { System.out.println("Navin Alien Object Created.."); }
	 */

	public NavinAlien(int age, Computer laptop) {

		System.out.println("Navin Alien contructor with args");

		this.age = age;
		this.com = laptop;
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

	/*
	 * @Override public void setAge(int age) { System.out.println("Age assigned");
	 * this.age = age; }
	 */

	@Override
	public Computer getLaptop() {
		return com;
	}

	/*
	 * @Override public void setLaptop(Laptop laptop) {
	 * System.out.println("Setting laptop"); this.laptop = laptop; }
	 */

}

package com.kenneth.SpringDemo;

public class NavinAlien implements Alien {

	private final int age;
	private final Laptop laptop;

	/*
	 * public NavinAlien() { System.out.println("Navin Alien Object Created.."); }
	 */

	public NavinAlien(int age, Laptop laptop) {

		System.out.println("Navin Alien contructor with args");

		this.age = age;
		this.laptop = laptop;
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

	/*
	 * @Override public void setAge(int age) { System.out.println("Age assigned");
	 * this.age = age; }
	 */

	@Override
	public Laptop getLaptop() {
		return laptop;
	}

	/*
	 * @Override public void setLaptop(Laptop laptop) {
	 * System.out.println("Setting laptop"); this.laptop = laptop; }
	 */

}

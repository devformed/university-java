package com.devformed.lab01.task2;

/**
 * @author Anton Gorokh
 */
public abstract class Shape {

//	public static void main(String[] args) {
//		Shape shape = new Shape("shape") {};
//		shape.print();
//	}

	private final String name;

	protected Shape(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println(this.name);
	}

	public abstract double getArea();
	public abstract double getPerimeter();
}

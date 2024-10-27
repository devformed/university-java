package com.devformed.lab01.task3;

import com.devformed.lab01.task2.Shape;

/**
 * @author Anton Gorokh
 */
public final class Triangle extends Shape {

	private final double side1;
	private final double side2;
	private final double side3;

	public Triangle(double side1, double side2, double side3) {
		super("Triangle");
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	@Override
	public double getArea() {
		double semiP = getPerimeter() / 2;
		return Math.sqrt(semiP * (semiP - side1) * (semiP - side2) * (semiP - side3));
	}

	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
}

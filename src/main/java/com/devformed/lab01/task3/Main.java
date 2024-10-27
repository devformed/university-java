package com.devformed.lab01.task3;

/**
 * @author Anton Gorokh
 */
public class Main {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(3., 4., 5.);
		Rectangle rectangle = new Rectangle(2., 3.);

		ShapeDescriber.describe(triangle);
		ShapeDescriber.describe(rectangle);
	}
}

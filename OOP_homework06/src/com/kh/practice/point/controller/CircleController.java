package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	Circle c;

	public String calcArea(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		return c.toString() + " / " + (Math.PI * radius * radius);
	}

	public String calcCircum(int x, int y, int radius) {
		c = new Circle(x, y, radius);
		return c.toString() + " / " + (Math.PI * radius * 2);
	}
}

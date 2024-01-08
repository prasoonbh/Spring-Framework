package com.springcore.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo
{
	@Value("#{22+9}")
	private int x;
	@Value("#{22*2}")
	private int y;
	@Value("#{T(java.lang.Math).sqrt(25) }") // way to call static method
	private double z;
	@Value("#{T(java.lang.Math).PI}") // way to call static variable
	private double e;
	@Value("#{new java.lang.String('Prasoon')}")
	private String name; 
	@Value("#{8>3}")
	private boolean atValue;
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", atValue=" + atValue + "]";
	}
	
	
}

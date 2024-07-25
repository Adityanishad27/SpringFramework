package com.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


// Init and destroy using  Interface

public class Pepsi implements InitializingBean,DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	
// init
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(" Pepsi    AfterpropertiesSet... INIT METHOD");
	}

	// destroy
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("  Pepsi  Destroy");
		
	}
	
	

}

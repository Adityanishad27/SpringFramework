package com.ConstructorInjection;

public class Certificate {
	
	
	String CertiName ;

	public Certificate(String certiName) {
		super();
		CertiName = certiName;
	}

	@Override
	public String toString() {
		return "Certificate [CertiName=" + CertiName + "]";
	}
	
	
	
	
	
	
	
	

}

package com.AmbiguityProblem;

public class Addition {
	
	private int A ;
	private int B;
	
	
	public Addition(int A, int B) {
		super();
		this.A = A;
		this.B = B;
		
		System.out.println("Contructor : Int  , Int ");
	}
	
	
	

	public Addition(double A, double B) {
		super();
		this.A = (int) A;
		this.B =(int) B;
		System.out.println("Contructor : Double  , Double ");
	}
	
	
	public Addition(String A, String B) {
		super();
		this.A = Integer.parseInt(A);
		this.B =Integer.parseInt(B);
		System.out.println("Contructor : Double  , Double ");
	}
	
	
	
	public void doSum() {
		
		System.out.println(this.A+"A");
		System.out.println(this.B+"B");
		System.out.println("Sum is A+B  :="+ (this.A + this.B));
		
	}
	

}

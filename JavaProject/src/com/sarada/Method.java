package com.sarada;

public class Method {
	public void sriman() {
		System.out.println("skugdf");
	}

	public void mahesh() {
		sriman();
		System.out.println(sriman1());
	}

	public String sriman1() {
		return "hjzdg";
	}

	public String mahesh1() {
		sriman();
		return sriman1();
	}

	public static void main(String[] args) {
		Method m = new Method();
		//System.out.println(m.sriman1());
		//System.out.println(m.mahesh1());
		m.mahesh();
	}
}

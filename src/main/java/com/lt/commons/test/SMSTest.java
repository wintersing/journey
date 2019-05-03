package com.lt.commons.test;

public class SMSTest {

	public static void main(String[] args) {
		for (int i = 0; i < 30; i++) {
			System.out.println(SMSrandom());
		}
	}
	
	private static int SMSrandom() {
		return (int)(111111+Math.random()*888889);
	}
}

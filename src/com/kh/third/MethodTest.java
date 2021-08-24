package com.kh.third;

public class MethodTest {

	public static void main(String[] args) {
		
		System.out.println("메인 메소드 실행 시작!!");
		
		/*
		testPrintA();
		testPrintB();
		testPrintC();
		 */
		
		printMethodA();
		
		// 두 실행 결과는 동일하지만 어디서 어떤 메소드를 호출하느냐에 따라 다르다.
		// 이런 식으로 메소드를 기능별로 만들어서 필요할 때마다 호출하면 된다.
		
	}
	
	
	public static void printMethodA() {
		
		System.out.println("A 메소드 실행중~~");
		
		PrintMethodB();
	}
	
	public static void PrintMethodB() {
		
		System.out.println("B 메소드 실행중~~");
		
		PrintMethodC();
	}
	
	public static void PrintMethodC() {
		
		System.out.println("C 메소드 실행중~~");
		
		// testPrintA(); // 무한대로 돌아가서 오류가 난다.
	}
	
}

package com.kh.third;

public class MethodTest {

	public static void main(String[] args) {
		
		System.out.println("���� �޼ҵ� ���� ����!!");
		
		/*
		testPrintA();
		testPrintB();
		testPrintC();
		 */
		
		printMethodA();
		
		// �� ���� ����� ���������� ��� � �޼ҵ带 ȣ���ϴ��Ŀ� ���� �ٸ���.
		// �̷� ������ �޼ҵ带 ��ɺ��� ���� �ʿ��� ������ ȣ���ϸ� �ȴ�.
		
	}
	
	
	public static void printMethodA() {
		
		System.out.println("A �޼ҵ� ������~~");
		
		PrintMethodB();
	}
	
	public static void PrintMethodB() {
		
		System.out.println("B �޼ҵ� ������~~");
		
		PrintMethodC();
	}
	
	public static void PrintMethodC() {
		
		System.out.println("C �޼ҵ� ������~~");
		
		// testPrintA(); // ���Ѵ�� ���ư��� ������ ����.
	}
	
}

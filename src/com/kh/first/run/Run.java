package com.kh.first.run;

import com.kh.first.MethodTest; // �ش� ��Ű���� �ִ� Ŭ������ ������ ���ڴ� ��� ������ �κ� 

public class Run {

	public static void main(String[] args) {
		
		/*
		 * ���� Ŭ������ �޼ҵ带 ȣ���� ���� �ܼ��� ȣ�⸸ �ϸ� �Ǿ���.
		 * �޼ҵ��();
		 * 
		 * �׷��� �ٸ� Ŭ������ �޼ҵ带 ȣ���� ��쿡��?
		 * 
		 */
		
		System.out.println("���� �޼ҵ� ���� ����!!");

		// 1. ȣ���� �޼ҵ尡 �ִ� Ŭ���� (Ʋ)�� ���� �༮�� ���� (������ ����) ���ش�.
		//[ǥ����]
		//Ŭ������ �༮�� �̸� = new Ŭ���� �̸�();
		MethodTest mt = new MethodTest(); //new ��� �ܾ ����.
		
		//���� ���� �ַ� �� ����***
		
		// => �⺻������ ���� com.kh.first.run ��Ű�� �ȿ� MethodTest ��� Ŭ������ �������� �ʾƼ�
		// ã�� �� �� ���� ������ import �������� ã���� ��.
		
		// �̰� import �Ⱦ��� �ϴ°�����..���� �� �� ����***
		//com.kh.first.MethodTest mt = new com.kh.first.MethodTest();
		
		// 2. ���� �� ���� �ش� Ŭ������ �ִ¸޼ҵ带 ȣ�����ָ� �ȴ�.
		// [ǥ����]
		// ������ �༮�� �̸�. ȣ���� �޼ҵ� �̸�();
		
		mt.testPrint();
	}
}

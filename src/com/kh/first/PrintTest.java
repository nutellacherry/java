package com.kh.first;

public class PrintTest {

	//��¹� �ǽ�
	public static void main(String[] args) {
		
		System.out.println("println�� �ٹٲ�");
		
		System.out.print("print�� �ٹٲ�X\n"); // ���ڿ�(����)�� ���� �ֵ���ǥ�� ���´�
		
		System.out.print(12345 + "\n"); // ������ ���� �׳� �����ش�
		
		System.out.print('A' + "\n"); // ������ ���� Ȧ����ǥ�� ���´�
		
		//�ٹٲ��� �ϰ������ print ���� ����ϴ� ��쿡��?
		System.out.print("�ٹٲ��� �ϰ�;�!!!!\n");
		System.out.print("�ٹٲ� ������!!!!\n");
		
		// \n : ���๮��, �ٹٲ� �����ִ� ����, �� ����Ű�� ���� �� �� ����.
		// ����=>����+����, ����+���ڿ�, ����+���ڿ� �� ���� ���� �ٸ� ���¸� �ٿ��� ��Ÿ���ִ� ��ȣ�� +

		System.out.print("Hi\n");
		
		System.out.print("Everyone!!");
		
		System.out.print("\nHi \nEveryone!!\n"); // ���๮�ڴ� ���� �߰��� �ƹ������� ���� �� �ִ�.
		
		System.out.print("\\n"); // \n ��ü�ε� ����� �ȴ�.
		
		System.out.println();
		
		System.out.println("123\n456");
		
		System.out.println(123 + "\n" + 456);
		
		System.out.println(123);
		System.out.println(456);
		
		//�������ô� �� ���������� ���ڷ� �ν��� ���� �ʱ� ������ ���ڷ� �ν��ϰ� ���� ��쿡�� �������ø� �� �� �� ����
		System.out.println("\\");
	}
}

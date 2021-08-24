package com.kh.first.run;

import com.kh.first.MethodTest; // 해당 패키지에 있는 클래스를 가져다 쓰겠다 라고 선언한 부분 

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 같은 클래스의 메소드를 호출할 때는 단순히 호출만 하면 되었다.
		 * 메소드명();
		 * 
		 * 그런데 다른 클래스의 메소드를 호출할 경우에는?
		 * 
		 */
		
		System.out.println("메인 메소드 실행 시작!!");

		// 1. 호출할 메소드가 있는 클래스 (틀)을 가진 녀석을 생성 (복사라고 생각) 해준다.
		//[표현법]
		//클래스명 녀석의 이름 = new 클래스 이름();
		MethodTest mt = new MethodTest(); //new 라는 단어를 쓴다.
		
		//위에 것을 주로 쓸 것임***
		
		// => 기본적으로 현재 com.kh.first.run 패키지 안에 MethodTest 라는 클래스가 존재하지 않아서
		// 찾을 수 가 없기 때문에 import 문장으로 찾아준 것.
		
		// 이건 import 안쓰고 하는거지만..자주 안 쓸 것임***
		//com.kh.first.MethodTest mt = new com.kh.first.MethodTest();
		
		// 2. 생성 후 이제 해당 클래스에 있는메소드를 호출해주면 된다.
		// [표현법]
		// 생성한 녀석의 이름. 호출할 메소드 이름();
		
		mt.testPrint();
	}
}

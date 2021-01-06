package ch04;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 문제 1) 무한 루프를 사용하여 화면 UI가 매번 출력될 수 있도록 하고 사용자의 입력에 의해서 프로그램이 종료되는 기능을 가지고 있는 구구단출력 프로그램 작성
// 		1. 종료 여부 입력
//		2. 출력할 단수 입력
//		3. next() : 엔터키가 입력될때까지 입력된 데이터를 문자열로 입력받음
//		4. 문자열 비교 : 문자열변수.equals("비교할 문자열");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 출력 프로그램입니다.");
		while (true) {
//			구구단을 출력하기 윈한 로직
			System.out.print("출력할 단수를 입력하세요 : ");
			int dan = sc.nextInt();
			
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
//			프로그램을 종료하기 위한 로직
			System.out.println("종료하시겠습니까?(y/n) : ");
			String exit = sc.next();
//			equals() : 동일한 문자열일 경우 true출력 
			if (exit.equals("y")) {
				break;
			}
		}
		System.out.println("구구단을 종료합니다.");
		sc.close();
		}	
	}
	

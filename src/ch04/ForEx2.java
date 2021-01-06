package ch04;

import java.util.Scanner;


public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제 1 ) for 문을 사용하여 사용자가 입력한 숫자의 구구단을 출력하는 프로그램을 작성하세요
//		import java.util.Scanner; 포함
//		Scanner sc = new Scanner(System.in);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("출력할 단수를 입력하세요 : ");
		
//		사용자 입력을 받은 데이터 저장
		int dan = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(dan + "*" + i + "=" + dan*i);
		}
		
//		사용자 입력을 위한 scanner 클래스를 메모리에서 해제
		sc.close();
		
	}

}

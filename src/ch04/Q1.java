package ch04;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		문제 1) 랜덤 숫자를 0 ~ 9까지 숫자를 1개 생성하고 사용자의 입력을 하나 받아서 컴퓨터가 저장한 숫자와 같을 경우 '맞췄다'라고 출력, 
//		다를 경우 '꽝, 다음기회를' 이라는 문장을 출력하는 프로그램을 작성하세요
		
//		랜덤 숫자 : Math.random() : 0.0 ~ 0.9까지 출력
//		(int)(Math.random() * 최대값) + 최소값
		
//		사용자 입력 : import java.util.Scanner;
//		Scanner sc = new Scanner(System.in);
//		sc.next(); 공백 문자가 나올때까지의 문자를 입력받음
//		sc.nextInt() : 공백문자가 나올때까지의 숫자를 입력받음
		Scanner sc = new Scanner(System.in);
		
		int comNum = (int)(Math.random() * 9) + 1;
		int userNum = 0;
		
		System.out.print("숫자를 입력하세요 : ");
		userNum = sc.nextInt();
		
		if (comNum == userNum) {
			System.out.println("숫자를 맞췄습니다.");
			
		}
		else {
			System.out.println("꽝, 다음기회를....");
			System.out.println("컴퓨터의 숫자 : " + comNum + "\n내가 선택한 숫자 : " + userNum);
		}
		sc.close();
	}
	

}

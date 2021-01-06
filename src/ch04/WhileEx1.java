package ch04;

import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		109페이지 예제 및 입력한 단수의 구구단 출력하기
		System.out.println("----- while문 1부터 10까지 더하기 -----");
		
		int num = 1;
		int sum = 0;
		
		while(num <= 10) {
			sum += num;
			num++;
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다");
		
		System.out.println("----- while문 구구단 -----");

		Scanner sc = new Scanner(System.in);
		int dan = 0;
		
		System.out.print("출력할 단수를 입력하세요 : ");
		dan = sc.nextInt();
		
		int count = 1;
		while (count < 10) {
			System.out.println(dan + "*" + count + "=" + dan*count);
			count++;
		}
		sc.close();
	}

}

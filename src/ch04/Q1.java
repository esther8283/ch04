package ch04;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		���� 1) ���� ���ڸ� 0 ~ 9���� ���ڸ� 1�� �����ϰ� ������� �Է��� �ϳ� �޾Ƽ� ��ǻ�Ͱ� ������ ���ڿ� ���� ��� '�����'��� ���, 
//		�ٸ� ��� '��, ������ȸ��' �̶�� ������ ����ϴ� ���α׷��� �ۼ��ϼ���
		
//		���� ���� : Math.random() : 0.0 ~ 0.9���� ���
//		(int)(Math.random() * �ִ밪) + �ּҰ�
		
//		����� �Է� : import java.util.Scanner;
//		Scanner sc = new Scanner(System.in);
//		sc.next(); ���� ���ڰ� ���ö������� ���ڸ� �Է¹���
//		sc.nextInt() : ���鹮�ڰ� ���ö������� ���ڸ� �Է¹���
		Scanner sc = new Scanner(System.in);
		
		int comNum = (int)(Math.random() * 9) + 1;
		int userNum = 0;
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		userNum = sc.nextInt();
		
		if (comNum == userNum) {
			System.out.println("���ڸ� ������ϴ�.");
			
		}
		else {
			System.out.println("��, ������ȸ��....");
			System.out.println("��ǻ���� ���� : " + comNum + "\n���� ������ ���� : " + userNum);
		}
		sc.close();
	}
	

}

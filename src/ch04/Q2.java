package ch04;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// ���� 1) ���� ������ ����Ͽ� ȭ�� UI�� �Ź� ��µ� �� �ֵ��� �ϰ� ������� �Է¿� ���ؼ� ���α׷��� ����Ǵ� ����� ������ �ִ� ��������� ���α׷� �ۼ�
// 		1. ���� ���� �Է�
//		2. ����� �ܼ� �Է�
//		3. next() : ����Ű�� �Էµɶ����� �Էµ� �����͸� ���ڿ��� �Է¹���
//		4. ���ڿ� �� : ���ڿ�����.equals("���� ���ڿ�");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��� ���α׷��Դϴ�.");
		while (true) {
//			�������� ����ϱ� ���� ����
			System.out.print("����� �ܼ��� �Է��ϼ��� : ");
			int dan = sc.nextInt();
			
			for (int i = 1; i < 10; i++) {
				System.out.println(dan + "*" + i + "=" + dan * i);
			}
//			���α׷��� �����ϱ� ���� ����
			System.out.println("�����Ͻðڽ��ϱ�?(y/n) : ");
			String exit = sc.next();
//			equals() : ������ ���ڿ��� ��� true��� 
			if (exit.equals("y")) {
				break;
			}
		}
		System.out.println("�������� �����մϴ�.");
		sc.close();
		}	
	}
	

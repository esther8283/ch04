package ch04;

public class IfEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Math.random() : 자바 수학 관련 클래스에서 0.0 ~ 1.0미만의 임의의 숫자를 반환하는 메서드
//		Math.random() * 20은 0에서 ~ 20까지의 임의의 숫자 출력
		int score = (int)(Math.random() * 20) + 81;
		System.out.println(score);
		
		String grade;
		
		if (score >= 90) {
			if (score > 95) {
				grade = "A+";
			}
			grade = "A";
		}
		else {
			if (score > 85) {
				grade = "B+";
			}
			else {
				grade = "B";
			}
		}
		System.out.println("당신의 학점은 " + score + "이고, 등급은" + grade);
	}

}

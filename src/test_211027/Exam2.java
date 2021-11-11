package test_211027;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		boolean run = true;

		System.out.println("=======================");
		System.out.println("프로그램 : 사칙연산");
		System.out.println("작성자    : @@@");
		System.out.println("작성일    : 2021-10-27");
		System.out.println("=======================");

		while(run) {
			System.out.print("첫번째 정수입력: ");
			int num1 = sc.nextInt();
			System.out.print("두번째 정수입력: ");
			int num2 = sc.nextInt();
			System.out.print("연산자 선택(1.더하기 2.빼기 3.곱하기 4.나누기) > ");
			int a = sc.nextInt();
			
			String op = "";
			int result1 = 0;
			double result2 = 0.0;
			
			switch(a) {
			case 1 :
				result1 = num1+num2; op = "+";
				break;
			case 2 :
				result1 = num1-num2; op = "-";
				break;
			case 3 :
				result1 = num1*num2; op = "*";
				break;
			case 4 :
				result2 = (double)num1/num2; op = "/";
				break;
		    default :
		    	run = false;
		    	break;
			}
			
			String message = "결과: "+num1+op+num2+"=";
			
			if(op.equals("/")) {
				message += result2;
			}else {
				message += result1;
			}
			System.out.println(message);
			
			System.out.print("계속 진행하시겠습니까?(y or n 선택) > ");
//			sc.nextLine(); // 버퍼비우기
			
			String b = sc.next();
			System.out.println();
			
			if(b.equals("y")) {
				run = true;
			}else if(b.equals("n")) {
				run = false;
			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}

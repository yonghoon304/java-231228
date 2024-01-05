package c_Chapter02;

import java.util.Scanner;

//		조건문 (Condition)
//		:프로그램의 흐름을 제어하는 데 사용되는 기본적인 구조 중 하나
//		자바의 조건문 종류
//		if , else , else if, switch


public class A_If {

	public static void main(String[] args) {
//		If문
//		조건에 따라 실행시키고자 하는 로직이 다를 때 사용하는 구문
		
//		조건이 true 일 때 실행할 코드를 지정하는 구문
//		if문 기본 구조
//		if (조건) {
//			:조건이 true일 때 실행할 코드
//		}
				int age = 20;
				if (age > 19) {
					System.out.println("성인입니다");  //조건이 false라서 실행이 안됨
					
				}
				System.out.println("조건 검사 완료");
//		int age1 = 20;
//		if (age1 > 19) {
//			System.out.println("성인입니다.");
//		}

		
//		2. if - else
//		:조건이 true일 경우와 false일 때 실행되는 코드를 각각 지정한 구문
//		if 문의 조건이 거짓일 경우에만 실행할 코드블럭을 결정
//		if (age > 19) {
//			System.out.println("성인입니다.");
//		}
//		else { 
//			System.out.println("미성년자입니다.");
//		if 문의 경우 코드 블럭에 오는 코드가 하나의 구문이면 {}생략가능 + 실행코드가 한 줄 일 경우만 사용 가능.
		if (age>21) System.out.println("성인입니다");
		else System.out.println("미성년자입니다");
		
//		3.중첩 if문
//		if (age <=19 )System.out.println("미성년자입니다.");
//			if (age <=13) System.out.println("어린이입니다.");
//			else System.out.println("청소년입니다.");
//		else System.out.println("성인입니다.");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("나이를 입력하세요.");
//		age = sc.nextInt();
//		if (age <= 19) {
//			System.out.println("미성년자입니다.");
//		}if(age <=13) 
//			System.out.println("어린이입니다.");
//			}else {
//					System.out.println("청소년입니다.");
//				}
//		}else {
//			System.out.println("성인입니다.");
//		}
		
//		4.else if 문
//		여러 조건을 순차적으로 테스트할 때 사용
		if (age > 19) {
			System.out.println("성인입니다");
		}else if (age<=13) {
				System.out.println("어린이입니다");
		}else {
				System.out.println("청소년입니다 .");
		}
		
//		예제 실습 학점 계산기
//		점수가 0~100점
//		90~100:A
//		80~89 :B
//		70~79:C
//		60~69 : D
//		59미만 : F
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하시오.");
		int score = scanner.nextInt();
//		여러 문자열을 담는 참조형 데이터 타입 String
		String result;
		if (score < 0 || score >100 ) {
			System.out.println("점수는 0~100점 사이어야 합니다.");
			result = "계산 불가";
		}else if (score > 89) {
			System.out.println("90점대 입니다.");
			result = "A";
		}else if (score >79) {
			System.out.println("80점대 입니다.");
			result = "B";
		}else if (score >69) {
			System.out.println("70점대 입니다.");
			result = "C";
		}else if (score >59) {
			System.out.println("60점대 입니다.");
			result = "D";
		}else {
			System.out.println("0~59점대 입니다.");
			result ="F";
		}
		System.out.println("결과는 : "+result);
		
//		if문 예제 실습 함수 위치 구하기. x,y좌표 받고 1~4사분면
		Scanner functionData = new Scanner (System.in);
		int x=0;
		int y=0;
		String funcResult =null;
//		변수에 직접적인 데이터 넣지 않기. 해당 데이터가 저장된 메모리 주소 초기화하지않고 사용시 컴파일 오류 발생.
//		기본 초기화 값 - null >>메모리상 어떠한 데이터 객체도 담고 있지 않음.
		
		System.out.println("x값을 입력하세요.");
		x= functionData.nextInt();
		System.out.println("y값을 입력하세요.");
		y= functionData.nextInt();
		
		if (x>0 &&y>0) {
			System.out.println("x와 y둘 다 양수입니다.");
			funcResult ="1사분면";
		}else if (x <0 && y>0 ) {
			System.out.println("x는 음수,y는 양수입니다.");
			funcResult = "2사분면";
		}else if (x <0 && y<0 ) {
			System.out.println("x와 y둘 다 음수입니다.");
			funcResult = "3사분면";
		}else if (x >0 && y<0 ) {
			System.out.println("x는 양수,y는 음수입니다.");
			funcResult = "4사분면";
		}else {
			System.out.println("x 또는 y가 0입니다.");
			funcResult="절편";
		}
		System.out.println("결과는 "+funcResult+"입니다");
	}
}

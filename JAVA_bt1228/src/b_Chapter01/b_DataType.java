package b_Chapter01;

public class b_DataType {

	public static void main(String[] args) {
		// 데이터 타입 (자료형, DataType)
// 		자바는 강 탕비 언어로, 모든 변수 선언 시 데이터 타입을 명시

//		1. 데이터 타입의 종류 
//		기본 타입 (자바에서 미리 정의된 타입, 변수를 선언하면 해당되는 자료형의 크기 만큼 메모리 할당 )
//		참조 타입 ( 객체의 참조,메모리 주소를 저장하는 변수 타입)

//		2. 기본 자료형
//		총 8가지 기본형 타입
		/*
		 * 정수타입 byte : 1바이트 정수 값의 범위 : (-128~127) short 2바이트 정수 (-32,768~32,767)
		 * int(기본형) 4바이트 정수 ( 약 -2.1억~약2.1억) long 8바이트 (약-2의 63제곱 ~ 약 2의 63제곱)
		 */
		int age = 27;
		System.out.println(age);
		
//		long 데이터 타입은 숫자 뒤에 알파벳 L 또는 1을 써서 long형임을 표시
		long apartmentPrice = 1000000000L;
		
//		문자형
//			char : 하나의 문자를 저장하기 위한 변수를 선언할 때 사용
		char grade = 'A';
		char lastName ='최';
		System.out.println(grade);
		
//		실수형
//			float : 4바이트 소수점 숫자 뒤에 알파벳 F를 써서 float형임을 표시
//			double(기본) 8바이트 소수점
		float height = 169.2F;
		double price = 19.5;
		
//		논리형
//		true false 1바이트, 소문자 값 사용을 권장
//		is 키워드를 사용하여 해당 여부가 참인지 거짓인지 등을 표현
		boolean isMarried = false;
		boolean isActived = true; 
		
//		3. 참조 자료형
//		: 기본 자료형을 기초로 만들어진 자료형
//		: 실제 값을 갖는 것이 아닌 데이터가 저장된 메모리의 '주소 값'을 가지는 자료형 
//		- 종류
//			 String : 문자열을 저장하는 데 사용되는 참조 자료형
//			 Array : 배열을 나타내는 참조 자료형
//			 Map : 
		
	
	}

}

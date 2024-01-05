package b_Chapter01;

//		자바의 연산자
//		: 산술 연산자, 대입 연산자, 비교 연산자, 논리 연산자, 삼항 연산자

public class E_Operator {
		public static void main(String[] args) {

//			1. 산술 연산자
//			덧셈 연산자 (+) : 좌항에 우항을 더한 값을 반환
			int addResult =8+3;
//			System.out.println(addResult);
//			뺄셈 연산자 (-) : 좌항에 우항을 뺀 값을 반환
			int minusResult = 8-3;
//			곱셈 연산자 (*) : 좌항에 우항을 곱한 값을 반환
			int multiResult = 8*3;
//			나눗셈 연산자(/) : 좌항에 우항을 나눈 값을 반환
			int dividerResult = 8/3;
			
			 System.out.println(addResult);
			 System.out.println(minusResult);
			 System.out.println(multiResult);
			 System.out.println(dividerResult);
			 
//			 나머지 연산자(%) : 좌항에 우항을 나눈 나머지를 반환
			 int remainderResult=8%3;
			 System.out.println(remainderResult);
			 
//			 해당 수가 2의 배수인지를 확인
//			 해당 수를 2로 나눠서 나머지가 0인 경우 확인 가능
			 
//			 2. 증감 연산자
//			 변수 그 자신에 1증가 또는 감소
//			 상수에는 증감 연산자 사용 불가
			 final int NUMBER = 10;
//			 System.out.println(++NUMBER); - ERROR
			
			 
//			 증가 연산자 (++) 연산자의 조항 혹은 우항의 값을 1증가시킴
			 int integer = 10;
			 System.out.println(++integer); //증가되었음 >>즉각 증가
			 System.out.println(integer++); //증가 X >> 이후 증가
			 System.out.println(integer);
//			 감소 연산자 (--)
//			 증가연산자와 같은 매커니즘
			 
			 int num1=8;
			 int num2=3;
			 int sampleNumber = num1/--num2; //8/2
			 System.out.println(sampleNumber);
			 
//			 3. 대입 연산자
//			 = 우항의 값을 좌항에 (누적)대입
//			 좌항의 변수에 좌항 변수와 우항을 연산한 결과를 대입
			 
//			 =: 좌항에 우항을 대입
			 int num = 10;
//			 += : 좌항에 우항을 더한 값을 좌항에 대입
			 num += 3 ; // num = num+3;
//			 -=    *=   /=   %=
			 num -=6 ; // 13- 6 = 7
			 num *= 3; // 7*3 = 21
			 num /= 5; // 21/5 = 4
			 num %=3 ; // 4%3 = 1
			 System.out.println(num);
			 
//			 대입 연산자의 좌항에는 반드시 변수만 지정 가능
			 
//			 4. 비교 연산자
//			 :좌항을 우항과 비교한 결과를 논리(true,false) 값으로 반환
			 
//			 == : 좌항과 우항이 같으면 true 아니면 false 반환
			 boolean bool1 = 10 == 12;
			 System.out.println(bool1);  //false
//			 != : 좌항과 우항이 다르다면 true ,아니면 false
			  boolean bool2 = 10!= 12; // true
			  System.out.println(bool2);
			 
//			  > , >=
			  boolean bool3 = 10 > 10; //false
			  boolean bool4 = 10 >= 10 ; //true
			  System.out.println(bool3);
			  System.out.println(bool4);
//			  <,<=
			  boolean bool5 = 10 <10; //false
			  boolean bool6 = 10<=10; //true
			  System.out.println(bool5);
			  System.out.println(bool6);           // 줄 복사 ctrl + alt + 방향키
			  
//			  5. 논리 연산자
//			  : 논리(boolean) 값을 연산하는 연산자
			  
//			  &&(엔퍼샌드) : And 연산자  >>좌항과 우상이 모두 true 일때 true, 하나라도 false이면 false
			  int andOper1 = 8;
			  int andOper2 = 3;
			  boolean andBool1 = (andOper1> andOper2)&& true ;
			  boolean andBool2 = (andOper1<andOper2)&& true ;
			  System.out.println(andBool1);
			  System.out.println(andBool2);
//			  || (vertical bar) : Or 연산자
//			  :  좌항과 우항 중 하나라도 true이면 true 모두 false이면 false
			  int orOper1 =5;
			  int orOper2 =7;
			  boolean orBool1 = (orOper1 < orOper2) || true ;// true;
			  boolean orBool2 = (orOper1 > orOper2) || true ;// true;
			  boolean orBool3 = (orOper1 > orOper2) || false ;// false ;
			  System.out.println(orBool1);
			  System.out.println(orBool2);
			  System.out.println(orBool3);
			  
//			   ! (not) 연산자 : 논리값의 부정을 반환
			  System.out.println(!orBool1);
			  boolean notBool1 = true;
			  boolean notBool2 = false;
			  System.out.println(!notBool1);
			  System.out.println(!notBool2);
			  
			  
		}
}

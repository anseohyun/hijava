
public class Variable2 {

	public static void main(String[] args) {
		// 현금이 1000원 있다.
		// 200원짜리 과자를 구입 후 잔돈 출력
		
		int 현금 = 1000;
		int 과자 = 200;
		int 잔돈 = 현금 - 과자;
		
		System.out.println("잔돈:"+ 잔돈);
		
		// 데이터 변경 
		과자 = 500;
		
		잔돈 = 현금 - 과자;
		System.out.println("잔돈:"+ 잔돈);
		
		// 가로가 3이고 세로가 6인 삼각형 넓이
		int 가로 = 3;
		int 세로 = 6;
		
		int 넓이 = 가로 * 세로 / 2;
		System.out.println(넓이);
		
		// 변수의 규칙 
		// 숫자로 시작 X
		// 특수문자 _ 만 사용 
		// 키워드는 사용할 수 없다(자주색,파란색)
		// 대소문자 구별
		
		// 문제1)
		// 수학 30 국어 50 영어 4점 받았다.
		// 총점과 평균을 구하세요!
		
		int 수학 = 30;
		int 국어 = 50;
		int 영어 = 4;
		int 총점 = 수학+국어+영어;
		int 평균 = 총점 / 3;
		System.out.println("총점:"+총점+"평균:"+평균);
		
		
		// 문제2)
		// 월급이 150만원
		// 연봉? (조건 세금10%제외)
		
		// 변수를 두개 이상 만들 경우 사용법
		double 월급 =150,연봉=0.0;

		연봉 = 월급*12*0.9;
		System.out.println(연봉);
		
		// 값 교체하기 
		int x = 10;
		int y = 20;
		int t;
		
		t = x;	 //빈공간만들고 	
		x = y;   // 데이터를 변경
		y = t;
		
		// 새로운값이 저장되면 이전의 값이 사라진다.
		// 같은 이름을 쓸 수 없다.
		
		// 비교 연산자
		// - 비교를 해서 결과 값이 true , false
		
		System.out.println(x+ " " + y);
		
		// > 크니?  
		System.out.println(x > y);
		
		// >= 크거나 같니?
		System.out.println(x >= y);
		
		// = 저장 == 비교 같니?
		System.out.println(x == y);
		
		// != 다르니? 
		System.out.println(x != y);
		
		// 문제1)
		// 점수가 80이고 합격인지 불합격인지 true,false
		// 결과를 출력 ( 합격점수: 60점이상 )
		int score = 80;
		
		System.out.println("합격:"+(score >= 60));
		
		// 문제2)
		// 숫자가 3의 배수이면 true , false
		// 힌트 숫자 % 3 == 0
		
		int 숫자 = 10;
		int 숫자2 = 6;
		
		System.out.println(숫자 % 3 == 0);
		System.out.println(숫자2 % 3 == 0);
		
		// 논리연산자 
		// 종류
		// &&(and) :양쪽 모두 참이어야 참
		// ||(or)  :어느 한쪽이라도 참이면 참!
		
		// 역할 
		// 1) 여러개의 비교 연산자를 연결할 수있다.
		// 2) 범위 설정이 가능하다.
		
		System.out.println(10 == 10 && 3 == 3);
		System.out.println(10 != 10 && 3 == 3);
		
		System.out.println(10==10 || 3 == 3);
		System.out.println(10 != 10 || 3 == 3);
		
		
		
	}
}
//주소로 이루어져있다. 16진수 
// 0x1234 -> 문자로 입력

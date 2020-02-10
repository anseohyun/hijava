
public class OpEx {

	public static void main(String[] args) {
		// && , ||
		// 예제1) 3의 배수 이면서, 짝수이면 true출력
		
		int num = 12;
		System.out.println(num%3 == 0 && num%2==0);
		
		// 문제1)
		// 3과목의 평균이 60점 이상이면 true
		// 단! 한과목이라도 50점 미만이면 false
		
		int 수학 = 60;
		int 영어 = 100;
		int 국어 = 41;
		
		double avg = (수학+영어+국어)/3;
		
		System.out.println(avg >= 60 && 국어 >= 50
				&& 수학 >= 50 && 영어>=50);
		
		// 문제2) 
		// 키가 200cm이상이거나 몸무게가 200kg 이상이면
		// 입장(true) || (or)
		
		int 몸무게; //임의로 작성 true
		int 키;	
				
		
	}
}
	
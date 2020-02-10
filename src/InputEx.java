import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		/*
		 * 입력받기 
		 *  - 키보드로 입력받기
		 *  - import java.util.Scanner;
		 *  - java.util 폴더(패키지) 안에 scanner클래스
		 *  - 파일을 현재 페이지로 불러온다. 
		 *  - sc 변수에 저장한다.
		 * 
		 * 안내메시지 작성한다.
		 * 입력받는다.
		 * 
		 * 입력 초록색 
		 * 출력 검은색
		 */
		Scanner a = new Scanner(System.in);
		
		// 나이를 입력받는 구문 작성
		System.out.println("나이>");
		int age = a.nextInt();
		
		System.out.println("입력하신 나이:"+age);
		
		// 두개의 정수를 입력받아서 합을 구하는 출력
		
		System.out.println("정수1");
		int num1 = a.nextInt();
		
		System.out.println("정수2");
		int num2 = a.nextInt();
		
		System.out.println("더한값:"+(num1+num2));
		
		// 문제1)
		// 숫자 1개를 입력받아서 
		// 홀수이면 true출력
		
				
		// 문제2)
		// 성적을 입력받아서 60점 이상이고 100이하
		// 이면 true출력 
		
		int number = a.nextInt(); 
		System.out.println("성적:"+(number >= 60 && number <= 100));
		
		//clinihi@naver.com
		// 주말에 메일 보내시면 됩니다.
		
		
		
		
		
		
	}
}

import java.util.Scanner;

public class InputEx {

	public static void main(String[] args) {
		/*
		 * �Է¹ޱ� 
		 *  - Ű����� �Է¹ޱ�
		 *  - import java.util.Scanner;
		 *  - java.util ����(��Ű��) �ȿ� scannerŬ����
		 *  - ������ ���� �������� �ҷ��´�. 
		 *  - sc ������ �����Ѵ�.
		 * 
		 * �ȳ��޽��� �ۼ��Ѵ�.
		 * �Է¹޴´�.
		 * 
		 * �Է� �ʷϻ� 
		 * ��� ������
		 */
		Scanner a = new Scanner(System.in);
		
		// ���̸� �Է¹޴� ���� �ۼ�
		System.out.println("����>");
		int age = a.nextInt();
		
		System.out.println("�Է��Ͻ� ����:"+age);
		
		// �ΰ��� ������ �Է¹޾Ƽ� ���� ���ϴ� ���
		
		System.out.println("����1");
		int num1 = a.nextInt();
		
		System.out.println("����2");
		int num2 = a.nextInt();
		
		System.out.println("���Ѱ�:"+(num1+num2));
		
		// ����1)
		// ���� 1���� �Է¹޾Ƽ� 
		// Ȧ���̸� true���
		
				
		// ����2)
		// ������ �Է¹޾Ƽ� 60�� �̻��̰� 100����
		// �̸� true��� 
		
		int number = a.nextInt(); 
		System.out.println("����:"+(number >= 60 && number <= 100));
		
		//clinihi@naver.com
		// �ָ��� ���� �����ø� �˴ϴ�.
		
		
		
		
		
		
	}
}

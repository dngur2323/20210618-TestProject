import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("2�ڸ��� �����Է�(10~99)>>");
		int a=scan.nextInt();
		
		if(a/10==a%10) {
			System.out.println("10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else
		{
			System.out.println("�����ʽ��ϴ�.");
		}

	}

}

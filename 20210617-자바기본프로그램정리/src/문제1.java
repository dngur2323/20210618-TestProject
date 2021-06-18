import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("2자리수 정수입력(10~99)>>");
		int a=scan.nextInt();
		
		if(a/10==a%10) {
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		}
		else
		{
			System.out.println("같지않습니다.");
		}

	}

}

import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("달을 입력하세요(1~12)>>");
		int mon=scan.nextInt();
		if(mon>=1 && mon<=12)
		{
			switch(mon)
			{
			case 3,4,5:
				System.out.println("봄");
				break;
			case 6,7,8:
				System.out.println("여름");
				break;
			case 9,10,11:
				System.out.println("가을");
				break;
			case 12,1,2:
				System.out.println("겨울");
				break;
			
			}

		}
		else
		{
			System.out.println("잘못입력했습니다.");
		}
		
	}

}

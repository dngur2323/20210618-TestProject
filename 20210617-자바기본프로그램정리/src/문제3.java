import java.util.Scanner;

public class ����3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���(1~12)>>");
		int mon=scan.nextInt();
		if(mon>=1 && mon<=12)
		{
			switch(mon)
			{
			case 3,4,5:
				System.out.println("��");
				break;
			case 6,7,8:
				System.out.println("����");
				break;
			case 9,10,11:
				System.out.println("����");
				break;
			case 12,1,2:
				System.out.println("�ܿ�");
				break;
			
			}

		}
		else
		{
			System.out.println("�߸��Է��߽��ϴ�.");
		}
		
	}

}

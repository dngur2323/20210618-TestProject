import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ�>>");
		int money=scan.nextInt();
		
		int a= money/50000;
		System.out.println("�������� "+a+"��");
		
		int b= money%50000/10000;
		System.out.println("������ "+b+"��");
		
		int c= money%50000%10000/1000;
		System.out.println("õ���� "+c+"��");
		
		int d= money%50000%10000%1000/100;
		System.out.println("100�� "+d+"��");
		
		int e= money%50000%10000%1000%100/50;
		System.out.println("50�� "+e+"��");
		
		int f= money%50000%10000%1000%100%50/10;
		System.out.println("10�� "+f+"��");
		
		int g= money%50000%10000%1000%100%50%10/1;
		System.out.println("�� "+g+"��");
	}
}

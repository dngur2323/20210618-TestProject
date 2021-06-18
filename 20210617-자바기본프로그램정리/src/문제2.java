import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("금액을 입력하시오>>");
		int money=scan.nextInt();
		
		int a= money/50000;
		System.out.println("오만원권 "+a+"매");
		
		int b= money%50000/10000;
		System.out.println("만원권 "+b+"매");
		
		int c= money%50000%10000/1000;
		System.out.println("천원권 "+c+"매");
		
		int d= money%50000%10000%1000/100;
		System.out.println("100원 "+d+"개");
		
		int e= money%50000%10000%1000%100/50;
		System.out.println("50원 "+e+"개");
		
		int f= money%50000%10000%1000%100%50/10;
		System.out.println("10원 "+f+"개");
		
		int g= money%50000%10000%1000%100%50%10/1;
		System.out.println("원 "+g+"개");
	}
}

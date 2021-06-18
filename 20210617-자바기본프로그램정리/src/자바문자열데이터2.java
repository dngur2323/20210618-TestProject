import java.util.Scanner;

/*
 *    charAt(int) : 문자열중에 문자한개를 추출==> char
 *    
 *    String s="Hello Java";
 *    
 */
public class 자바문자열데이터2 {

	public static void main(String[] args) {
		
		/*
		 * String s="Hello Java!!"; System.out.println("첫번째 문지:"+s.charAt(0));
		 * System.out.println("6번째 문지:"+s.charAt(6));
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("알파벳 여러개 입력:");
		String data =scan.next();
		System.out.println("받은 데이터:"+data);
		int count=0;
		for(int i=0;i<data.length();i++)
		{
			char c=data.charAt(i);
			//System.out.println(c);
			if(c=='A' || c=='a')
				count++;
		}
		System.out.println(count);
	}

}

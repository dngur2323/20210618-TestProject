import java.util.Scanner;

/*
 *    charAt(int) : ���ڿ��߿� �����Ѱ��� ����==> char
 *    
 *    String s="Hello Java";
 *    
 */
public class �ڹٹ��ڿ�������2 {

	public static void main(String[] args) {
		
		/*
		 * String s="Hello Java!!"; System.out.println("ù��° ����:"+s.charAt(0));
		 * System.out.println("6��° ����:"+s.charAt(6));
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.print("���ĺ� ������ �Է�:");
		String data =scan.next();
		System.out.println("���� ������:"+data);
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

import java.util.Scanner;

/*
 *   String : Ŭ����,���ڿ��� �����ϴ� ��������
 *            �������� ���ڿ��� ���ÿ� �����ϴ� ����
 */  
public class �ڹٹ��ڿ������� {

	public static void main(String[] args) {
		
		final String ID="admin";
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ID �Է�:");
		String myid=scan.next();
		
		
		System.out.print("��й�ȣ �Է�:");
		String mypwd=scan.next();
		
		if(ID.equals(myid) &&PWD.equals(mypwd))
		{
			System.out.println(myid+"�α��� ��");
		}
		else
		{
			System.out.println("�ȵ�");
		}
	}

}

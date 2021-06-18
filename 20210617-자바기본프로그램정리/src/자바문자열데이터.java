import java.util.Scanner;

/*
 *   String : 클래스,문자열을 저장하는 데이터형
 *            여러개의 문자열을 동시에 저장하는 형태
 */  
public class 자바문자열데이터 {

	public static void main(String[] args) {
		
		final String ID="admin";
		final String PWD="1234";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("ID 입력:");
		String myid=scan.next();
		
		
		System.out.print("비밀번호 입력:");
		String mypwd=scan.next();
		
		if(ID.equals(myid) &&PWD.equals(mypwd))
		{
			System.out.println(myid+"로그인 됨");
		}
		else
		{
			System.out.println("안됨");
		}
	}

}

/*
 *   int indexOf(����)
 *   Hello Java
 *   0123456789
 *   
 *   indexOf('o') ==> 4
 *   indexOf('a') ==> 7 ==>Ȯ���� a.java
 *   //ó������ ã��=>
 *   lastIndex('a') => �ڿ��� ã�� => 9 ==>\\ , / ��θ�
 *   
 *   ����� ���ʱ� �Ź�����45�� 50-9 �������� ���� ����� ���ʱ� ����� 35-8 ��������
 */
public class �ڹٹ��ڿ�������4 {

	public static void main(String[] args) {
		
		String addr="����� ���ʱ� �Ź�����45�� 50-9 �������� ���� ����� ���ʱ� ����� 35-8 ��������";
		String first=addr.substring(0,addr.indexOf("��"));
		System.out.println(first);
		// substring(3) => 3����
		// substring(3,9) => 3���� 9���� ��� => 9�� ���� ==> 3,4,5,6,7,8
		String s=addr.substring(addr.indexOf("��")+1);
		System.out.println(s.trim()); //�¿��� ���鹮�� ���� => trim()
	}

}

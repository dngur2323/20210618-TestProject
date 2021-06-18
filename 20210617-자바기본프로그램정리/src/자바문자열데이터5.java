/*
 *  낙지철판덮밥 8,000원 돼지철판덮밥 8,000원 돌솥비빔밥 7,500원 콩나물해장국 7,000원 항아리수제비 7,500워
 */
public class 자바문자열데이터5 {

	public static void main(String[] args) {
		String menu ="낙지철판덮밥 8,000원 돼지철판덮밥 8,000원 돌솥비빔밥 7,500원"
				+ " 콩나물해장국 7,000원 항아리수제비 7,500원";
		String[] s=menu.split("원");
		for(String m:s)
		{
			System.out.println(m.trim()+"원");
		}
	}

}

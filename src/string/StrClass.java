package string;

public class StrClass {

	public static void main(String[] args) {
		String str1="Vinayak";
		String str2="Sonar";
		String str3= new String("Sonar");
		String str4= new String("Sonar");
		str2.concat("test");
		System.out.println(str2);//u can change the 
		System.out.println(str2=str2.concat("text"));//u can change forceable
		System.out.println(str2.equals(str3));

	//== amd Equals method diff
		boolean yes=false;
		//if(str3==str4)//compares with object
			if(str3.equals(str4))//campares with  value
		
		{
			System.out.println(true);
		}
		else {
			System.out.println(yes);
		}
	}
		

}

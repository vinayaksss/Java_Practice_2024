package arrays;

public class Array1 {

	public static void main(String[] args) {
		
//----		
		int[] array= {10,23,45,34};
//----		
		int[] car= new int[3];
		car[0]=30;
		car[1]=34;
		car[2]=45;
//----
		
		Student[] array1=new Student[5];
		array1[0]=new Student("Vinayak", 23);

		array1[1]=new Student("Sonar", 26);

		array1[2]=new Student("Tuff", 29);

		array1[3]=new Student("Jack", 27);
		//array1[4]=new Student("Jack", 27);
		
		for(Student aray:array1) {
			
			aray.display();
			
			
		}
		
//-----		
		

	}

}

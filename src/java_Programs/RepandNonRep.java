package java_Programs;

public class RepandNonRep {

	public static void main(String[] args) {
		String str="vinayak";
		
	    for(int i=0;i<str.length();i++)
	    {
	int count=0;
	
	for(int j=0;j<str.length();j++)
	{
	if(str.charAt(i)==str.charAt(j)){

	    count++;
	}
	
	}
	
	if(count==1){
	    System.out.println("Non Repeated"+str.charAt(i));
	    
	    break;
	}
	    
	    
	    }
	
	}

}

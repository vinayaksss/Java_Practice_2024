import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		String str="I am name is vinayak";
        char[] st=str.toCharArray();
        HashMap<Character,Integer>hm=new HashMap<Character,Integer>();
        for(int i=0;i<st.length;i++){
            char ch=st[i];
            
            if(hm.containsKey(ch)){
                
                hm.put(ch,hm.get(ch)+1);
            }
            else{
                
                hm.put(ch,1);
            }
        }
        
System.out.println(hm);
	}

}

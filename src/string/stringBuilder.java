package string;

public class stringBuilder {
/*StringBuilder is a class in Java that provides mutable sequences of characters. Unlike String, which is immutable, StringBuilder allows for efficient manipulation of strings by appending, 
inserting, deleting, and replacing characters within the sequence*/
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("Dacchu");
		sb.insert(0,"Dboss");
		System.out.println(sb);
		sb.append(" Dbo");
		System.out.println(sb);
		sb.delete(12,15);
		System.out.println(sb);
		sb.replace(12, 15, "Vinnu");
		sb.reverse();
		//System.out.println(sb.ensureCapacity(0));
		
		//sb.capacity();
	}

}

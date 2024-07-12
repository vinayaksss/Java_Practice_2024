package Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.security.KeyStore.Entry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

import collections.Array;


public class FileReader{
	
public static void main(String arg[]) throws FileNotFoundException 

{
	
	File file= new File("C:\\Users\\svinayak\\Desktop\\text.txt");
	StringBuilder sb=new StringBuilder();
	Scanner sc= new Scanner(file);
	
	while(sc.hasNextLine()) {
		
		sb.append(sc.nextLine());
		
	}
	
	
	System.out.println(sb.reverse());
	
}

}
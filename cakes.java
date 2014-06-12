import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

	class Practice{
		
		Practice(){
			
			
			String hellop = "edcba";
			
			char[] helloc = hellop.toCharArray();
			Arrays.sort(helloc);
			System.out.println(helloc);
			
			String he = "aaaaccccssspod";
			
			char[] chara = he.toCharArray();
			Arrays.sort(chara);
			Set<Character>charSet = new LinkedHashSet<Character>();
			for(int i = 0; i< chara.length; i++){
				
				charSet.add(chara[i]);
				
			}
			System.out.println("chara: " + chara.toString());
			//String temp2 = "";
			/*for(int i = 0; i< chara.length; i++){
				
				temp2+=chara[i];
				
			}*/
			StringBuilder temp2 = new StringBuilder();
		    for (Character character : charSet) {
		        temp2.append(character);
		    }
			System.out.println(temp2);
			
			
			
			Hashtable table = new Hashtable(10);
			
			table.put("hello",10);
			int temp = (Integer)table.get("hello");
			table.put("h",4);
			
			table.put("hello", temp +23);
			
			Set<Character> dfs= new LinkedHashSet<Character>();
			
			dfs.add('a');
			dfs.add('b');
			dfs.add('a');
			System.out.println("dfs: " +dfs);
			
			String a = dfs.toString();
			String b ="";
			for(Character c : dfs){
				b = b+ c;
				
			}
			System.out.println(b);
			
			StringBuilder ss = new StringBuilder();
			
			
			
			
			Vector<String> hows = new Vector<String>();
			String how = "how are you my friend\nI am good thanks";
			Hashtable<Integer,String> wordtable = new Hashtable<Integer,String>(10);
			String[] lines = how.split("\n");
			for(int i =0; i<lines.length; i++){
				String[] words = lines[i].split(" "); 
				
				for(int j = 0; j <words.length; j++){
					//System.out.println(words[j] + " i: "+ i);
					hows.addElement(words[j]);
				}
				
			
			}
			for(int i =0; i<hows.size(); i++){
				//System.out.print(hows.elementAt(i));
				wordtable.put(i, hows.elementAt(i));
				
			}
			//if(table.contains(10)){
				
			Enumeration  enumera= wordtable.elements(); 
			while(enumera.hasMoreElements()){
				//System.out.println(enumera.nextElement());
				
			}
			
			//return 0;
		}
		
		
	}

	public class Cakes{
		
		
	
		public static long computePieces(long cuts){
			//BigInteger test=0;
			if(cuts == 1 ) return 0;
			
			long pieces =0, temp=0;
			
			if(cuts%2==0){
				pieces = (cuts/2) * (cuts/2);
			}else{
				temp = cuts/2; 
				pieces= temp*(temp+1);
			}
			
			
			return pieces;
		}
		
			public static void main(String[] args){
				
				//Vector<long>answers = new Vector<long>(10);
				
				ArrayList answers = new ArrayList();
				
				 long num_input =0;
				 	Scanner in = new Scanner(System.in); 
			       //System.out.printf("Enter number of inputs:  ");
				 	num_input= in.nextLong();
				 	long cuts =0;
			       while(num_input>0)
			       {
			    	   
			    	   cuts = in.nextLong();
			    	   answers.add(computePieces(cuts));
			    	   num_input--;
			       
			       }
			       
			       
			       for(int i =0; i< answers.size(); i++)
			       {	    	   
			    	   System.out.println(answers.get(i));
			       }
			     
		
			}
			
		
		}

import java.util.ArrayList;
import java.util.Scanner;




public class UtopianTree{
	
	public static long getHeight(long cycles){
		long height=1;
		long cycle=1;
		while(cycle<=cycles){
			
			if(cycle%2 ==0){
				height = height+1;
			}
			if(cycle%2!=0){
				
				height = height*2;
			}
			cycle++;
			
			//System.out.println("height: " + height + "cycle: "+ cycles);
		}
		return height;
		
	}
	
	
	public static void main(String[] args){
		long num_input;
		ArrayList answers = new ArrayList();
		//System.out.println("input: ");
		Scanner in = new Scanner(System.in); 
		num_input= in.nextLong();
		long cycles = 0;
		while(num_input>0){
	    	   
	    	   cycles = in.nextLong();
	    	   answers.add(getHeight(cycles));
	    	   num_input--;
	    	   //System.out.println(num_input);
	       
	       }
		for(int i =0; i< answers.size(); i++)
	       {	    	   
	    	   System.out.println(answers.get(i));
	       }
	}
	
}

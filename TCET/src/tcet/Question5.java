package tcet;

import java.util.Arrays;

public class Question5 {
	
        
	
	
	
	 public static void main(String[] args) {
	        
	        int[] a = {4,58,0,78,25,0,9654,28,0,54,0,54};
	        int flag = 0;
	        for (int i = 0; i < a.length; i++) {
	            if (a[i] != 0) { 
	                a[flag] = a[i]; 
	                flag++; 
	            }
	        }
	        for (int i = flag; i < a.length; i++) {
	            a[i] = 0;
	        }
	    
	      
	        System.out.println(Arrays.toString(a));





	 }
}

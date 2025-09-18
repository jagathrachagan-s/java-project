package stringpro;

public class StringHandleing {
     public static void main (String []args) {
//    	  String input="((abc)((de))";
//    	  String output="";
//    	  int len=input.length();
//    	  int open=0;
//    	  
//    	  for(int i=0;i<len;i++) {
//    		  char ch=input.charAt(i);
//    		  if(ch=='(') {
//    			  if(i==0||input.charAt(i-1)=='(')
//    			  {
//    				  output=output+ch;
//    				  open++;
//    			  }
//    		  }else if(ch==')') {
//    				  if(open>0) {
//    					  output=output+ch;
//    					  open--;
//    				  }
//    			  }else {
//    					  output=output+ch;
//    				  }
//    			  
//    			
//    		  }
//    	  System.out.println(output);
    	 
    	 
    	 
    	 String input = "((abc)((de))";
    	 String output = "";
    	 int len = input.length();
    	 int open = 0;

    	 for (int i = 0; i < len; i++) {
    	     char ch = input.charAt(i);
    	     if (ch == '(') {
    	         // If previous char was '(', keep this bracket
    	         if (i == 0 || input.charAt(i-1) == '(') {
    	             output += ch;
    	             open++;
    	         }
    	         // Otherwise, skip unnecessary extra brackets
    	     } else if (ch == ')') {
    	         // Only close brackets that have been opened
    	         if (open > 0) {
    	             output += ch;
    	             open--;
    	         }
    	     } else {
    	         output += ch;
    	     }
    	 }
    	 System.out.println(output);  
    	  }
    	
     }


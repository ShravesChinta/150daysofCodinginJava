

public class Main
{
	public static void main(String[] args) {
	    String str="hello Sravanti";
		printStringReverse(str);
	}
	
	public static void printStringReverse(String str)
	{
	    if(str.length()==0)
	    return;
	    
	    printStringReverse(str.substring(1,str.length()));
	    System.out.print(str.substring(0,1));
	    
	
	    
	}
	
}

/***
 Out put will be 
 
 itnavarS olleh
 
 **/

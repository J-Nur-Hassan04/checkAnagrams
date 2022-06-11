import java.util.*;
import java.io.*;

class inputString
{
    private String str, str2;
    inputString(String str,String str2)
    {
        this.str = str;
        this.str2 = str2;
    }
    
    boolean checkAnagrams()
    {
        if(str.length() != str2.length())
            return false;
            
        int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        
        for(int i=0 ; i<str.length(); i++ )
        {
            arr1[str.charAt(i)]++;
            arr2[str2.charAt(i)]++;
        }
        
        for(int i=0; i<256; i++)
        {
            if(arr1[i] != arr2[i] )
            {
                return false;
            }
        }
        
        return true;
        
    }
}

public class checkAnagrams
{
    
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter first String  : ");
		String str1 = br.readLine();
		
		System.out.println("Enter Second String : ");
		String str2 = br.readLine();
		
		inputString is = new inputString(str1,str2);
		
		boolean check = is.checkAnagrams();
		
		if(check)
		{
		    System.out.println("Two string are Anagrams");
		}
		else{
		    System.out.println("Two string are Not Anagrams");
		}
		
		
	}
}
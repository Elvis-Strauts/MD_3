package md2;

import java.util.Scanner;
public class md_2  {
    
    public static boolean isPalindrome(String k)
    {   
        if(k.length() == 0 || k.length() == 1)
            return true; 
        if(k.charAt(0) == k.charAt(k.length()-1))

        return isPalindrome(k.substring(1, k.length()-1));

        return false;
    }

    public static void main(String[]args) {
    	System.out.println("Elvis Strauts 171RDB062\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ievadiet simbolus, lai pârbaudîtu:");
        String string = scanner.nextLine();

        if(isPalindrome(string))
            System.out.println(string + " ir palindroms");
        else
            System.out.println(string + " nav palindroms");
    }
}
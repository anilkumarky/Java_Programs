package startproject;

import java.util.Scanner;

public class Stringp1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String s=scan.nextLine();
		
		int bracket=0,count=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='(') {
				count++;
			}
			else
			{
				if(bracket<=0) {
					count++;
						
				}else
					bracket--;
			}
		}
		System.out.println(count+bracket);
	}
	
}


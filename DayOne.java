package kotthaga;
import java.util.Scanner;

public class DayOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char c=sc.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') {
			System.out.println("Vowel");
		}
		else if(!(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U') && !(c=='0'||c=='1'||c=='2'||c=='3'||c=='4'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9') ) {
			System.out.println("Consonant");
		}
		else {
			System.out.println("Invaid Input");
		}
		//System.out.println("Hello jaga");
		if(Character.isUpperCase(c)) {
			System.out.println("Hello jaga");
			
		}
	}

}

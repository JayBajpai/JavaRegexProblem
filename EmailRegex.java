package helloworld;
import java.util.regex.*;
import java.util.*;

public class EmailRegex {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter The Mail id: ");
		 String matcher = input.nextLine();
		 Pattern p =  Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		 Matcher mtMatcher2 = p.matcher(matcher);
		 Boolean myBoolean2 = mtMatcher2.matches();
			boolean b = myBoolean2;
			if (b == true) {

				System.out.println("Correct! You Can Use This Mail");
			}
			else if(b == false) {
				System.out.println("Incorrect Mail");
			}
			}

}

package escapeSequences;

public class EscapeSequences {

	public static void main(String[] args) {

		//ESCAPE SEQUENCES IN JAVA ARE: \n, \\, \\b,\t,\f,\r,\",\'
	
		
		// ESCAPE SEQUENCE : \n : erase space
		System.out.println("1234 Hillside avenue, Jamaica, Queens");
		System.out.println("1234 Hillside avenue,\nJamaica Queens, \nNew York");
		System.out.println(" ");
		
		// ESCAPE SEQUENCE : \\
		System.out.println("90\51 Hillside Avenue");
		System.out.println("90\\51 Hillside Avenue");
		System.out.println(" ");
		
		// ESCAPE SEQUENCE : \" : to put something in the double quotation ""
		System.out.println("name \"Tiger\" is an animal");
		System.out.println(" ");
		
		// ESCAPE SEQUENCE : \' :to put something in the single quotation ''
		System.out.println("name \'Tiger\' is an animal"); 
		System.out.println(" ");
		
		// ESCAPE SEQUENCE : \t : to use tab in the keyboard
		System.out.println("id\tname\tphone");
		System.out.println("id\tname\t\tphone"); // extra space
		
		
		// ESCAPE SEQUENCE : \"
	}

}

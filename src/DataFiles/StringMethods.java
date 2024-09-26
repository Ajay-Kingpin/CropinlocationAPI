package DataFiles;

public class StringMethods {

	   public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Str1 = "hello world " + "You are the universe ";
		String Str2 = "Hello Bolo";
		String Str3 = "";
		String Str4 = " ";
		String Str5 = "         Space skip   ";
		int Students = 100;
		int Colleges = 10;
		Integer number = 50;
		Integer number1 = 25;
		Integer number2 = 25;
	System.out.println (Str1.length()); //Length of the string
	System.out.println (Str1.substring(1)); //Return string char of 1 to end i:e l
	System.out.println (Str1.substring(1,7)); //Return string char of 1 i:e e to w in between
	System.out.println (Str1.contains("hello")); //Let knows if the line has mentioned word or not - True
	System.out.println (Str2.contains("world")); //Let knows if the line has mentioned word or not - false
	System.out.println (Str1.equals("Universe")); //Let knows if the line has mentioned word 
	// or not without ignoring cases - false
	System.out.println (Str2.equalsIgnoreCase("bolo")); //Let knows if the line has mentioned word 
	// or not ignoring the cases - true
	System.out.println (Str3.isEmpty()); //Let knows if the line has empty character - True
	System.out.println (Str4.isEmpty()); //Let knows if the line has empty character - false (Space is a char)
	System.out.println (Str1.concat(Str2)); //Concat 2 objects
	System.out.println (Str1.replace("o" , "a")); // replace alphbets
	System.out.println (Str1.toUpperCase()); // alphbest to upper case
	System.out.println (Str2.toLowerCase()); // alphbest to lower case
	System.out.println (Str5.trim()); // Skip space between start & end inbetween space remains
	System.out.println (String.valueOf(Students)); //Changes int to string 
	// Integer Methods
	System.out.println (number.floatValue());
	System.out.println (number.doubleValue());
	System.out.println (number.intValue());
	System.out.println (number.compare(number , number1)); // return 1 if number > number1
	System.out.println (number.compare(number1 , number2)); // return 0 if number1 = number2
	System.out.println (number.compare(number1 , number)); // return -1 if number1 > number
	System.out.println (number1.equals(number2)); // Same number true
	System.out.println (number.equals(number2)); // different number false
	System.out.println (number.parseInt("98123")); //Pass different number than the declared onee
	System.out.println (Str2.toString());
	   }
}

	

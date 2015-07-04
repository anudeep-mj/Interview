package testPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseStringButNotCharacters {

public static void main(String[] args) throws IOException {

	Scanner in = new Scanner(System.in);
	 
    System.out.println("Enter a string");
    String originalString = in.nextLine();
    System.out.println("You entered string, "+ originalString);

    String reversedString = ReverseString(originalString);
    System.out.println(reversedString);

}

public static String ReverseString(String sentence) {
    String[] partsOfstring = sentence.split(" ");

    StringBuilder builder = new StringBuilder();
    int partsLength = partsOfstring.length;
//    partsLength = partsLength - 1;
    builder.append(partsOfstring[partsLength-1]);

    for (int i = partsLength - 2; i >= 0; --i) {
        builder.append(" ").append(partsOfstring[i]);
    }

    return builder.toString();
	}
}
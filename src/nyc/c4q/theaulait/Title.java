package nyc.c4q.theaulait;

/**
 * Created by c4q-vanice on 3/20/15.
 */

import java.util.Scanner;

public class Title {


    public static String capitalizeString(String string) { // This capitalized the first letter
        char[] chars = string.toLowerCase().toCharArray();
        boolean found = false;
        for (int i = 0; i < chars.length; i++) {
            if (!found && Character.isLetter(chars[i])) {
                chars[i] = Character.toUpperCase(chars[i]);
                found = true;
            } else if (Character.isWhitespace(chars[i]) || chars[i]=='.' || chars[i]=='\'') {
                found = false;
            }
        }
        return String.valueOf(chars);
    }

    public static String underline(String title, char symbol) {  //This underlines
        String underline = "\n";

        for (int i = 0; i < title.length(); i++) {
            if (title.charAt(i) == ' ')
                underline += ' ';
            else
                underline += symbol;
        }
        return title + underline;
    }
    public static String printTitle(String title, char symbol) {    // This returns capitalized letter and underline

        return underline(capitalizeString(title), symbol);
    }

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String title;

        System.out.println("Please give me a title.");
        title = input.nextLine();
        System.out.println(printTitle(title, '*'));


    }
}

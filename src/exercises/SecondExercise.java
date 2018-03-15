package exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a word or a sentence! ");
        String text = scanner.nextLine().toLowerCase();
        String codedText = "";
        //get the first character and count it
        char firstLetter = text.charAt(0);
        Pattern pattern = Pattern.compile(firstLetter+"");
        Matcher matcher = pattern.matcher(text);
        int numberOfChars = 0;
        while (matcher.find()){
            numberOfChars++;
        }
        //Code the text
        for (int i = 0; i < text.length(); i++) {
            char actualCharacter = text.charAt(i);
            if (actualCharacter>=97 && actualCharacter<=122){
                //get the number of shift
                int numberOfShift = numberOfChars%26;
                if(actualCharacter+numberOfShift>122){
                    int stepToEnd = 'z'- actualCharacter;
                    numberOfShift = numberOfShift - stepToEnd;
                    actualCharacter = (char) ('a' + numberOfShift-1);
                } else {
                    actualCharacter = (char) (actualCharacter + numberOfShift);
                }
            }
            codedText= codedText + (char)actualCharacter;
        }
        //print result
        System.out.println(codedText);
    }

}

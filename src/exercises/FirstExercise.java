package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstExercise {

    public static void main(String[] args) {
        List<Integer> oddNumbers = new ArrayList<>();
        double avarage = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me some numbers!");
        String scannedNumbers = scanner.nextLine();
        //Transform input
        scannedNumbers = scannedNumbers.replaceAll(" ", "");
        String[] nums = scannedNumbers.split(",");

        //Inspect input and add odds to the list
        for (int i = 0; i < nums.length; i++) {
            Integer actualNumber = Integer.parseInt(nums[i]);
            if(actualNumber%2==1){
                oddNumbers.add(actualNumber);
                avarage = avarage + actualNumber;
            }
        }

        //Print the result
        if(oddNumbers.size()!=0){
            System.out.println(avarage/oddNumbers.size());
        } else {
            System.out.println("No odd number added");
        }

    }
}

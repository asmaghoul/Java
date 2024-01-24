import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestJava {

    public static void main(String[] args) {
        PuzzleJava Puzzle = new PuzzleJava();
        System.out.println(
                "\n----- Generate and Return an array with 10 random numbers between 1 and 20 inclusive Then throw an alphabet randomly -----");
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        Puzzle.getTenRolls(myArray);
        // ArrayList<String> alphabet = new ArrayList<String>();
        String[] alphabetone = "abcdefghijklmnopqrstuvwxyz".split("");
        ArrayList<String> alphabet = new ArrayList<String>(Arrays.asList(alphabetone));
        // String [] strings = new String [] {"1", "2" };
        // List<String> stringList = new ArrayList<String>(Arrays.asList(strings));
        // new ArrayList is only needed if you absolutely need an ArrayList
        Puzzle.getRandomLetter(alphabet);
        System.out.println(
                "\n----- Generate a password of 8 characters -----");
        Puzzle.generatePassword(alphabet);
        System.out.println(
                "\n----- Generate an Array of 8 password each of 8 characters -----");
        Puzzle.getNewPasswordSet(alphabet, 8);
        // shuffleArray
        Puzzle.shuffleArray(alphabet);
        // Write a method that takes an array and mixes up all the values in a
        // pseudo-random way.
        // Hint: use random indexes within the array, and swap values repeatedly.
    }

}
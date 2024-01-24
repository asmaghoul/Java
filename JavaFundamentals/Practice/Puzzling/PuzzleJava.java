import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

//To use methods from the Random library you will need to create an instance of
//Random
//Random randMachine = new Random();
//From there you can use any of the methods listed in the documentation. For
//example:
//randMachine.setSeed(35679);
// Write a method that will generate and return an array with 10 random numbers
// between 1 and 20 inclusive.
public class PuzzleJava {
    public void getTenRolls(ArrayList<Integer> rolls) {
        for (int i = 0; i < 10; i++) {
            Random randMachine = new Random();
            rolls.add(randMachine.nextInt(1, 25));

        }
        System.out.println(rolls);

    }

    public void getRandomLetter(ArrayList<String> alphabetArray) {
        System.out.println(alphabetArray);
        Random randMachine = new Random();
        int randomIndex = randMachine.nextInt(0, 25);
        System.out.println(alphabetArray.get(randomIndex));
        alphabetArray.remove(randomIndex);
        System.out.println(alphabetArray);

    }

    public String generatePassword(ArrayList<String> alphabetArray) {
        System.out.println(alphabetArray);
        ArrayList<String> passwordArray = new ArrayList<String>();
        int i = 0;
        // int j = 25;
        while (i < 8) {
            Random randMachine = new Random();
            int randomIndex = randMachine.nextInt(25);
            System.out.println(randomIndex);
            System.out.println(alphabetArray.get(randomIndex));
            String newItem = alphabetArray.get(randomIndex);
            passwordArray.add(newItem);

            System.out.println(passwordArray);
            // j = j - 1;
            i++;
        }

        StringBuilder passwordBuilder = new StringBuilder();
        for (String item : passwordArray) {
            passwordBuilder.append(item);
        }

        String password = passwordBuilder.toString();
        System.out.println(password);
        return password;

    }

    public void getNewPasswordSet(ArrayList<String> alphabetArray, int size) {
        ArrayList<String> passwordArrayBig = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            String newItem = generatePassword(alphabetArray);
            passwordArrayBig.add(newItem);
        }
        System.out.println(passwordArrayBig);

    }

    public void shuffleArray(ArrayList<String> shuffledArray) {
        Random randMachine = new Random();

        int randomIndex = randMachine.nextInt(shuffledArray.size() - 1);
        System.out.println(randomIndex);
        for (int i = 0; i < randomIndex; i++) {
            Random rand = new Random();

            int randIndex = rand.nextInt(shuffledArray.size() - 1);

            String mov = shuffledArray.get(randomIndex);
            shuffledArray.set(randomIndex, shuffledArray.get(randIndex));
            shuffledArray.set(randIndex, mov);

        }
        System.out.println(shuffledArray);
    }
}
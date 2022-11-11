import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.prefs.PreferencesFactory;

public class PreferentialVote {

    public enum FoodChoice {
        ROTI, GREEK, PIZZA, BURGER, TURKISH, JERUSALEM
    }
    public String voter;
    public List<FoodChoice> votes;

    public PreferentialVote(List<FoodChoice> votes, String voter) {
        this.voter = voter;
        this.votes = votes;
    }

    @Override
    public String toString() {
        return voter + ":" + votes.toString();
    }

    public static List<PreferentialVote> readFile(File file) throws FileNotFoundException {
        List<PreferentialVote> votes = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        scanner.nextLine(); //skip header
        while (scanner.hasNextLine()) {
            List<FoodChoice> foodChoices = new ArrayList<>();
            List<String> curLine = Arrays.asList(scanner.nextLine().split(";"));
            for (String choice : curLine.subList(1, curLine.size())) {
                foodChoices.add(FoodChoice.valueOf(choice.toUpperCase()));
            }
            votes.add(new PreferentialVote(foodChoices, curLine.get(0)));
        }
        return votes;
    }

}

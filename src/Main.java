import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //Readcsv()
        //RunPreferentialVoting()
        List<PreferentialVote> votes = PreferentialVote.readFile(new File("Votes.csv"));
        System.out.println(votes);
    }
}
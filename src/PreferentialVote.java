import java.io.File;
import java.util.List;

public class PreferentialVote {

    enum FoodChoice {

    }
    public String voter;
    public List<String> votes;

    public PreferentialVote(List<String> votes, String voter) {
        this.voter = voter;
        this.votes = votes;
    }

    public PreferentialVote readFile(File file) {
        return null;
    }

}

import java.util.HashMap;
import java.util.Set;

public class TrackList {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("I Misunderstood", "She said Darling I'm in love with your mind.");
        trackList.put("Wish I Could Hold You Now ", "I wish I could hold you now And see the moonlight in your eyes");
        trackList.put("Prison of Time",
                "I Plant my feet in the past so I'm always attatched to the the moments and feelings that never last.");
        trackList.put("I Feel So Good ", "Wo, I feel good I knew that I wouldn't of I feel good");
        System.out.println(trackList.get("Prison of Time"));
        System.out.println("**********Track:Lyrics**********");
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key + "  :" + trackList.get(key));
        }

    }
}
public class Bird {

    private final String tweetContent;
    private final Integer timesPerTweet;

    public Bird(String tweetContent, Integer timesPerTweet) {
        this.tweetContent = tweetContent;
        this.timesPerTweet = timesPerTweet;

    }

    void freakOut() throws Exception {
        tweet();
        runAway();
    }

    void runAway(){
        System.out.println("I'm running away!!!");
    }

    void tweet() throws Exception {
        StringBuilder sound = new StringBuilder();
        for (int i = 0; i < timesPerTweet; i++) {
            sound.append(tweetContent);
        }
        System.out.println(sound.toString());
    }
}

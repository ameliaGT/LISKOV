public class ElectricCanary extends Bird{

    private boolean hasBatteries;

    public ElectricCanary(String tweetContent, Integer timesPerTweet, boolean hasBatteries) {
        super(tweetContent, timesPerTweet);

        this.hasBatteries = hasBatteries;
    }

    @Override
    void freakOut() throws Exception {
        if(hasBatteries) {
            super.freakOut();
        }
    }

    @Override
    void runAway() {
        if(hasBatteries) {
            super.runAway();
        }
    }

    @Override
    void tweet() throws Exception {
        if(hasBatteries){
            super.tweet();
        }
    }
}

public class SplitResult {
    private int remainingPercentage;
    private float steam;

    public SplitResult(int remainingPercentage, float steam){
        this.remainingPercentage = remainingPercentage;
        this.steam = steam;
    }

    public int getRemainingPercentage() {
        return remainingPercentage;
    }

    public float getSteam() {
        return steam;
    }

}

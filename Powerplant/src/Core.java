public abstract class Core {
    public static final int FULL_PERCENTAGE = 100;
    protected int remainingPercentage;

    public Core(int remainingPercentage) {
        this.remainingPercentage = remainingPercentage;
    }
    public Core() {
        this.remainingPercentage = FULL_PERCENTAGE;
    }

    public abstract SplitResult split(int tempInKelvin, int timeInSeconds);

    public int getRemainingPercentage() {
        return remainingPercentage;
    }

    public void setRemainingPercentage(int remainingPercentage) {
        this.remainingPercentage = remainingPercentage;
    }
}

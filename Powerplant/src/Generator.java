public class Generator {
    private float totalYieldKwh;

    public Generator(float totalYieldKwh) {
        this.totalYieldKwh = totalYieldKwh;
    }

    public double generateEnergy(){
        return 0.0;
    }

    public float getTotalYieldKwh() {
        return totalYieldKwh;
    }

    public void setTotalYieldKwh(float totalYieldKwh) {
        this.totalYieldKwh = totalYieldKwh;
    }
}

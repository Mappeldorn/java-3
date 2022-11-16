public class Powerplant {
    private Generator generator;
    private Reactor reactor;
    private CoolingSystem coolingSystem;

    public Powerplant(Generator generator, Reactor reactor, CoolingSystem coolingSystem){
        this.generator = generator;
        this.reactor = reactor;
        this.coolingSystem = coolingSystem;
    }

    public Reactor getReactor() {
        return reactor;
    }

    public double run(int tempInKelvin, int timeInSeconds){
        return 0.0;
    }

    public void setReactor(Reactor reactor) {
        this.reactor = reactor;
    }

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    public CoolingSystem getCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }
}

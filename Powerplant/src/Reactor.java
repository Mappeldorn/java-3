import java.util.HashSet;
import java.util.Set;

public class Reactor {
    private Set<Core> cores;

    public Reactor(){
        this.cores = new HashSet<Core>();
    }

    public void addCore(Core core){
        this.cores.add(core);
    }

    public Set<Core> getCores() {
        return cores;
    }

    public void setCores(HashSet<Core> cores) {
        this.cores = cores;
    }
}

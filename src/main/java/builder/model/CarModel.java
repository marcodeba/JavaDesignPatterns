package builder.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marcopan on 17/10/23.
 */
public abstract class CarModel {
    private List<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        for (int i = 0; i < this.sequence.size(); i++) {
            if ("start".equalsIgnoreCase(this.sequence.get(i))) {
                this.start();
            } else if ("stop".equalsIgnoreCase(this.sequence.get(i))) {
                this.stop();
            } else if ("alarm".equalsIgnoreCase(this.sequence.get(i))) {
                this.alarm();
            } else if ("engine boom".equalsIgnoreCase(this.sequence.get(i))) {
                this.engineBoom();
            }
        }
    }

    final public List<String> getSequence() {
        return sequence;
    }

    final public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}

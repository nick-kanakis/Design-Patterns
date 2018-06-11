package adapter.example;

/**
 * Created by Nicolas on 8/6/2018.
 */
public class TurkeyAdapter implements Turkey {
    Duck adapteeDuck;

    public TurkeyAdapter(Duck adapteeDuck) {
        this.adapteeDuck = adapteeDuck;
    }

    @Override
    public String gobble() {
        return adapteeDuck.quack();
    }

    @Override
    public String fly() {
        return adapteeDuck.fly();
    }
}

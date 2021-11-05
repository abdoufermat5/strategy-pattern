package strategy;

import data.Eleve;

import java.util.List;

public class Context {
    private Strategy myStrategy;

    public List<Eleve> execute(List<Eleve> l) {
        //délègue le comportement à un objet Strategy
        return myStrategy.appliquerFiltre(l);
    }

    public Strategy getMyStrategy() {
        return myStrategy;
    }

    public void setMyStrategy(Strategy myStrategy) {
        this.myStrategy = myStrategy;
    }
}

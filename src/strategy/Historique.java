package strategy;

import strategy.state.EtatListeEleve;

import java.util.ArrayList;
import java.util.List;

// non utilisé
public class Historique {
    private List<EtatListeEleve> etats = new ArrayList();

    public EtatListeEleve popState() {
        int lastStateIndex = etats.size() - 1;
        if (lastStateIndex > 0) {
            EtatListeEleve lastState = etats.get(lastStateIndex);
            etats.remove(lastState);
            return lastState;
        } else {
            return etats.get(0);
        }
    }
}

package strategy.state;

import data.Eleve;

import java.util.List;

public class EtatListeEleve {
    private List<Eleve> eleves;

    public EtatListeEleve(List<Eleve> e) {
        eleves = e;
    }

    public List<Eleve> getListEleves() {
        return eleves;
    }
}

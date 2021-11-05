package strategy;

import data.Eleve;
import data.SexeFilter;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FiltreParSexe implements Strategy {
    private SexeFilter sexe;

    public FiltreParSexe(SexeFilter sexe) {
        this.sexe = sexe;
    }

    @Override
    public List<Eleve> appliquerFiltre(List<Eleve> eleves) {
        Predicate<Eleve> bySexe = eleve -> eleve.getSexe() == sexe;

        return eleves.stream().filter(bySexe)
                .collect(Collectors.toList());
    }

    public SexeFilter getSexe() {
        return sexe;
    }

    public void setSexe(SexeFilter sexe) {
        this.sexe = sexe;
    }
}

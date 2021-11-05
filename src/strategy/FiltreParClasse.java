package strategy;

import data.DegreeFilter;
import data.Eleve;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FiltreParClasse implements Strategy {
    private DegreeFilter degree;

    public FiltreParClasse(DegreeFilter d) {
        degree = d;
    }

    @Override
    public List<Eleve> appliquerFiltre(List<Eleve> eleves) {
        Predicate<Eleve> byDegree = eleve -> eleve.getDegree() == degree;

        return eleves.stream().filter(byDegree)
                .collect(Collectors.toList());
    }

    public DegreeFilter getDegree() {
        return degree;
    }

    public void setDegree(DegreeFilter degree) {
        this.degree = degree;
    }
}

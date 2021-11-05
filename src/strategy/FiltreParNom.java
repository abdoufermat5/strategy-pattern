package strategy;

import data.Eleve;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FiltreParNom implements Strategy {
    private String nom;

    @Override
    public List<Eleve> appliquerFiltre(List<Eleve> eleves) {
        Predicate<Eleve> byName = eleve -> eleve.getLastName().equals(nom) || eleve.getFirstName().equals(nom);

        return eleves.stream().filter(byName)
                .collect(Collectors.toList());
    }

    public String getNom() {
        return nom;
    }

    ;

    public void setNom(String nom) {
        this.nom = nom;
    }
}

package strategy;

import data.Eleve;

import java.util.List;

public interface Strategy {
    List<Eleve> appliquerFiltre(List<Eleve> eleves);
}

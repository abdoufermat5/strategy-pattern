package strategy;

import data.Eleve;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FiltreParAge implements Strategy {
    private int age;

    @Override
    public List<Eleve> appliquerFiltre(List<Eleve> eleves) {
        Predicate<Eleve> byAge = eleve -> eleve.getAge() == age;

        return eleves.stream().filter(byAge)
                .collect(Collectors.toList());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

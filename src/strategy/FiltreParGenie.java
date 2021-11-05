package strategy;

import data.DepartmentFilter;
import data.Eleve;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FiltreParGenie implements Strategy {
    private DepartmentFilter department;

    public FiltreParGenie(DepartmentFilter department) {
        this.department = department;
    }

    @Override
    public List<Eleve> appliquerFiltre(List<Eleve> eleves) {
        Predicate<Eleve> byDepartment = eleve -> eleve.getDepartment() == department;

        return eleves.stream().filter(byDepartment)
                .collect(Collectors.toList());
    }
}

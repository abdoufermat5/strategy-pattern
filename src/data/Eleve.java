package data;

import java.time.LocalDate;

public class Eleve {
    private String lastName;
    private String firstName;
    private DegreeFilter degree;
    private DepartmentFilter department;
    private int age;
    private SexeFilter sexe;
    private LocalDate enterDate;
    private int promo;

    public Eleve(String lastName,
                 String firstName,
                 DegreeFilter degree,
                 DepartmentFilter department,
                 int age,
                 SexeFilter sexe,
                 LocalDate enterDate,
                 int promo) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.degree = degree;
        this.department = department;
        this.age = age;
        this.sexe = sexe;
        this.enterDate = enterDate;
        this.promo = promo;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public DegreeFilter getDegree() {
        return degree;
    }

    public void setDegree(DegreeFilter degree) {
        this.degree = degree;
    }

    public DepartmentFilter getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentFilter department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SexeFilter getSexe() {
        return sexe;
    }

    public void setSexe(SexeFilter sexe) {
        this.sexe = sexe;
    }

    public LocalDate getEnterDate() {
        return enterDate;
    }

    public void setEnterDate(LocalDate enterDate) {
        this.enterDate = enterDate;
    }

    public int getPromo() {
        return promo;
    }

    public void setPromo(int promo) {
        this.promo = promo;
    }

    @Override
    public String toString() {
        return "Eleve: " +
                "nom='" + lastName + '\'' +
                ", prénom='" + firstName + '\'' +
                ", classe=" + degree +
                ", departement=" + department +
                ", age=" + age +
                ", sexe=" + sexe +
                ", date=" + enterDate +
                ", promo=" + promo;
    }
}

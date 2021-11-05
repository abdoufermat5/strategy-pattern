package main;

import data.Eleve;
import strategy.*;

import java.time.LocalDate;
import java.util.*;

import static data.DepartmentFilter.GIT;
import static data.DepartmentFilter.GC;
import static data.DepartmentFilter.GEM;
import static data.DepartmentFilter.AERO;
import static data.DegreeFilter.DIC2;
import static data.DegreeFilter.DIC1;
import static data.SexeFilter.MALE;
import static data.SexeFilter.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Eleve> listeEleve = HelperClasse.getData();
        // on randomise les données
        Collections.shuffle(listeEleve, new Random());
        // instanciation du contexte
        Context myContext = new Context();
        // instanciation d'une strategy par defaut
        Strategy strategy=new FiltreParClasse(DIC1);


        System.out.println("-----ECOLE POLYTECHNIQUE DE THIES------");
        System.out.println("***********LISTE NON FILTRÉE DE L'ENSEMBLE DES ELEVES**********");
        for(Eleve e: listeEleve){
            System.out.println(e);
        }
        System.out.println("-----> TOTAL: " + listeEleve.size());
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("Voulez vous filtrer la liste?");
        System.out.println("1. Oui");
        System.out.println("2. Non");
        Scanner r = new Scanner(System.in);
        int choix = r.nextInt();
        while(choix!=2){
            int n = HelperClasse.getChoice();
            int m = HelperClasse.getSubChoice(n);
            HelperClasse.showAppliedFilter(n, m, strategy, myContext, HelperClasse.getData());
            System.out.println("Voulez vous filtrer la liste?");
            System.out.println("1. Oui");
            System.out.println("2. Non");
            Scanner myInput = new Scanner(System.in);
            choix = myInput.nextInt();
        }

        System.out.println("-------------------Au revoir-------------------");

    }
}

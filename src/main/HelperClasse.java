package main;

import data.Eleve;
import strategy.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static data.DegreeFilter.*;
import static data.DepartmentFilter.*;
import static data.DepartmentFilter.AERO;
import static data.SexeFilter.FEMALE;
import static data.SexeFilter.MALE;

public class HelperClasse {
    public HelperClasse(){

    }
    public static int getChoice(){
        System.out.println("---Veuillez choisir le type de filtre à appliquer----");
        System.out.println("1. filtrer par classe");
        System.out.println("2. filtrer par genie");
        System.out.println("3. filtrer par sexe");
        System.out.println("4. filtrer par age");
        System.out.println("5. filtrer par nom");
        Scanner myInput = new Scanner( System.in );
        int n;
        try {
            n = myInput.nextInt();
            return n;
        }catch(Exception e){
            System.out.println("Bad input");
        }
        return 0;
    }

    public static int getSubChoice(int n){
        if(n==1){
            System.out.println("Vous voulez filtrer les eleves par classe:");
            System.out.println("1. TC1");
            System.out.println("2. TC2");
            System.out.println("3. DIC1");
            System.out.println("4. DIC2");
            System.out.println("5. DIC3");
            Scanner myInput = new Scanner( System.in );
            int a;
            try {
                a = myInput.nextInt();
                return a;
            }catch(Exception e){
                System.out.println("Bad input");
            }

        }
        if(n == 2){
            System.out.println("Vous voulez filtrer les eleves par genie:");
            System.out.println("1. GIT");
            System.out.println("2. GEM");
            System.out.println("3. GC");
            System.out.println("4. AERO");

            Scanner myInput = new Scanner( System.in);
            int a;
            try {
                a = myInput.nextInt();
                return a;
            }catch(Exception e){
                System.out.println("Bad input");
            }
        }

        if(n == 3){
            System.out.println("Vous voulez filtrer les eleves par sexe:");
            System.out.println("1. Masculin");
            System.out.println("2. Feminin");

            Scanner myInput = new Scanner(System.in);
            int a;
            try {
                a = myInput.nextInt();
                return a;
            }catch(Exception e){
                System.out.println("Bad input");
            }
        }
        if(n == 4){
            System.out.println("Vous voulez filtrer les eleves par age:");

            System.out.println("Saisir l'age");

            Scanner myInput = new Scanner( System.in);
            int a;
            try {
                a = myInput.nextInt();
                return a;
            }catch(Exception e){
                System.out.println("Bad input");
            }
        }
        return 0;
    }

    public static void showAppliedFilter(int x, int y, Strategy strategy, Context context, List<Eleve> listeEleves){

        if(x==1){
            if(y==1){
                strategy = new FiltreParClasse(TC1);
                System.out.println("***********LISTE DES ELEVES DE LA TC1**********");

            }
            if(y==2){
                strategy = new FiltreParClasse(TC2);
                System.out.println("***********LISTE DES ELEVES DE LA TC2**********");
            }
            if(y==3){
                strategy = new FiltreParClasse(DIC1);
                System.out.println("***********LISTE DES ELEVES DE LA DIC1**********");
            }
            if(y==3){
                strategy = new FiltreParClasse(DIC2);
                System.out.println("***********LISTE DES ELEVES DE LA DIC2**********");
            }

            if(y==4){
                strategy = new FiltreParClasse(DIC3);
                System.out.println("***********LISTE DES ELEVES DE LA DIC3**********");
            }else{
                System.out.println("Bad choice");
            }
        }
        if(x==2){
            if(y == 1){
                strategy = new FiltreParGenie(GIT);
                System.out.println("***********LISTE DES ELEVES DU GIT**********");
            }
            if(y == 2){
                strategy = new FiltreParGenie(GEM);
                System.out.println("***********LISTE DES ELEVES DU GEM**********");
            }
            if(y == 3){
                strategy = new FiltreParGenie(GC);
                System.out.println("***********LISTE DES ELEVES DU GC**********");
            }
            if(y == 4){
                strategy = new FiltreParGenie(AERO);
                System.out.println("***********LISTE DES ELEVES EN AERO**********");
            }
        }
        if(x==3){
            if(y==1){
                strategy = new FiltreParSexe(MALE);
                System.out.println("***********LISTE DES ELEVES DE SEXE MASCULIN**********");
            }
            if(y==2){
                strategy = new FiltreParSexe(FEMALE);
                System.out.println("***********LISTE DES ELEVES DE SEXE FEMININ**********");
            }
        }

        context.setMyStrategy(strategy);
        List<Eleve> liste = context.execute(listeEleves);
        showListe(liste);
    }

    public static void showListe(List<Eleve> liste){
        if(liste.size() == 0){
            System.out.println("Aucune données");
        }
        else{
            for(Eleve e: liste){
                System.out.println(e);
            }
        }
        System.out.println("TOTAL: " + liste.size());
    }

    public static List<Eleve> getData(){
        List<Eleve> data = new ArrayList<Eleve>();
        data.add(new Eleve("Sadiakhou", "Abdou Yaya", DIC2, GIT, 23, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Ndiaye", "Aimerou", DIC2, GIT, 22, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Fall", "Amouyakar", DIC2, GIT, 30, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Dia", "Kalidou", DIC2, GIT, 22, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Diop", "Pape Omar", DIC2, GIT, 20, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Dieng", "Sokhna Cambell", DIC2, GIT, 23, FEMALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Gueye", "Faty", DIC2, GIT, 23, FEMALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Fall", "Falilou", DIC2, GIT, 15, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Diakhate", "Fallou Java", DIC2, GIT, 22, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Diouf", "Adja", DIC2, GC, 12, FEMALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Gueye", "Khadidiatou ETC..", DIC2, GC, 22, FEMALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Gueye", "Yacine", DIC2, GEM, 25, FEMALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Ndaw", "Abdou Seydi", DIC2, GC, 22, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Ngom", "Djiby", DIC2, GC, 18, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Diop", "Serigne Modoulaye", DIC2, GC, 18, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Diallo", "Omar", DIC2, GC, 20, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Ndiaye", "Babacar", DIC2, GC, 22, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Kande", "Amadou", DIC2, AERO, 25, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Cisse", "Mouhamed", DIC2, AERO, 23, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Cisse", "Mada", DIC2, AERO, 20, FEMALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Mbaye", "Lana", DIC2, AERO, 22, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Diallo", "Newton", DIC2, GEM, 22, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Diallo", "Ibrahima", DIC2, GEM, 22, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Sambou", "Sebastien Sipok Sina", DIC2, GEM, 22, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Gueye", "Papa Abdou", DIC1, GEM, 22, MALE, LocalDate.parse("2018-10-27"), 46));
        data.add(new Eleve("Ba", "Amadou", DIC1, GEM, 22, MALE, LocalDate.parse("2018-10-27"), 46));
        data.add(new Eleve("Diop", "Mansour", DIC1, GEM, 21, MALE, LocalDate.parse("2018-10-27"), 46));
        data.add(new Eleve("Gueye", "Fatou", DIC1, GEM, 20, FEMALE, LocalDate.parse("2018-10-27"), 46));
        data.add(new Eleve("Diakhoumpa", "Oumou", DIC1, GEM, 20, FEMALE, LocalDate.parse("2018-10-27"), 46));
        data.add(new Eleve("Sene", "Mbaye", DIC1, GIT, 22, MALE, LocalDate.parse("2017-10-27"), 45));
        data.add(new Eleve("Diop", "Bamba", DIC1, GIT, 21, MALE, LocalDate.parse("2018-10-27"), 46));
        data.add(new Eleve("Sadji", "Abdoulaye", DIC1, GIT, 20, MALE, LocalDate.parse("2018-10-27"), 46));
        data.add(new Eleve("Balde", "Aissatou(R)", DIC1, GIT, 21, FEMALE, LocalDate.parse("2018-10-27"), 46));
        return data;
    }
}

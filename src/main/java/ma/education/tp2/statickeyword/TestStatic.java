package ma.education.tp2.statickeyword;

public class TestStatic {
    public static void main(String[] args) {
        Etudiant e1= new Etudiant(1, "AHMED", 20);
        Etudiant e2= new Etudiant(2, "SAID", 30);

        System.out.println(e1.id +" -- "+ e1.nom +" -- "+e1.nbEtudiants);
        System.out.println(e2.id +" -- "+ e2.nom +" -- "+e2.nbEtudiants);

        //nbEtudiant prend la derniere valeur affecte
    }

}

package ma.education.tp2.statickeyword;

public class Etudiant {
    public long id; //Oui
    public String nom; //Oui
    public static int nbEtudiants; //Non

    public Etudiant(long id, String nom, int nb) {
        this.id = id;
        this.nom = nom;
        this.nbEtudiants += nb;
    }
}

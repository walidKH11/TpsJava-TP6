import ma.education.tp1.introduction.Salle;

public class AccesHorsPackage extends Salle{
    public AccesHorsPackage(long id, String nom) {
        super(id, nom);
    }

    public void afficher(Salle s) {
//        System.out.println(s.id);
//        System.out.println(s.nom);
        System.out.println(id);
        System.out.println(nom);
    }
    public static void main(String[] args) {
        Salle salleB = new Salle(2,"Salle B");

        //System.out.println(salleB.id +" -- "+ salleB.nom);
    }
}

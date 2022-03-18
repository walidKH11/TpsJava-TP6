package ma.education.tp1.introduction;

public class AccesSamePackage {
    public static void main(String[] args) {
        Salle salleA = new Salle(1,"Salle A");

        System.out.println(salleA.id +" -- "+ salleA.nom);
    }
}

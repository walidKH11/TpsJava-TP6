package ma.education.tp.abstarctkeyword;

public abstract class FormeGeometrique {
    double surface;
    public abstract double calculerSurface();

    // Méthode concrète avec un corps
    public void afficherSurface() {
        System.out.println(this.surface);
    }
}

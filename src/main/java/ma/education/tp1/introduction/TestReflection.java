package ma.education.tp1.introduction;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // Lecture fichier des paramètres
        Locale local = new Locale("en");
        ResourceBundle rb =
                ResourceBundle.getBundle("ma.education.tp2.reflection.rappel.param", local);
        String value = rb.getString("keyClass1");
        // Convert String type To Class Type
        Class c = Class.forName(value);
        // Tableau pour les constructeurs de la classe ConnectionDB
        Constructor[] constructors = c.getDeclaredConstructors();
        // Modification de la visibilité du premier constructeur
        constructors[0].setAccessible(true);
        // Instanciation de l’Objet (o) par réflexion.
        Object o = constructors[0].newInstance(null);
    }
}

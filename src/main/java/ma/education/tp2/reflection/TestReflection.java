package ma.education.tp2.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException  {
        Class c = Class.forName("ma.education.tp1.introduction.Salle");

        //class salle = Salle.class;
        Field[] fields = c.getDeclaredFields();
        for(Field f:fields) {
            System.out.println(f.getName().toString());
        }

        Method[] methods = c.getDeclaredMethods();
        for(Method m:methods) {
            System.out.println(m.toString());
        }


        Constructor[] consts = c.getDeclaredConstructors();
        for(Constructor cons:consts) {
            System.out.println(cons.toString());
            cons.setAccessible(true);
        }

        Object o1 = consts[0].newInstance();
        Object o2 = consts[1].newInstance("Salle Informatique");
        Object o3 = consts[2].newInstance(2,"Salle des cours");

        System.out.println(o2.equals(o3));
    }
}

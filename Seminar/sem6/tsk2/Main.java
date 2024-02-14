package Seminar.sem6.tsk2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", "Ivanov I.I.", "Scottishfold", 3);
        Cat cat11 = new Cat("Murzik", "Ivanov I.I.", "Scottishfold", 3);
        Cat cat2 = new Cat("Merik", "Lomonov O.M.", "Tai", 1);
        Cat cat3 = new Cat("Barsik", "Petrov I.V.", "British", 2);
        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        System.out.println(set);
        System.out.println(cat1);
        System.out.println(cat1);
        System.out.println(cat1.equals(cat11));
        System.out.println(cat1.hashCode());
        System.out.println(cat11.hashCode());
    }
}

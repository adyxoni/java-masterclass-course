package People;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printDepartment(List<Person> people){
        for(Person name: people){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        /*Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheinintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko);*/

        /*Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        olli.study();
        System.out.println(olli);*/

        /*Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 001000 Helsinki", 5400);
        System.out.println(pekka);
        System.out.println(esko);
        Student olli = new Student("Olli", "Ida Albergintie 1 Street 00400 Helsinki");
        for(int i=0; i<25; i++){
            olli.study();
        }
        System.out.println(olli);*/

        List<Person> people = new ArrayList<Person>();
        people.add(new Teacher("Pekka Mik", "Korsontie Street 1 03100 Vantaa", 1200));
        people.add(new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki"));

        printDepartment(people);
    }
}

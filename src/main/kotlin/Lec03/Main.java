package Lec03;

public class Main {

    public static void printAgeIfPerson(Object obj) {
        if (obj instanceof Person) {
            final Person person = (Person) obj;
            System.out.println(person.getAge());
        }
    }
}

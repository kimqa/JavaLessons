package Interfaces;

public class Test {
    public static void main(String [] args) {
        Pet pet = new Pet(1);
        Person person = new Person("Bob");
        pet.sleep();
        person.sayHello();
        person.showInfo();
        pet.showInfo();
        Info info = new Person("Adam");
        Info info1 = new Pet(12);
        info.showInfo();
        info1.showInfo();
    }
}

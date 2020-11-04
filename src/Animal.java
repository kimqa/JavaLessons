public abstract class Animal {
    int age;
    String name;

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public void eat() {
        System.out.println("I'm eat ...");
    }
    public abstract void makeSound();
}

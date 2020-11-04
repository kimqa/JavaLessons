public class Test {
    public static void main(String [] args) {
        Cat cat1 = new Cat(12, "Tom");
        cat1.makeSound();
        cat1.speak();
        cat1.eat();
        cat1.catInfo();

        Dog dog = new Dog();
        dog.sleep();
        dog.beet();
    }
}

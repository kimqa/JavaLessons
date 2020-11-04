public class Cat extends Animal {
    public Cat(int age, String name) {
        super(age, name);
    }

    public void speak() {
        System.out.println("mey ");
    }

    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void makeSound() {
        System.out.println("meu!!!!!!!!");
    }

    public void catInfo() {
        System.out.println("This is " + name + " ; age is : " + age);
    }
}

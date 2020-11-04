public class Lesson20 {
    public static void main(String [] args) {
        Human human1 = new Human("Bob", 12);
        human1.info();
        human1.info();
        Human human2 = new Human("Adam");
        human2.info();
        human1.info();

     }
}



class Human {
    private String name;
    private int age;
    public static int countPeople;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }
    public Human(String name) {
        this.name = name;
        this.age = 100;
        countPeople++;
    }

    public void info() {
        System.out.println("name : " + name + " ; age : " + age + " ," + countPeople);
    }

}

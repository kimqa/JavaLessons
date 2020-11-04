package Interfaces;

public class Pet implements Info{
    public int id;

    public Pet(int id) {
        this.id = id;
    }

    public void showInfo(){
        System.out.println(this.id);
    }

    public void sleep() {
        System.out.println("sleep");
    }

}

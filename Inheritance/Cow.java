package Inheritance;

public class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos");
    }

    public static void main(String[] args) {
        Animal a = new Cow();
        a.sound();
    }
}

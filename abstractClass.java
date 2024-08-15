abstract class Animal {
    public abstract void sound();
}
class Cat extends Animal {
    public void sound() {
        System.out.println("Meow");
    }
    public void color() {
        System.out.println("Grey");
    }
}

class Human {
    private String food = "Wheat"; //can be only accessed within the Human class
    public void eat() {
        System.out.println("Human eating");
    }
}
class Boy extends Human {
    public void eat() {
        System.out.println("Boy eating");
//        return 5;
    }
}



public class abstractClass {
    public static void main(String[] args ) {
        Animal obj = new Cat();
        obj.sound();
//        obj.Color();
        Cat cat = new Cat();
        cat.sound();
        cat.color();
        Human h = new Human();
        h.eat();

        Boy b = new Boy();
        b.eat();
    }
}


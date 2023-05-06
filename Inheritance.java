import java.util.*;

// Inheritance is a process where one class acquires the properties (methods and
// fields) of another.
// With the use of inheritance the information is made manageable in a
// hierarchical order.
// ================================================================================================
class animal { // Super class or Parent class or Base class
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Live");
    }
}
// ============= SINGLE INHERITANCE
// =================================================================

class fish extends animal { // Sub class or Child class or Derived class
    int fins;

    void swim() {
        System.out.println("Swims");
    }
}
// ================================================================================================
// MULTILEVEL INHERITANCE

class mammals extends animal { // Sub class or Child class or Derived class
    int legs;

    void legs() {
        System.out.println("Moveable");
    }
}

class dog extends mammals { // Sub class or Child class or Derived class
    String breed;

    void type() {
        System.out.println("German Sheperd");
    }
}
// ================================================================================================
// HIERARCHICAL INHERITANCE

class cat extends animal { // Sub class or Child class or Derived class
    String breed;

    void type() {
        System.out.println("Persian");
    }
}

class tiger extends animal { // Sub class or Child class or Derived class
    String breed;

    void type() {
        System.out.println("Bengal");
    }
}

class lion extends animal { // Sub class or Child class or Derived class
    String breed;

    void type() {
        System.out.println("African");
    }
}
// ================================================================================================
// MULTIPLE INHERITANCE

class bird extends animal { // Sub class or Child class or Derived class
    int wings;

    void fly() {
        System.out.println("Fly");
    }
}

class parrot extends bird { // Sub class or Child class or Derived class
    String breed;

    void type() {
        System.out.println("African Grey");
    }
}

class peacock extends bird { // Sub class or Child class or Derived class
    String breed;

    void type() {
        System.out.println("Indian");
    }
}

// ================================================================================================
public class Inheritance {
    public static void main(String[] args) {
        fish shark = new fish();
        shark.eat();
        dog dobby = new dog();
        dobby.eat();
        dobby.legs = 4;
        System.out.println(dobby.legs);
        dobby.type();
        parrot p = new parrot();
        p.eat();
        p.fly();
        p.type();

    }
}

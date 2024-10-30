class Animal {
    String name;
    int age;
    String color;

    void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Color: " + color);
    }
}

class Dog extends Animal {

    String breed;
    String size;
    int weight;

    void bark() {
        System.out.println("The dog is barking. Breed: " + breed + ", Size: " + size + ", Weight: " + weight);
    }
}

public class AnimleSingleInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.name = "Bantu";
        dog.age = 17;
        dog.color = "Brown";
        dog.breed = "Labrador";
        dog.size = "Large";
        dog.weight = 50;

        dog.displayInfo();
        dog.bark();
    }
}

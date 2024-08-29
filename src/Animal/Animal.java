package Animal;

public class Animal {
    public void voice() {
        System.out.println("Animal makes a sound");
    }

    public void eat(String food) {
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Dog barks: Woof!");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Dog loves meat!");
        } else {
            System.out.println("Dog dislikes " + food + "!");
        }
    }
}

// Класс Tiger, наследует Animal
class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Tiger roars: Roar!");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Tiger loves to eat meat!");
        } else {
            System.out.println("Tiger dislikes " + food + "!");
        }
    }
}

// Класс Rabbit, наследует Animal
class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Rabbit squeaks: Squeak!");
    }

    @Override
    public void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Rabbit enjoys eating grass!");
        } else {
            System.out.println("Rabbit dislikes " + food + "!");
        }
    }
}

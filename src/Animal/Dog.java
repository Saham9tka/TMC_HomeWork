package Animal;

public class Dog extends Animal {
    @Override
    public void voice() {
        System.out.println("Dog barks: Woof!");
    }
    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Dog loves meat!");
        } else {
            System.out.println("Dog dislikes " + food);
        }
    }
}
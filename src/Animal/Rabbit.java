package Animal;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Rabbit squeaks: Squeak!");
    }
    @Override
    public void eat(String food) {
        if (food.equals("Grass")) {
            System.out.println("Rabbit enjoys eating grass!");
        } else {
            System.out.println("Rabbit dislikes " + food);
        }
    }
}

package Animal;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Tiger roars: Roar!");
    }
    @Override
    public void eat(String food) {
        if (food.equals("Meat")) {
            System.out.println("Tiger loves to eat meat!");
        } else {
            System.out.println("Tiger dislikes " + food);
        }
    }
}

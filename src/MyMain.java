import Animal.*;

public class MyMain {
        public static void main(String[] args) {
            // Создание объектов для каждого животного
            Animal dog = new Dog();
            Animal tiger = new Tiger();
            Animal rabbit = new Rabbit();


            dog.voice();
            dog.eat("Meat");
            dog.eat("Grass\n");

            tiger.voice();
            tiger.eat("Meat");
            tiger.eat("Grass\n");

            rabbit.voice();
            rabbit.eat("Grass");
            rabbit.eat("Meat");
        }

}

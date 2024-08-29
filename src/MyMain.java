import Animal.Animal;

public class MyMain {
        public static void main(String[] args) {
            // Создание объектов для каждого животного
            Animal dog = new Dog();
            Animal tiger = new Tiger();
            Animal rabbit = new Rabbit();

            // Тестирование методов
            dog.voice(); // Собака издает звук
            dog.eat("Meat"); // Собака ест мясо
            dog.eat("Grass"); // Собака не любит траву

            tiger.voice(); // Тигр издает звук
            tiger.eat("Meat"); // Тигр ест мясо
            tiger.eat("Grass"); // Тигр не любит траву

            rabbit.voice(); // Кролик издает звук
            rabbit.eat("Grass"); // Кролик ест траву
            rabbit.eat("Meat"); // Кролик не любит мясо
        }

}

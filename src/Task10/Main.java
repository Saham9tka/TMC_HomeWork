package Task10;

public class Main {
        public static void main(String[] args) {
            getUser();
        }

        static void getUser() {
            User[] users = new User[] {
                    new User("Lim", 18),
                    new User("Vitaliy", 18),
                    new User("Vitaliy", 18)
            };

            for (User user: users) {
                System.out.println(user);
                System.out.println("HashCode: " + user.hashCode());
                System.out.println("____________________________");
            }

            System.out.println(users[0].equals(users[1]));
            System.out.println(users[1].equals(users[2]));
        }
}

package Task10;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
    @Override
    public boolean equals(Object o) {
        User user = (User) o;
        return (this.name.equals(user.name)) && (this.age == user.age);

    }
    @Override
    public int hashCode() {
        return 100*name.hashCode();
    }
}

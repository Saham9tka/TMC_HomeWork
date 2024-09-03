package Task1;

public abstract class Person implements Role {
    private final String name;
    private final String role;

    Person(String name, String role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public final void GiveTitle() {
        System.out.println(this.name + "'s title is \"" + this.role + "\"...");
    }

}
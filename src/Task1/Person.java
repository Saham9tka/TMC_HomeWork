package Task1;

public abstract class Person implements Disposition {
    private final String name;
    private final String title;

    Person(String name, String title) {
        this.name = name;
        this.title = title;
    }

    @Override
    public final void GiveTitle() {
        System.out.println(this.name + "'s title is \"" + this.title + "\"...");
    }

}
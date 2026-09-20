package encapsulation.class_problems;

// Runs the nickname tag sample and checks two tags stay separate objects.
public class P3_NameTagDemo {
    public static void main(String[] args) {
        NameTag tag = new NameTag("Maria Gomez");
        System.out.println("getNickname() -> " + tag.getNickname());

        NameTag other = new NameTag("Maria Gomez");
        System.out.println("Same nickname: " + tag.getNickname().equals(other.getNickname()));
        System.out.println("Same object: " + (tag == other));
    }
}

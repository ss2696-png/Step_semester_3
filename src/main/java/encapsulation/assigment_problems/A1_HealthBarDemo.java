package encapsulation.assigment_problems;

// Runs the health bar sample from the assignment sheet.
public class A1_HealthBarDemo {
    public static void main(String[] args) {
        Character c = new Character(100);
        c.takeDamage(30);
        System.out.println("takeDamage(30) -> health = " + c.getHealth());
        c.heal(50);
        System.out.println("heal(50) -> health = " + c.getHealth() + " (capped)");
        c.takeDamage(150);
        System.out.println("takeDamage(150) -> health = " + c.getHealth() + " (floored)");
    }
}

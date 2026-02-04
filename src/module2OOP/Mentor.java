package module2OOP;

public class Mentor extends User implements Runnable{
    public Mentor(String id, String name) {
        super(id, name);
    }

    @Override
    public String getRole() {
        return "MENTOR";
    }

    @Override
    public void run() {
        System.out.println("I can run fast");
    }
}

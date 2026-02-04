package module2OOP;

public class Student extends User implements Learnable, Runnable {

    String lastName;
    int age;
    int course;

    public Student(String id, String name) {
        super(id, name);
    }
    public Student(String id, String name, String lastName, int age, int course){
        super(id, name);
        this.lastName = lastName;
        this.age = age;
        this.course = course;
    }

    @Override
    public void study(String topic) {
        System.out.println(name + " studies: " + topic);
    }

    @Override
    public String getRole() {
        return "STUDENT";
    }

    @Override
    public void tryStudy(String topic) {
        study(topic);
    }

    @Override
    public void run() {
        System.out.println("I can run, but not fast");
    }
}

package module2OOP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new Student("1l","Sandi"));
        users.add(new Student("2d","Aisha","Akhmetova", 20, 3));
        users.add(new Mentor("1","Anuar"));
        for (User user : users){
            user.getInfo();
            System.out.println("Role " + user.getRole());
            System.out.println();

            if (user instanceof Learnable){
                ((Learnable) user).study("OOP");
                System.out.println(user);
                System.out.println();
            }

            if (user instanceof Runnable){
                ((Runnable) user).run();
                System.out.println(user);
                System.out.println();
            }
        }

        List<Student> students = new ArrayList<>();
        students.add(new Student("3s","Oralbek","Urusbekov",20,3));
        students.add(new Student("1l","Marat"));
    }
}

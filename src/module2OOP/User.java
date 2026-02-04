package module2OOP;

public abstract class User {
    String id;
    String name;

    public User(String id, String name){
        this.id = id;
        this.name = name;
    }

    public abstract String getRole();
    public void getInfo(){
        System.out.println("ID: " + id + ", Name: " + name);
    }
    public void tryStudy(String topic) {
        System.out.println("I study");
    }
}

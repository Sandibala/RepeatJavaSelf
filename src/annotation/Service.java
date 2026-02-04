package annotation;

public class Service {
   @Log("Создание пользователя")
    public void createUser(String name) {
        System.out.println("Пользователь " + name + " создан!");
    }

   @Log("Удаление пользователя")
    public void deleteUser(String name) {
        System.out.println("Пользователь " + name + " удалён!");
    }
    public void updateuser(String name){
        System.out.println("Update username");
    }

    public void sayHello() {
        System.out.println("Привет!");
    }
}

package generic;

import java.util.ArrayList;
import java.util.function.Supplier;

public class AddTenListAlternative<T> {
    private ArrayList<T> arrayList = new ArrayList<>();

    public  AddTenListAlternative(Supplier<T> factory){
        for (int i = 0; i < 10; i++) {
            arrayList.add(factory. get());
        }
    }
    public ArrayList<T> getArrayList(){
        return arrayList;
    }
}
//Supplier<T> спец интерейс для выдачи элементов
// Есть еще класс Consumer когда что то нужно принимать

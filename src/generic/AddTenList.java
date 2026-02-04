package generic;

import com.sun.jdi.InvocationException;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class AddTenList<T> {
    private ArrayList<T> list = new ArrayList<>();

    public AddTenList(Class<T> tClass){
        for (int i = 0; i < 10; i++) {
            T instanceOfT = null;
            try {
                instanceOfT = (T) tClass.getDeclaredConstructor(null).newInstance(null);
                list.add(instanceOfT);
            } catch (InstantiationException e){
                e.printStackTrace();
            } catch (IllegalAccessException e){
                e.printStackTrace();
            } catch (InvocationTargetException e){
                e.printStackTrace();
            } catch (NoSuchMethodException e){
                e.printStackTrace();
            }
        }
    }
public ArrayList<T> getList(){
        return list;
}
}

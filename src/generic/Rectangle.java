package generic;

public class Rectangle {
    public static void main(String[] args) {
        AddTenList<Rectangle> list = new AddTenList<>(Rectangle.class);
        System.out.println("Reflection list size = " + list.getList().size());

        AddTenListAlternative addTenListAlternative = new AddTenListAlternative(Rectangle :: new);
        AddTenListAlternative addTenListAlternative2 = new AddTenListAlternative(() -> new Rectangle());
        System.out.println("Lambda list size = " + addTenListAlternative.getArrayList().size());
        System.out.println("Lambda(anon) list size = " + addTenListAlternative2.getArrayList().size());

    }
}

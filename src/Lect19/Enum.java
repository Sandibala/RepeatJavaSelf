package Lect19;
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
public class Enum {
    public static void main(String[] args) {
        Day today = Day.FRIDAY;
        System.out.println(today);            // FRIDAY
        System.out.println(today.ordinal());  // 4 (порядковый номер)

        // Массив всех дней
        for(Day d : Day.values()) {
            System.out.println(d);
        }
    }


}

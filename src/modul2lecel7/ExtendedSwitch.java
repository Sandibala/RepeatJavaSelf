package modul2lecel7;

public class ExtendedSwitch {
    public static void main(String[] args) {
        int day = 3;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            default -> "Other";
        };
        System.out.println(dayName); // Wednesday


        String type = switch (day) {
            case 1, 2, 3 -> "Weekday";
            case 4, 5 -> "Almost weekend";
            default -> "Weekend";
        };
        System.out.println(type);
    }
}

package enumPackage;

public class Main {
    public static void main(String[] args) {
        Music mc = Music.CLASSIC;//Первый способ создания объекта класса
        for (Music element : Music.values()) {
            System.out.println(element);
        }
        Music mc2 = Music.valueOf(Music.class, "POP");//Второй способ создания объекта класса Music
        System.out.println(mc + " and " + mc2);


        Day[] days = Day.values(); //тут сохранен массив дней
        Day day1 = Day.MONDAY;
        //Day day2 = Day.TUESDAY;
        Day day3 = Day.WEDNESDAY;
        Day day4 = Day.THURSDAY;
        Day day5= Day.FRIDAY;
        Day day6 = Day.SATURDAY;
        Day day7 = Day.SUNDAY;
        for (Day day : days) {
            System.out.println(days);
        }
        Day day2 = Day.valueOf(Day.class, "TUESDAY");
        //Метод ordinal() возвращает порядковый номер константы. Вызывать его нужно не у класса enum, а у значения enum:
        System.out.println("омер константы " + day2.ordinal());

        //Чтобы преобразовать объект типа enum в строку, у него нужно вызвать метод toString().
        String str = Day.MONDAY.toString();
        //   Для обратного преобразования (строки в объект Day) можно воспользоваться статическим методом valueOf():

        Day day = Day.valueOf("MONDAY");
        //Как преобразовать объект типа enum в число, вы уже знаете: для этого нужно вызвать метод ordinal():

        int index = Day.MONDAY.ordinal();
        // Для обратного преобразования (числа в объект Day) нужно воспользоваться конструкцией подлиннее:

       // Day day3 = Day.values()[2];
        System.out.println(day3);

        Day d = Day.valueOf("MONDAY");
        System.out.println(d);
        int w = Day.TUESDAY.ordinal();
        System.out.println(w);
        Day newDay = Day.values()[index+2];
        System.out.println(newDay);
    }
}

package lambda.example2;

import java.util.*;
import java.util.stream.Collectors;

public class Realization {
    public static void main(String[] args) {

        MonitoringSystem mshop = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Monitoring of the shop");
            }
        };

        // -----Лямбда виразу цьому випадку виглядатиме так: --------------------------------------------
        MonitoringSystem mshop1 =
                () -> {
                    System.out.println("Monitoring of the shop");
                };
        //------------------------------------------------------------
        MonitoringSystem myard = new MonitoringSystem() {
            @Override
            public void startMonitoring() {
                System.out.println("Monitoring of the yard!");
            }
        };

        // -----Лямбда виразу цьому випадку виглядатиме так: --------------------------------------------
        MonitoringSystem myard1 = () -> System.out.println("jajaja");
        //------------------------------------------------------------

        mshop.startMonitoring();
        myard.startMonitoring();

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        for (int item : integers) {
            System.out.print(item + " ");
        }
        // -----Лямбда виразу цьому випадку виглядатиме так: --------------------------------------------

        System.out.println();
        List<Student> students = new ArrayList<>();
        students.add(new Student("Nino", 36));
        students.add(new Student("Said", 35));
        students.add(new Student("Ivanna", 20));
        students.add(new Student("Oleh", 17));
        students.add(new Student("Ira", 18));

        long count = students.stream()
                .filter(student -> student.age < 30)
                .filter(student -> student.name.length() <= 4)
                .map(student -> student.name)
                .count();

        System.out.println("Кількість студентів менше 30 років, з іменем на 4 або менше літери = " +
                +count);
//----Перетворити Ліст стрінгів на Ліст інтив
        List<String> list = Arrays.asList("Hello", "wonderfull", "world!");
        List<Integer> list2 = list.stream()
                .map(el -> el.length())
                .collect(Collectors.toList());
        System.out.println("List2 : " + list2);

//-----------------------------------------------------------------------------
        //--Маємо ліст стрінгів. Вивести великими літерами слова з двох літер, які містять букву "і"
        List<String> list3 = Arrays.asList("hello", "it", "is", "me");
        List<String> list4 = list3.stream()
                .filter(e -> e.length() == 2)
                .filter(e -> e.contains("i"))
                .map(e -> e.toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
        System.out.println("List4 :" + list4);
//--або ще так можна:--------------------------------------------------------
        List<String> s = Arrays.asList("hello", "it", "is", "me");
        s.stream()
                .filter(String -> String.length() == 2)
                .filter(String -> String.contains("i"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

//------------------------------------------------------------------------------
        List<String> str3 = Arrays.asList("Nash", " hotel", " vitae", " vas!");

        for (String a : str3) {
            int size = a.length();
            System.out.print(String.valueOf(size) + " ");
        }
//Можна вирішити цю задачу через стріми:
        List<Integer> l2 = str3.stream()
                .map(element -> element.length())
                .collect(Collectors.toList()); //collect - перетворив потік на Ліст
        System.out.println(l2);
//-------------------------------------------------------------------------------------------------------------------
//вивести  елементи масиву, якщо елемент  / на 3 без остачі, то поділити його на 3 і вивести на екран

        int[] m1 = {3, 12, 14, 15};
        m1 = Arrays.stream(m1)
                .map(el -> {
                    if (el % 3 == 0) {
                        el = el / 3;
                    }
                    return el;
                }).toArray();//перетворить потік знову на масив
        System.out.println("Новий потік: " + Arrays.toString(m1));
//-------------------------------------------------------------------------------------------------------------------
        //Перетворити Set стрінгів на Set інтів, де int - довжини стив
        Set<String> set = new TreeSet<>();
        set.add("pryvit");
        set.add("kak dela");
        set.add("ok");
        set.add("zzz");
        set.add("poka");
        System.out.println("Old set: " + set);

        Set<Integer> set2 = set.stream()
                .map(el -> el.length())
                .collect(Collectors.toSet());
        System.out.println("Set2: " + set2);
//----------------------------------------------------------------------------------------------
        //      //Перетворити Set стрінгів на List , де int - довжини стив

        Set<String> set11 = new TreeSet<>();
        set11.add("pryvit");
        set11.add("kak dela");
        set11.add("ok");
        set11.add("zzz");
        set11.add("poka");

        List<Integer> list5 = set11.stream()
                .map(e -> e.length())
                .collect(Collectors.toList());
        System.out.println("List5: " + list5);
//-----------------------------------------------------------------------------------------------
        //Вивести на екран студентів яким 22 роки та які мають середній бал <= 4
        Student st1 = new Student("Ira", 'f', 22, 4, 4.9);
        Student st2 = new Student("Volodymyr", 'm', 18, 2, 5);
        Student st3 = new Student("Misha", 'm', 22, 6, 3.9);
        Student st4 = new Student("Inna", 'f', 17, 1, 4.1);
        Student st5 = new Student("Nazar", 'm', 22, 3, 3.8);

        List<Student> students2 = Arrays.asList(st1, st2, st3, st4, st5);
        //відсортувати студентів вік яких 22 рокив та оцінка < 4

        List<Student> students3 = students2.stream()
                .filter(ss -> ss.age == 22 && ss.avgGrade <= 4)
                .collect(Collectors.toList());
        System.out.println("students3 = " + students3);


//-----------Метод foreach - допомагає пройтися по віх елементах та , наприклад, вивести їх на екран
        //Метод foreach вертає void!!!!
        //--------Подвоїти елемент масиву та вивести на екран----------
        int[] arrayMy = new int[]{11, 21, 31, 41, 51};
        System.out.print("arrayMy2 : ");
        Arrays.stream(arrayMy)
                .forEach(e -> {
                    e = e * 2;
                    System.out.print(e + " ");
                });

        //або ще так можна записати:
        Arrays.stream(arrayMy)
                .forEach(System.out::println); //це називається метод-reference


        //-----------Метод reduce - зменшуємо к-сть елементів в стрімі до одного
        //Використовуємо для отримання агрегатних функцій : + - *
        //reduce вертає тип optional
        //------Приклад: знайти добуток всіх елементів масиву------
        List<Integer> li = Arrays.asList(5, 8, 2, 4, 3);

        int result = li.stream().reduce((accumulator, element ) ->
                accumulator * element).get();
        System.out.println("Result: " + result);
        //як це працює:
        // accumulator = 5(перше число з масиву)
        // element = 8 (друге число з масиву) -->відбувається множення 5 х 8--> тепер accumulator=40
        //accumulator x 2 (третє число з масиву)


        //-----------Метод sorted- сортує масив----------------------------------------
        //тут нічого зайвого не пишемо , бо джава знає як сортувати int
        int [] arrayK = {3,8,1,5,9,12,4,21,81,7,18};
        arrayK = Arrays.stream(arrayK)
                .sorted()
                .toArray();
        System.out.println("arrayK): ");
        System.out.println(Arrays.toString(arrayK));







    }
}
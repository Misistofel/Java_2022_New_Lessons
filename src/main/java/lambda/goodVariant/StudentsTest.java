package lambda.goodVariant;

import java.util.ArrayList;

public class StudentsTest {
    public static void main(String[] args) {

        Student st1 = new Student("Ivan", 'm', 20, 3, 4.9);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 3.9);
        Student st3 = new Student("Olena", 'f', 20, 1, 4.5);
        Student st4 = new Student("Petro", 'm', 18, 5, 3.0);
        Student st5 = new Student("Mariya", 'f', 30, 2, 4.0);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentsInfo info = new StudentsInfo();
        //------Варіанти запису лямбда виразів:----------

        //-----------Якщо справа ми вирішили все таки взяти вираз в фігурні дужки - то треба тоді писати return--------
        //--Якщо вказуємо тип параметра Student то беремо параметр в дужки-----------
        info.testStudents(students, (Student p) -> {return p.avgGrade > 8;});
        //--------------Скорочений варіант------------------
        info.testStudents(students,  p -> p.avgGrade > 8);;
        //праворуч від оператора стрілка знаходитьсятіло методу, яку було б у метода класу, який імплементує інтерфейс (з одним  методом)
        //------Якщо метод інтерфейса приймає лише 1 параметер, то ліва частина може бути записана в короткій формі----------

        //--------------Варіант з кількома виразами в правій частині, тоді використовуємо повний варіант написання разом з return ------------------
        info.testStudents(students,  p -> {
            System.out.println("Hello");
            return p.avgGrade > 8;});












//        System.out.println("Students with grade > 4: ");
//        info.testStudents(students, new CheckOverGrade());//це старий метод, ановий - з анонімним класом:
//        System.out.println("-------------------------------------");
//        System.out.println("Students with age  < 21: ");
////        info.testStudents(students, new StudentChecks() {    //це передача анонімного класу - щоб не створювати клас який
////            // імплементує інтерфейс
////            @Override
////            public boolean check(Student s) {
////                return s.age<20;
////            }
////        });
//
//        System.out.println("-------------------LAMBDA EXPRESSION!!------------------");
//        //заміна попереднього запису на короткий
//        System.out.println("Students with age  < 21: ");
//        info.testStudents(students, (Student s) ->  {return s.age<20;});
//        // Замисть того щоб створювати клас , який імплементує інтерфейс StudentChecks, потім оверрайдити його метод,
//        //потім створювати об'єкт цього класу і вставляти його в параметер методу
//        // як тут info.testStudents(students, new CheckOverGrade())
//        //можна просто записати лямбда -вираз
//        System.out.println("-------------------LAMBDA EXPRESSION 2 !!------------------");
//        System.out.println("Students with grade > 4: ");
//        info.testStudents(students, (Student s) ->  {return s.avgGrade>4;});
//        System.out.println("-------------------LAMBDA EXPRESSION 2 !!------------------");
//        System.out.println("Students with age > 19 and grade < 4 and sex=female: ");
//        info.testStudents(students, (Student s) ->  {return s.avgGrade>4&& s.avgGrade>4 && s.sex=='f';});

//        StudentsInfo info = new StudentsInfo();
//        System.out.println("Students with grade > 4: ");
//        info.printStudenstOverGrade(arr, 4);
//        System.out.println("Students with age  < 21: ");
//        info.printStudenstOverAge(arr, 21);
//        System.out.println("Students with age > 19 and grade < 4 and sex=female: ");
//        info.printStudenstMixCondition(arr, 19, 6, 'f');
    }
}

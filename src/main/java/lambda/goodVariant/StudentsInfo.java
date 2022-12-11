package lambda.goodVariant;


import java.util.ArrayList;

public class StudentsInfo {

    void testStudents(ArrayList<Student> sl1, StudentChecks sc){
        for(Student s : sl1){
            if (sc.check(s)){//якщо фільтр перевіряє студента і вертає true то
                System.out.println(s);
            }
        }
    }


//        void printStudenstOverGrade(ArrayList<Student> lg, double grade) {
//            for (Student s : lg) {
//                if (s.avgGrade>grade){
//                    System.out.println(s);
//                }
//            }
//        };
//            void printStudenstOverAge (ArrayList < Student > la,int age){
//                for (Student s:la) {
//                    if(s.age<age){
//                        System.out.println(s);
//                    }
//                }
//
//            };
//                void printStudenstMixCondition (ArrayList < Student > lm,int age, double grade, char sex){
//                    for (Student s: lm) {
//                        if (s.age> age && s.avgGrade< grade && s.sex==sex){
//                            System.out.println(s);
//                        }
//                    }
//
//                }

            }

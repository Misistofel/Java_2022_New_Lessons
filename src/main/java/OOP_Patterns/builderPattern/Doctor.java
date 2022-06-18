package OOP_Patterns.builderPattern;

import java.util.Set;

public class Doctor {
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Doctor> colleagues;
    /*
    Ми хочемо для цього класу задати всі можливі варіанти конструкторів, які нам можуть знадобитися.,щоб у різних частинах коду використовувати
     різні конструктори та створювати екземпляри класу Doctor з різними кількістю заповнених полів (наприклад, у нас у класі 6 поля.
     А ми хочемо заповнити тільки 3 поля).
//     */
//    Doctor (String name, String surname){
//        this.name = name;
//        this.surname = surname;
//    }
//
//    Doctor (String name, String surname, int age){
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//    }
//
//    Doctor (String name, String surname, int age, int height){
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.height = height;
//    }
//всього 3 конструктора, а може бути набагато більше. дуже
// легко буде випадково перепутати параметри місцями. Наприклад, якщо ми напишем Doctor("Marina", "T") замість Doctor("T", "Marina) -
// перепутаємо місцями ім'я та фамілію? Параметри мають одинаковий тип і ми можемо довго не сприймати помилку.

    //Створимо всередині класу ще один клас - Builder
    public static class Builder {
        private Doctor newDoctor;

        public Builder() {
            newDoctor = new Doctor();
        }

        public Builder withName(String name){
            newDoctor.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            newDoctor.surname = surname;
            return this;
        }

        public Builder withAge(int age){
            newDoctor.age = age;
            return this;
        }

        public Builder withHeight(int height){
            newDoctor.height = height;
            return this;
        }

        public Builder withWeight(int weight){
            newDoctor.weight = weight;
            return this;
        }

        public Builder withParents(Set<Doctor> parents){
            newDoctor.colleagues = parents;
            return this;
        }

        public Doctor build(){
            return newDoctor;
        }
//код виглядає набагато простіше. Адже все, що відноситься до створення объекту, винесене в оокремий класс - Builder;
//при заповненні поля об'єкту тепер параметри важко переплутати;
//        ми можемо заповнити не всі параметри класа. Як Ви могли помітити, ми вказали всі параметри крім колег
    }
    }


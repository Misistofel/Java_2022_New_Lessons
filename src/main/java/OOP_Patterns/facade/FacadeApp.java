package OOP_Patterns.facade;

public class FacadeApp {
    public static void main(String[] args) {
//   Після того я як ми створили клас Computer ми можемо більше не писати все це
//    Power power = new Power();
//    power.on();
//
//    DVDRom dvdRom = new DVDRom();
//    dvdRom.load();
//
//    HDD hdd = new HDD();
//    hdd.copyFromDVD(dvdRom);
        Computer computer = new Computer();
        computer.copy();
        //Клас-фасад за нас все зробив: об'єднав в собі усі екземпляри запчастин и в методі сору() визначив порядок дій
    }
}
class Power {
    public void on() {
        System.out.println("Включено комп ON!");
    }

    public void off() {
        System.out.println("Виключено комп OFF!");
    }
}

class DVDRom {
    private boolean data = false;
    public  boolean hasData(){
        return data;
    }

    void load(){
        data = true;
    }

    void unload(){
        data = false;
    }
}

class HDD{
    void copyFromDVD(DVDRom dvd){
        if(dvd.hasData()){
            System.out.println("Відбувається копіювання даних з диску!");
        }else{
            System.out.println("Вставте диск з даними!");
        }
    }
}

//Усе це виглядає складно, тому створимо клас-фасад Computer
class Computer{
    Power power = new  Power();
    DVDRom dvdRom = new DVDRom();
    HDD hdd = new HDD();
    //створюємо лише один метод copy()який виконуватиме всю складну роботу
    void copy(){
        power.on();
        dvdRom.load();
        hdd.copyFromDVD(dvdRom);

    }
}

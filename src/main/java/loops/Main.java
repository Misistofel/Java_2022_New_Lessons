package loops;

public class Main {
    public static void main(String[] args) {


        //for loop викор  коли чітко відома к-сть повторнеь
        //у While loopми заздалегідь не знаємо к-сть повторень

//        int i = 1;
//        while(i < 11){
//            System.out.println(i);
//            i++;
//        }

//        int a = 1;
//        do{
//            System.out.println(a++);
//        } while (a<10);

        boolean b = true;
        int a = 21;
      while(b){
         if(a % 3 ==0 && a % 7 ==0){
             System.out.println(a);
             b = false;
         }
        }


    }
}

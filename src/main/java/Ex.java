import java.util.ArrayList;
import java.util.List;

public class Ex {


    public static void main(String[] args) {

int [] arr = {11,2,9,4};
int [] arr1 = new int [10];

char d = 'f';
String f = "Olga";


        String str = "ABCD";
        char [] st = str.toCharArray();
        for (int i=0; i<st.length; i++){
            System.out.println(st[i]);
        }

        User user1 = new User("Sasha");
        User user2 = new User("Sveta");

        List <User> ul = new ArrayList<User>();
        ul.add(user1);
        ul.add(user2);
        getGeneric(ul);


        String a = "Privit!";
        String b = new String("Privit!");
        System.out.println(a.equals(b));
        System.out.println(a==b);

        String mon = "Feb";
        switch(mon){
            case "Jan":
            case "Feb":
            case "Dec":
                System.out.println("This is winter");
                break;
            case "Mar":
            case "Apr":
            case "May":
                System.out.println("This is spring");
                break;
            default:
                System.out.println("WRONG value!");
        }



//        int d = 2;
//        int c = 0;
//        try{
//            int f = d/c;
//        }catch(Exception e){
//            e.printStackTrace();
//        }
    }

    public static <T>T getGeneric(List<T> list){
    return list.get(1);
    }





        int a = 123;

         public int getVisaVersa(int a){
        String s = String.valueOf(a);
        int b = s.length();
        String first = s.substring(0, 1);
        String second = s.substring(1, 2);
        String third = s.substring(2, 3);
        System.out.println(first + " " + second + " " + third);
        String result = third+second+first;
        int res = Integer.parseInt(result);
        return res;
    }

    }

    class User{
    String name;

        public User(String name) {
            this.name = name;
        }

    }


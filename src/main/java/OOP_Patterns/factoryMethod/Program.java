package OOP_Patterns.factoryMethod;

public class Program {
    public static void main(String[] args) {

       // Developer d = new JavaDeveloper();
//        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        DeveloperFactory developerFactory = createDeveloperBySpeciality("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

        static DeveloperFactory createDeveloperBySpeciality(String speciality){
            if (speciality.equalsIgnoreCase("Java")){
                return new JavaDeveloperFactory();
            }else if(speciality.equalsIgnoreCase("C++")) {
                return new CppDeveloperFactory();
            }else if(speciality.equalsIgnoreCase("php")){
                return new PhpDeveloperFactory();
            }else{
                throw new RuntimeException(speciality + " is not unknown speciality!");
            }

    }
}

package OOP_Patterns.decorator;

public class Main {
    public static void main(String[] args) {

//        Developer dev = new SeniorJavaDeveloper(new JavaDeveloper());
        Developer dev = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(dev.makeJob());
        //Уявімо що ми хочемо , щоб роботу виконував не просто розробник а Seniourрозробник, який має ще додаткові обовєязки та можливості
        //для цього створимо клас DeveloperDecorator
    }
}

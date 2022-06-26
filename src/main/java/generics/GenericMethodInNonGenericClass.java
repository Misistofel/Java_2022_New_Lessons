package generics;

public class GenericMethodInNonGenericClass {
    <T> void sampleMethod(T[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String args[]) {
        GenericMethodInNonGenericClass gmingc = new GenericMethodInNonGenericClass();
        Integer intArray[] = {45, 26, 89, 96};
        gmingc.sampleMethod(intArray);
        String stringArray[] = {"Nastia", "Darina", "Masha", "Ira"};
        gmingc.sampleMethod(stringArray);
    }
}

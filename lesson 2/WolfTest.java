public class WolfTest {
    public static void main(String [] args) {

        Wolf wolfOne = new Wolf();
        wolfOne.gender = "male";
        wolfOne.name = "Clyk";
        wolfOne.weight = 10.4f;
        wolfOne.age = 4;
        wolfOne.color = "grey";

        System.out.println("The name of the wolf - " + wolfOne.name);
        System.out.println("Gender - " + wolfOne.gender);
        System.out.println("Weight - " + wolfOne.weight + " kg");
        System.out.println("Age - " + wolfOne.age + " years");
        System.out.println("Color - " + wolfOne.color);

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.hunt();
        wolfOne.whine();
    }
}
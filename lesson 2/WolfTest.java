public class WolfTest {
    public static void main(String [] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("male");
        wolfOne.setName("Clyk");
        wolfOne.setWeight(10.4f);
        wolfOne.setAge(10);
        wolfOne.setColor("grey");

        wolfOne.getColor();
        wolfOne.getName();
        wolfOne.getAge();
        wolfOne.getWeight();
        wolfOne.getGender();

        System.out.println("The name of the wolf - " + wolfOne.getName());
        System.out.println("Gender - " + wolfOne.getGender());
        System.out.println("Weight - " + wolfOne.getWeight());
        System.out.println("Age - " + wolfOne.getAge() + " years");
        System.out.println("Color - " + wolfOne.getColor());

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.hunt();
        wolfOne.howl();
    }
}
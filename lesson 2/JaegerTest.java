public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        Jaeger jaeger2 = new Jaeger("Coyote_Tango", 2.312f, 280.0f, 2, "Japan", "Destroyed");
        
        jaeger1.setName("Cherno_Alfa");
        jaeger1.setWeight(2.412f);
        jaeger1.setHeight(84.34f);
        jaeger1.setNumberPilots(2);
        jaeger1.setOrigin("Russia");
        jaeger1.setStatus("Unknown");
        

        System.out.println("The name of jaeger1 is " + jaeger1.getName());
        System.out.println("Weight is " + jaeger1.getWeight());
        System.out.println("Height is " + jaeger1.getHeight());
        System.out.println("Origin is " + jaeger1.getOrigin());
        System.out.println("Status is " + jaeger1.getStatus());
        System.out.println("The number of pilots is " + jaeger1.getNumberPilots());

        jaeger1.move();
        jaeger1.scanKaiju();
        jaeger1.drift();

        jaeger2.scanKaiju();
    }
}
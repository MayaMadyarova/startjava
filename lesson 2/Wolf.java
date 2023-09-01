public class Wolf {

    private String gender;
    private String name;
    private float weight;
    private int age;
    private String color;

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Incorrect age");
        } else {
            this.age = age;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        System.out.println("walking");
    }

    public void sit() {
        System.out.println("sitting");
    }

    public void run() {
        System.out.println("running");
    }

    public void howl() {
        System.out.println("howling");
    }

    public void hunt() {
        System.out.println("hunting");
    }
}
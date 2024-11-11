public class Projector {

    private String name;
    private int age;
    String color;
    int version;
    String material;
    int width;
    int height;
    
    public void setName(String my_name) {
        this.name = my_name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int my_age) {
        this.age = my_age;
    }
    public Integer getAge() {
        return age;
    }
    public void greet() {
        System.out.println("My name is " + name + "\nI am " + age + " years old");
    }
    public void pullDown() {
        System.out.println("Projector is pulled down");
    }

    public void pullUp() {
        System.out.println("Projector is pulled up");
    }

    public void stop() {
        System.out.println("System stopped");
    }
}







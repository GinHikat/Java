public class Cow {
    private String name;
    private String breed;
    private int age;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setage(int age) {
        this.age = age;
    }
    public int getage() {
        return age;
    }
    public void setbreed(String breed) {
        this.breed = breed;
    }
    public String getbreed() {
        return breed;
    }
    public void printName() {
        System.out.println("Name: " + name);
    }
    public void printbreed() {
        System.out.println("Breed: " + breed);
    }
    public void printage() {
        System.out.println("Age: " + age);
    }
    public void moo() {
        System.out.println("Moo.......");
    }
}
public class ProjectorTestDrive {
    public static void main(String[] args) { 
        System.out.println("Hello world");
        Projector project1 = new Projector();
            project1.color = "black";
            project1.version = 2;
            project1.material = "iron";
            project1.width = 12;
            project1.height = 30;
            project1.setName("Projector");
            System.out.println("my name is " + project1.getName());
            project1.setAge(18);
            project1.greet();
            project1.pullDown();  // Correct method name to
            project1.pullUp();
            project1.stop();
    }
}
public class CowTestDrive {
    public static void main(String[] args) {
        Cow cow1 = new Cow();
        cow1.setName("Cow");
        cow1.setbreed("Aigga");
        cow1.setage(200);
        cow1.printName();
        cow1.printbreed();
        cow1.printage();
        cow1.moo();
    }
}
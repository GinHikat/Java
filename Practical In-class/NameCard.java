public class NameCard {
    private String name;
    private int phone;
    private String email;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setphone(int phone) {
        this.phone = phone;
    }
    public int getphone() {
        return phone;
    }
    public void setmail(String mail) {
        this.email = mail;
    }
    public String getmail() {
        return email;
    }
    public void printName() {
        System.out.println("Name: " + name);
    }
    public void printPhone() {
        System.out.println("Phone: " + phone);
    }
    public void printmail() {
        System.out.println("Email: " + email);
    }

}
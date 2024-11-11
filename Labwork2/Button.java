
public class Button {
    private String label;
    private String color;
    public void setColor(String color) {
        if(color != "") {
            this.color = color;
        }
    }
    public String getColor() {
        return this.color;
    }
    public void setLabel(String label) {
        if(label != "") {
            this.label = label;
        }
    }
    public String getLabel () {
        return this.label;
    }
    public void dePress() {
        System.err.println("System depressed");
    }
    public void unDepress() {
        System.err.println("System undepressed");
    }
}

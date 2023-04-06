abstract public class Shape {
    protected String color;
    protected boolean filled;
    public void Shape() {

    }
    public void Shape(String inputColor, boolean inputFilled) {
        filled = inputFilled;
        color = inputColor;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String inputColor) {
        color = inputColor;
    }
    public boolean getFilled() {
        return filled;
    }
    // Прототипы функций
    public double getArea() {
        return 0;
    }
    public double getPerimeter() {
        return 0;
    }
    public String toString() {
        return "\nColor: " + color + "\nFilled: " + filled + "\n";
    }

}

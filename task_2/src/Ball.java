public class Ball {
    private double x = 0.0;
    private double y = 0.0;
    public Ball(double inputX, double inputY) {
        x = inputX;
        y = inputY;
    }
    public Ball() { };
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double inputX) {
        x = inputX;
    }
    public void setY(double inputY) {
        y = inputY;
    }
    public void setXY(double inputX, double inputY) {
        x = inputX;
        y = inputY;
    }
    public void move(double inputX, double inputY) {
        x += inputX;
        y += inputY;
    }
    public String toString() {
        return "Ball position: (" + x + ", " + y + ")";
    }
}

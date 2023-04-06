public class MovablePoint implements Movable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public MovablePoint() { };
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString()
    {
        return "\nx: " + x + "\ny: " + y + "\nxSpeed: " + xSpeed + "\nySpeed" + ySpeed;
    }
    public void moveRight()
    {
        x = x + xSpeed;
    }
    public void moveLeft()
    {
        x = x - xSpeed;
    }
    public void moveUp()
    {
        y = y + ySpeed;
    }
    public void moveDown()
    {
        y = y - ySpeed;
    }
}

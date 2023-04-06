public class Square extends Rectangle
{
    protected double side;
    public Square()
    {

    }
    public Square(double side)
    {
        this.side=side;
        this.width=this.length=side;
    }
    public Square(double side, String color, boolean filled)
    {
        this.length=side;
        this.color=color;
        this.filled=filled;
        this.width=this.length=side;
    }
    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        this.side=side;
    }

    @Override
    public void setWidth(double side)
    {
        this.width=side;
    }

    @Override
    public void setLength(double side)
    {
        this.length=side;
    }

    @Override
    public String toString()
    {
        return "\nColor: "+ color +"\nFilled: " + filled + "\nSide:" + side + "\n";
    }
}

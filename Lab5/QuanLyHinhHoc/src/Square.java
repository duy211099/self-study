public class Square implements IShape{
    private double length;
    
    public Square(double length){
        this.length=length;
    }
    
    @Override
    public double getArea(){
        return length*length;
    }
    
    @Override
    public double getPerimeter(){
        return 4*(length);
    }
}

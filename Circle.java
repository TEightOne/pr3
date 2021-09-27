public class Circle extends Shape {
    protected double r;
    public Circle(){}
    public Circle(double r, String c, boolean f){
        this.r = r;
        this.c = c;
        this.f = f;
    }
    public Circle(double r){
        this.r=r;
    }
    public double getR() {
        return r;
    }
    public void setR(double R) {
        this.r = r;
    }
    public double getArea(){
        return Math.PI*r*r;
    }
    public double getPerimeter(){
        return 2* Math.PI*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
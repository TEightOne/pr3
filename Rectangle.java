public class Rectangle extends Shape {
    protected double w;
    protected double l;
    public Rectangle(){}
    public Rectangle(double w, double l){
        this.w = w;
        this.l = l;
    }
    public Rectangle(double w, double l,String c,boolean f){
        this.w = w;
        this.l = l;
        this.c = c;
        this.f = f;
    }
    public double getW() {
        return w;
    }
    public double getL() {
        return l;
    }

    public void setW(double w) {
        this.w = w;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getArea(){
        return l*w;
    }
    public double getPerimeter(){
        return 2*(l+w);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "w=" + w +
                ", l=" + l +
                '}';
    }
}
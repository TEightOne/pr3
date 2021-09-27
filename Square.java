public class Square extends Rectangle {
    public Square(){}
    public double s;
    public Square(double s){
        this.s = s;
    }
    public Square(double s, String c, boolean f){
        this.s = s;
        this.c = c;
        this.f = f;
    }
    public double getS() {
        return s;
    }
    public void setS(double S) {
        this.s = s;
    }

    @Override
    public void setW(double w) {
        super.setW(w);
    }

    @Override
    public void setL(double l) {
        super.setL(l);
    }

    @Override
    public double getPerimeter() {
        return 4*s;
    }

    @Override
    public double getArea() {
        return s*s;
    }

    @Override
    public String toString() {
        return "Square{" +
                "s=" + s +
                '}';
    }
}
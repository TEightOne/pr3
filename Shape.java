public abstract class Shape {
    protected String c;
    protected boolean f;
    public Shape(){}
    public Shape(String c, Boolean f){
        this.c = c;
        this.f = f;
    }
    public String getC() {
        return c;
    }
    public boolean isF() {
        return f;
    }
    public void setC(String c) {
        this.c = c;
    }
    public void setF(boolean f) {
        this.f = f;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}
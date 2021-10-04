import javax.swing.plaf.IconUIResource;

public class Program {
    public static void main(String[] args) {
        MovablePoint p=new MovablePoint(1,2,3,4);
        MovableCircle c=new MovableCircle(5,p);
        System.out.println(p);
        System.out.println(c);
    }
}

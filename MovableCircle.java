public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle (int x, int y, int xSpeed, int ySpeed,int radius){
        center.x=x;
        center.y=y;
        center.xSpeed=xSpeed;
        center.ySpeed=ySpeed;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    @Override
    public void MoveUp() {
        center.y+=center.ySpeed;
    }

    @Override
    public void MoveDown() {
        center.y-=center.ySpeed;
    }

    @Override
    public void MoveLeft() {
        center.x-=center.xSpeed;
    }

    @Override
    public void MoveRight() {
        center.x+=center.xSpeed;
    }
}
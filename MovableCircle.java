public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle (int radius, MovablePoint center) {
        this.center = center;
        this.radius=radius;
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
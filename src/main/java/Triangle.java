import lombok.Data;

@Data
public non-sealed class Triangle extends Polygon{

    Point p1;
    Point p2;
    Point p3;

    @Override
    public String getArea() {
        return String.format("getArea() called for %s", this.toString());
    }

    @Override
    public String getDiameter() {
        return String.format("getDiameter() called for %s", this.toString());
    }
}

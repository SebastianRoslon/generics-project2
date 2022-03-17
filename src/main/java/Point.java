public record Point(double x, double y) {

    public String distance(Point p){
        return String.valueOf(Math.sqrt(Math.pow((p.x() - x), 2) +  Math.pow((p.y() - y), 2)));
    }

}

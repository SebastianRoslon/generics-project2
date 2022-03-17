sealed interface Shape permits Circle, Polygon{

    public String getArea();

    default String getDiameter() {

        switch (this) {
            case Circle circle -> System.out.println("Circle");
            case Section section -> System.out.println("Section");
            case Triangle triangle -> System.out.println("Triangle");
            default -> System.out.println("Something else");

        }
        return null;

    }

}

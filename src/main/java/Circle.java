import lombok.Data;

@Data
public record Circle(Point p, double r) implements Shape {

     public Circle(Point p, double r) {
         if (r < 0) {
             throw new IllegalArgumentException("var r can't be less than 0");
         }
         this.p = p;
         this.r = r;
     }


     @Override
     public String getArea() {
         return String.format("getArea() called for %s", this.toString());
     }

     @Override
     public String getDiameter() {
         return String.format("getDiameter() called for %s", this.toString());
     }
 }

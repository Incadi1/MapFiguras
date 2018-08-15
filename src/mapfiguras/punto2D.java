
package mapfiguras;

public class punto2D {
    double x;
    double y;

    public punto2D() {
    }

    public punto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Puntos:   " + " x: " + x + "y " + y;
    }
    
    
}

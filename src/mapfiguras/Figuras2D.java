/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapfiguras;

import javafx.scene.paint.Color;

/**
 *
 * @author sebastian.carmona
 */
public class Figuras2D {
     private punto2D Position;
    private Color Color;
    private String Type;
    private double Size;

    public Figuras2D() {
    }

    public Figuras2D(punto2D Position, Color Color, String Type, double Size) {
        this.Position = Position;
        this.Color = Color;
        this.Type = Type;
        this.Size = Size;
    }

    public punto2D getPosition() {
        return Position;
    }

    public void setPosition(punto2D Position) {
        this.Position = Position;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public double getSize() {
        return Size;
    }

    public void setSize(double Size) {
        this.Size = Size;
    }

    @Override
    public String toString() {
        return "Figuras2D{" + "Position=" + Position + ", Color=" + Color + ", Type=" + Type + ", Size=" + Size + '}';
    }
    
    
    
}

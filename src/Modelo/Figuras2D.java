package Modelo;

import javafx.scene.paint.Color;

public class Figuras2D extends punto2D{

    private punto2D Posicion;
    private Color Color;
    private String Tipo;
    private double Tamaño;

    public Figuras2D() {
    }

    public Figuras2D(punto2D Posicion, Color Color, String Tipo, double Tamaño) {
        this.Posicion = Posicion;
        this.Color = Color;
        this.Tipo = Tipo;
        this.Tamaño = Tamaño;
        
    }

    public punto2D getPosicion() {
        return Posicion;
    }

    public void setPosicion(punto2D Posicion) {
        this.Posicion = Posicion;
    }

    public Color getColor() {
        return Color;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public double getTamaño() {
        return Tamaño;
    }

    public void setTamaño(double Tamaño) {
        this.Tamaño = Tamaño;
    }

}

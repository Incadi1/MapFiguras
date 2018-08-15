
package mapfiguras;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PathTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javax.swing.JOptionPane;

public class FXMLDocumentController implements Initializable {
    @FXML
    private Color color;
    @FXML
    private Label Label;
    @FXML
    private Circle cir;
    @FXML
    private Canvas canvas;
    @FXML
    private GraphicsContext lienzo;
    @FXML
    private Rectangle rec;
    @FXML
    private Polygon tri;
    @FXML
    private GraphicsContext CUAD;
    @FXML
    private String tipo = "nada"; 
    @FXML
     Button cuadrado,circulo,triangulo,limpiar;
    @FXML
    private ColorPicker colorclicker;
    
    @FXML
    private void limpiar(ActionEvent event) 
    {
        double w = canvas.getWidth();
        double h = canvas.getHeight();
        lienzo.clearRect(0, 0, w, h);
        lienzo.setStroke(Color.BLACK);
        lienzo.strokeRect(0, 0, w, h);
    }       
    
    @FXML
    private void Label(MouseEvent event) 
    {
       Label.setText("X= "+event.getX()+" , Y= "+event.getY());         
    }
    
    @FXML
    private void GenerarCuadrado(ActionEvent event)
    {
        tipo = "cuadrado";
    }
    
     @FXML
    private void cuadrado(double x, double y, Color color) {

        lienzo.fillRect(x, y, 80, 80);

    }
    
     @FXML
    private void GenerarTriangulo(ActionEvent event)
    {
        tipo="triangulo";
    }
    
     @FXML
    private void triangulo(double x, double y, Color color) 
    {
        double l = 60;
        double h = 60;
        double[] X = {-(l / 2) + x, x, (l / 2) + x};
        double[] Y = {(h / 2) + y, -(h / 2) + y, (h / 2) + y};
        lienzo.fillPolygon(X, Y, 3);
    }
    
     @FXML
    private void GenerarCirculo(ActionEvent event)
    {
        tipo="circulo";
    }
    
    @FXML
    private void circulo(double x, double y, Color color) {
        lienzo.fillOval(x, y, 35, 35);
    }
    
     @FXML
    private void GenerarCuadradoMovil(ActionEvent event)
    {
        tipo="cuadrado movil"; 
        rec.setVisible(true);
        Circle circulo = new Circle(70);
        PathTransition trans = new PathTransition();
        trans.setNode(rec);
        trans.setDuration(Duration.seconds(2));
        trans.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        trans.setCycleCount(PathTransition.INDEFINITE);
        trans.setPath(circulo);
        trans.play();
    }
    
     @FXML
    private void GenerarTrianguloMovil(ActionEvent event)
    {
        tipo = "triangulo movil";
        tri.setVisible(true);
        Circle circulo = new Circle(70);
        PathTransition transition = new PathTransition();
        transition.setNode(tri);
        transition.setDuration(Duration.seconds(2));
        transition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transition.setCycleCount(PathTransition.INDEFINITE);
        transition.setPath(circulo);
        transition.play();
    }
    
    @FXML
    private void GenerarCirculoMovil(ActionEvent event)
    {
        tipo = "circulo movil";
        cir.setVisible(true);
        Circle circulo = new Circle(70);
        PathTransition transition = new PathTransition();
        transition.setNode(cir);
        transition.setDuration(Duration.seconds(2));
        transition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        transition.setCycleCount(PathTransition.INDEFINITE);
        transition.setPath(circulo);
        transition.play();
    }
    
    @FXML
    private void EliminarCuadradoMovil(ActionEvent event)
    {
        tipo = "eliminar cuadrado";
        rec.setVisible(false);
    }
    
     @FXML
    private void EliminarTrianguloMovil(ActionEvent event)
    {
        tipo = "eliminar triangulo";
        tri.setVisible(false);
    }
    
     @FXML
    private void EliminarCirculoMovil(ActionEvent event)
    {
        tipo = "eliminar circulo";
        cir.setVisible(false);
    }
    
     @FXML
    private void generarColor(MouseEvent event)
    {
       color = colorclicker.getValue();
       crearFigura(event.getX(), event.getY(), color, tipo);
    }
    
    @FXML
    private void crearFigura(double x, double y, Color color, String tipo) {
        lienzo.setFill(color);

        switch (tipo) {
            case "cuadrado":
                cuadrado(x, y, color);
                break;
            case "circulo":
                circulo(x, y, color);
                break;
            case "triangulo":
                triangulo(x, y, color);
                break;
            case "circulo movil":
                break;
            case "eliminar circulo":
                break;
            case "cuadrado movil":
                break;
            case "eliminar cuadrado":
                break;
            case "triangulo movil":
                break;
            case "eliminar triangulo":
                break;

            default:
                JOptionPane.showMessageDialog(null, "No se selecciono la figura");
                break;

        }

    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lienzo = canvas.getGraphicsContext2D();
        cir.setVisible(false);
        rec.setVisible(false);
        tri.setVisible(false);
        double w = canvas.getWidth();
        double h = canvas.getHeight();
        lienzo = canvas.getGraphicsContext2D();
        lienzo.clearRect(0, 0, w, h);
        lienzo.setStroke(Color.BLUE);
        lienzo.strokeRect(0, 0, w, h);
    }    
    
}

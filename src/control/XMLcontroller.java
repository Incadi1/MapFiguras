
package control;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import Modelo.Figuras2D;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


public class XMLcontroller {
    
    
      
    public static boolean GuardarFiguras(HashMap<String, Figuras2D> FigGeom){
        boolean xml = false;
        
        try{
            Element root = new Element("figuras");
            Document doc = new Document(root);

            for (int i = 0; i < FigGeom.size(); i++) {
                Element objE = new Element("Figuras2D");
                    objE.setAttribute("x", String.valueOf(FigGeom.get("figura"+i).getPosicion().getX()));
                    objE.setAttribute("y", String.valueOf(FigGeom.get("figura"+i).getPosicion().getY()));
                    objE.setAttribute("Tipo", String.valueOf(FigGeom.get("figura"+i).getTipo()));
                    objE.setAttribute("Tamaño", String.valueOf(FigGeom.get("figura"+i).getTamaño()));
                    objE.setAttribute("Red", String.valueOf(FigGeom.get("figura"+i).getColor().getRed()));
                    objE.setAttribute("Green", String.valueOf(FigGeom.get("figura"+i).getColor().getGreen()));
                    objE.setAttribute("Blue", String.valueOf(FigGeom.get("figura"+i).getColor().getBlue()));
                    objE.setAttribute("Opacidad", String.valueOf(FigGeom.get("figura"+i).getColor().getOpacity()));
                    root.addContent(objE);
                }
            XMLOutputter xmlOutput = new XMLOutputter();
            xmlOutput.setFormat(Format.getPrettyFormat());
            xmlOutput.output(doc, new FileWriter("FigGeom.xml"));
            xml = true;
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
        return xml;
    }
    
}

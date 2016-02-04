package ShapeObj;

import Properties.Color;
import Properties.Stroke;

/**
 * Created by Suhyun on 2016. 2. 3..
 */
public class Shape {

    Color color;
    Stroke stroke;

    public Shape(){
        color = new Color();
        stroke = new Stroke();
    }
    public void setColor(float r, float g, float b, float a){
        color.setColor(r, g, b, a);

    }
    public void setStroke(float r, float g, float b, float weight){
        stroke.setStroke(r, g, b, weight);
    }
    public void setPos(int x, int y, int z, int a){}
    public void draw(){
        color.setColorProperties();
        stroke.setStokeProperties();

    }

}

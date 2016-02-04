package Properties;

import Processing.Processing;

/**
 * Created by Suhyun on 2016. 2. 3..
 */
public class Color {

    public float R, G, B, A;
    public void setColor(float r, float g, float b, float a){
        this.R = r;
        this.G = g;
        this.B = b;
        this.A = a;
    }
    public void setColorProperties(){
        Processing.startProcessing.fill(R, G, B, A);
    }
}

package Properties;

import Processing.Processing;

/**
 * Created by Suhyun on 2016. 2. 3..
 */
public class Stroke {

    public float R, G, B, W;

    public void setStroke(float r, float g, float b, float weight){
        this.R = r;
        this.G = g;
        this.B = b;
        this.W = weight;
    }
    public void setStokeProperties(){
        Processing.startProcessing.stroke(R,G,B);
        Processing.startProcessing.strokeWeight(W);
    }
}

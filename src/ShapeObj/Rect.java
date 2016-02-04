package ShapeObj;

import Processing.Processing;

/**
 * Created by Suhyun on 2016. 2. 3..
 */
public class Rect extends Shape {
    int x, y, w, h;
    public void setPos(int x, int y, int w, int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    public void draw(){
        super.draw();
        Processing.startProcessing.rect(x, y, w, h);
    }
}

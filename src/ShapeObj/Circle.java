package ShapeObj;

import Processing.Processing;

/**
 * Created by Suhyun on 2016. 2. 3..
 */
public class Circle extends Shape {

    int x, y, r1, r2;
    public void setPos(int x, int y, int r1, int r2){
        this.x = x;
        this.y = y;
        this.r1 = r1;
        this.r2 = r2;
    }

    public void draw(){
        super.draw();
        Processing.startProcessing.ellipse(x, y, r1, r2);
    }
}

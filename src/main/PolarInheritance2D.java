package main;

public class PolarInheritance2D extends Vector2D{
    public PolarInheritance2D(double x, double y){ super(x,y); }

    public double getAngle(){
        double[] components = this.getComponents();
        double x = components[0];
        double y = components[1];
        double result = 0.0;
        double v = Math.toDegrees(Math.atan(x/y));
        if(x>0 && y>=0){
            result = v;
        }else if(x>0 && y <0){
            result = v + 360;
        }else if(x<0){
            result = v + 180;
        }else if(x==0 && y>0){
            result = 90;
        }else {
            result = 270;
        }
        return result;
    }

}

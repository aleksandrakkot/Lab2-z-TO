package main;

public class Vector3DDecorator implements IVector {
    private IVector srcVector;
    private double z;

    public Vector3DDecorator(double x1, double x2, double x3) {
    }

    @Override
    public double[] getComponents() {
        double[] tab = srcVector.getComponents();
        return  new double[]{tab[0], tab[1], z};
    }
    
    public Vector3DDecorator cross(IVector param){
        double[] comp = param.getComponents();
        double x1 = (param.getComponents()[1] * getComponents()[2] - param.getComponents()[2] * getComponents()[1]);
        double x2 = (param.getComponents()[0] * getComponents()[2] - param.getComponents()[2] * getComponents()[0]);
        double x3 = (param.getComponents()[0] * getComponents()[1] - param.getComponents()[1] * getComponents()[0]);

        return  new Vector3DDecorator(x1,x2,x3);
    }

    public IVector getSrcV(){
       return srcVector;
    }

    @Override
    public double abs() {
        double x = getComponents()[0];
        double y = getComponents()[1];
        double z = getComponents()[2];

        return Math.sqrt(x*x + y*y + z*z);
    }

    @Override
    public double cdot(IVector param) {
        return srcVector.cdot(param) + this.getComponents()[2]*z;
    }
    
}

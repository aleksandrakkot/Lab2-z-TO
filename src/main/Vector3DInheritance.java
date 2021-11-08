package main;

public class Vector3DInheritance extends Vector2D{
    private double z;

    public Vector3DInheritance(double x, double y, double z) {
        super(x, y);
        this.z = z;
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
        double[] comp = param.getComponents();
        double x = getComponents()[0];
        double y = getComponents()[1];
        double z = getComponents()[2];

        return getComponents()[0] + getComponents()[1 ] + this.z*comp[2];
    }

    public double[] getComponents() {
        double[] tab = super.getComponents();
        return  new double[]{tab[0], tab[1], this.z};
        };

    public Vector3DInheritance cross(IVector param) {
        double[] comp = param.getComponents();
        double x1 = (param.getComponents()[1] * getComponents()[2] - param.getComponents()[2] * getComponents()[1]);
        double x2 = (param.getComponents()[0] * getComponents()[2] - param.getComponents()[2] * getComponents()[0]);
        double x3 = (param.getComponents()[0] * getComponents()[1] - param.getComponents()[1] * getComponents()[0]);

        return  new Vector3DInheritance(x1,x2,x3);
    }

    public IVector getSrc(){
        IVector newVector = new Vector2D(getComponents()[0], getComponents()[1]);
        return newVector;
    }

}

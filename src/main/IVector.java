package main;

public interface IVector {
    public double abs();
    public double cdot(IVector param);
    public double[] getComponents();
}

package main;

public class Polar2DAdapter extends Vector2D implements IPolar2D {

    private Vector2D srcVector;

    @Override
    public double getAngle() {
        return 0;
    }

    @Override
    public double abs() {
        return this.srcVector.abs();
    }

}

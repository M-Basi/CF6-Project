package gr.aueb.cf.ch16.skeletal;

public abstract class AbstractRectangle implements IRectangle {
    private double width;
    private double height;
//
//    public AbstractRectangle(){
//
//    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimenter() {
        return (width + height) * 2;
    }

    @Override
    public boolean isSquare() {
        return width == height;
    }
}

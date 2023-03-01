public class  Cuboid <T extends Number>{
    private T width;
    private T height;
    private T length;

    public Cuboid(T width, T height, T length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public double getVolume(){
        return width.doubleValue()*height.doubleValue()*length.doubleValue();
    }

    public String toString(){
        return "This cuboid has :"+
                width+" width, "+
                height+" height, "+
                length+" length.";
    }

    public T getWidth() {
        return width;
    }

    public T getHeight() {
        return height;
    }

    public T getLength() {
        return length;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    public void setLength(T length) {
        this.length = length;
    }

}

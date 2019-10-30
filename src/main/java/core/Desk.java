package core;

public class Desk {
    private String color;
    private String material;
    private double length;
    private double width;
    private double high;

    public Desk(String material, double length, double width, double high){
        this.material = material;
        this.length = length;
        this.width = width;
        this.high = high;
        this.color = "white";
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setMaterial(String material){
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public void setHigh(double high){
        this.high = high;
    }

    public double getHigh(){
        return high;
    }

    public String toString(){
        return "Material = " + material +
                "\nColor = " + color +
                "\nLength = " + length +
                "\nWidth = " + width +
                "\nHigh = " + high;
    }

    public double getVolume(){
        return high * width * length;
    }

    public double doBarelRoll(){
        double result = high;
        if (result < width){
            result = width;
        }
        if (result < length){
            result = length;
        }
        return result;
    }
}

public class Tulipan extends Flower{
    private String color;
    public Tulipan(String name, double price, double neededArea, double chanceOfGrowth){
        super(name, price, neededArea, chanceOfGrowth);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

public class Pen {

    private String color;
    private PenType type;
    private double sizeOfTip;

    public Pen(String color, PenType type, double sizeOfTip) {
        this.color = color;
        this.type = type;
        this.sizeOfTip = sizeOfTip;
    }

    public Pen(){
        new Pen("blue", PenType.BALLPOINT_PEN, 0.7);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public PenType getPenType() {
        return type;
    }

    public void setPenType(PenType type) {
        this.type = type;
    }

    public double getSizeOfTip() {
        return sizeOfTip;
    }

    public void setSizeOfTip(double sizeOfTip) {
        this.sizeOfTip = sizeOfTip;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", type=" + type +
                ", sizeOfTip=" + sizeOfTip +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pen)) return false;

        Pen pen = (Pen) o;

        if (Double.compare(pen.getSizeOfTip(), getSizeOfTip()) != 0) return false;
        if (!getColor().equals(pen.getColor())) return false;
        return type == pen.type;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getColor().hashCode();
        result = 31 * result + type.hashCode();
        temp = Double.doubleToLongBits(getSizeOfTip());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}


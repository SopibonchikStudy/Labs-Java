package Practice8_1;

public class Cone {
    int d, h;

    public Cone(int d, int h) {
        this.d = d;
        this.h = h;
    }

    public int countArea() {
        return (int) Math.round(Math.sqrt(Math.pow(this.h, 2) + Math.pow(this.d / 2, 2)) * this.d / 2 * Math.PI + Math.PI * Math.pow(this.d / 2, 2));
    }

    public int countVolume() {
        return (int) Math.round((Math.PI * Math.pow(this.d / 2, 2) * this.h)/3);
    }

    public String compare(Cone c) {
        String s = "";
        if (this.countArea() == c.countArea()) s += "Area is equal\n";
        else s += "Area is not equal\n";
        if (this.countVolume() == c.countVolume()) s += "Volume is equal";
        else s += "Volume is not equal";
        return s;
    }
}

package ch.heigvd.res.lab00;

/**
 * Created by gburri on 3/16/15.
 */
public class Trumpet implements IInstrument {
    public String play() {
        return "pouet";
    }
    public int getSoundVolume() {
        return 10;
    }
    public String getColor() {
        return "golden";
    }
}

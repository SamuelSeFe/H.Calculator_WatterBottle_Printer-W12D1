public class WaterBottle {
    private int volume;

    public WaterBottle(int _volume){
        this.volume = _volume;
    }

    public int getVolume(){return this.volume;}

    public int drink(){return this.volume - 10;}

    public int empty(){return this.volume - this.volume;}

    public int fill(){return this.volume = 100;}
}

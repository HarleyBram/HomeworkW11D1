public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
       this.volume = volume;
    }

    public int drink(){
        this.volume = volume-10;
        return volume;
    }

    public int empty(){
        this.volume = 0;
        return this.volume;
    }

    public int refill(){
        this.volume = 100;
        return this.volume;
    }

}

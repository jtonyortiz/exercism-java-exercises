class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distance = 0;
    private int battery = 100;

    public NeedForSpeed(int speed, int batteryDrain){
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.battery < this.batteryDrain? true: false;
    }

    public int distanceDriven() {
        return this.distance;
    }

    public void drive() {
        if(!this.batteryDrained()){
            this.battery = this.battery - this.batteryDrain;
            this.distance = this.distance + this.speed;
        }
        
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed car = new NeedForSpeed(50, 4);
        return car;
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance){
        this.distance = distance;
    }


    public boolean carCanFinish(NeedForSpeed car) {
        if(car.batteryDrained()){
            return false;
        }

        while(car.batteryDrained() == false){
            car.drive();
        }

        return car.distanceDriven() >= this.distance? true: false;

    }
}

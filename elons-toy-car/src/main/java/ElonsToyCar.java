public class ElonsToyCar {
    private int battery = 100;
    private int distance = 0;

    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven " + this.distance + " meters";
    }

    public String batteryDisplay() {
        if(this.battery == 0){
            return "Battery empty";
        }
        return "Battery at " + this.battery + "%";
    }

    public void drive() {
        if(this.battery > 0){
            //increment by 20 meters:
            //Decrease battery supply by 1
            this.distance +=  20;
            this.battery -= 1;
        }
        
    }
}

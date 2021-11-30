public class Lasagna {
    private int minutes = 40;
    private int layers = 0;


    public int expectedMinutesInOven(){
        //Return 40 by default
        return this.minutes; //Return 40
    }

    public int remainingMinutesInOven(int remainingMinutes){
        //Return difference from total -  remaining minutes
        //If minutes - remainingMinutes are less or equal to zero - return zero
        if(this.minutes - remainingMinutes <= 0) return 0;

        return this.minutes - remainingMinutes;

    }

    public int preparationTimeInMinutes(int layers){
        this.layers = layers;
        //Return amount of layers multipled by two:
        return this.layers * 2;

    }

    public int totalTimeInMinutes(int numberOfLayers, int numOfMinInOven){
        //Return the number of layers x 2 plus the number of minutes in the oven:
        return numberOfLayers * 2 + numOfMinInOven;

    }
}

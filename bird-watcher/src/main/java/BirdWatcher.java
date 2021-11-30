
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
    }

    public int getToday() {
        //Return the last element
        if(this.birdsPerDay.length >= 1){
            int size = this.birdsPerDay.length - 1;
            return this.birdsPerDay[size];
        }
        else{
            return 0;
        }
        
    }

    public void incrementTodaysCount() {
        int lastIndex = this.birdsPerDay.length - 1;
        this.birdsPerDay[lastIndex] = this.birdsPerDay[lastIndex] + 1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < this.birdsPerDay.length; i++){
            if(this.birdsPerDay[i] == 0){
                return true;
            }
        }

        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int length = numberOfDays;
        if(numberOfDays > this.birdsPerDay.length){
            length = this.birdsPerDay.length;
        }

        for(int i = 0; i < length; i++){
            sum = sum + this.birdsPerDay[i];
        }

        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for(int i = 0; i < this.birdsPerDay.length; i++){
            if(this.birdsPerDay[i] >= 5){
                busyDays++;
            }
        }
        return busyDays;
   }
}

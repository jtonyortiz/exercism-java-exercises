public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double productionRate = 0.0D;
        //Production rate: speed x 221 * percentage of defect-less cars
        switch(speed){
            case 1: productionRate = (speed * 221) * 1.0D;
            return productionRate;
            case 2: productionRate = (speed * 221) * 1.0D;
            return productionRate;
            case 3: productionRate = (speed * 221) * 1.0D;
            return productionRate;
            case 4: productionRate = (speed * 221) * 1.0D;
            return productionRate;
            case 5: productionRate = (speed * 221) * 0.9D;
            return productionRate;
            case 6: productionRate = (speed * 221) * 0.9D;
            return productionRate;
            case 7: productionRate = (speed * 221) * 0.9D;
            return productionRate;
            case 8: productionRate = (speed * 221) * 0.9D;
            return productionRate;
            case 9: productionRate = (speed * 221) * 0.8D;
            return productionRate;
            case 10: productionRate = (speed * 221) * 0.77D;
            return productionRate;

            default: return productionRate;

        }

    }

    public int workingItemsPerMinute(int speed) {
        //return (int)((speed * 221 * 0.9) / 60.0);
        int result = 0;
        switch(speed){

            case 1: case 2: case 3: case 4: result = (int)((speed * 221 * 1.0D) / 60);
            return result;
            case 5: case 6: case 7: case 8: result = (int)((speed * 221 * 0.9D) / 60);
            return result;
            case 9: result = (int)((speed * 221 * 0.8D) / 60);
            return result;
            case 10: result = (int)((speed * 221 * 0.77D) / 60);
            return result;

            default: return result;

        }
    }
}

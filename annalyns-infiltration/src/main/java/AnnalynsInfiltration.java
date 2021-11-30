class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake)
            return false;
        else
            return true;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {

        //If no-one is awake, then skip spying
        if(knightIsAwake == false && archerIsAwake == false && prisonerIsAwake == false){
            return false;
        }

        //Otherwise if one person is awake, spy:
        if(knightIsAwake == false || archerIsAwake == true || prisonerIsAwake == true){
            return true;
        }
        else if(knightIsAwake == true || archerIsAwake == false || prisonerIsAwake == true){
            return true;
        }
        else if(knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == false){
            return true;
        }
        else{
            return true;
        }
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canSignalPrisoner() method");
        if(archerIsAwake == false && prisonerIsAwake == true){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        //throw new UnsupportedOperationException("Please implement the (static) AnnalynsInfiltration.canFreePrisoner() method");
        if(petDogIsPresent == true && archerIsAwake == false)
        {
            return true;
        }

        if(petDogIsPresent == false && prisonerIsAwake == true && knightIsAwake == false && archerIsAwake == false){
            return true;
        }

        return false;

    }
}

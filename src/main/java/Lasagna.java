public class Lasagna {
    // define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }

    // define the 'remainingMinutesInOven()' method
   public int remainingMinutesInOven(int actualMinutesLasagnaHasBeenInOven){
        return (40- actualMinutesLasagnaHasBeenInOven);
    }

    // TODO: define the 'preparationTimeInMinutes()' method
   public int preparationTimeInMinutes(int numberOfLayersYouAddedToLasagna ){
        return (numberOfLayersYouAddedToLasagna*2);

    }


    // TODO: define the 'totalTimeInMinutes()' method
  public  int totalTimeInMinutes(int numberOfLayersYouAddedToLasagna, int numberOfMinutesLasagnaInOven){
        return ((numberOfLayersYouAddedToLasagna*2) + numberOfMinutesLasagnaInOven);
    }
}

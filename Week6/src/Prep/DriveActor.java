package Prep;

import java.util.ArrayList;

public class DriveActor {
    public static void main(String[] args) {
        Actor[] actors = getActorDataAsObjectArray();
        ArrayList<Actor> richOnes = getActorsByNetWorth( 500 );
        showRichActors( richOnes );

    }

    private static void showRichActors(ArrayList<Actor> actorList ) {
        // ToDo: output the first, last, yearborn and netwoth of the
        //        actorList

    }

    private static ArrayList<Actor> getActorsByNetWorth(int netWorth) {
        //ToDo:  Go through the actors and return those with netWorth or more
        ArrayList<Actor> richOnes = new ArrayList<>();
        return richOnes;
    }


    private static Actor[] getActorDataAsObjectArray() {
        Actor[] actors = new Actor[5];
        actors[0] = new Actor( "Jerry", "Sienfield" , 1954, 960);
        actors[1] = new Actor( "Tyler", "Perry", 1960, 600 );
        actors[2] = new Actor ("Tom" ,"Cruise", 1962, 560);
        actors[3] = new Actor( "George", "Clooney", 1962, 500 );
        actors[4] =  new Actor( "John", "Wayne",  1907, 50 );
        return actors;
    }
}

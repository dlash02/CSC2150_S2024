package Prep;

public class ParseActors {
    public static void main(String[] args) {
        String[] actors = getActorData();
        final int yr = 1962;
        System.out.printf("\n Actors older than:%s are CT:%s", yr, countOlderThan(yr, actors ));
        String[] olderActors = getActorsOlderThan( yr, actors );
        showTheseActors( yr, olderActors);
    }

    private static String[] getActorData() {
        String[] actors = new String[6];
        actors[0] = "Jerry;Sienfield;960;1954";
        actors[1] = "Tyler;Perry;600;1960";
        actors[2] = "Tom;Cruise;560;1962";
        actors[3] = "George;Clooney;500;1962";
        actors[4] = "Robert;DiNiro;500;1943";
        actors[5] = "John;Wayne;50;1907";
        return actors;
    }
    public static int countOlderThan( int inYear, String[] actors  ){
        //actors[0] = "Jerry;Sienfield;960;1954";
        int ct = 0;
        for( String actor : actors ) {
            String[] toks = actor.split(";");
            try{
                int bd = Integer.parseInt(toks[3]);
                if ( bd < inYear ) {
                    ct++;
                }
            } catch( Exception e ){
                System.out.printf("\n Illegal Line:%s", actor);
            }
        }
        return ct;
    }
    public static String[]  getActorsOlderThan( int inYear, String[] actors  ){
        //actors[0] = "Jerry;Sienfield;960;1954";
        String[] olderActors = new String[actors.length]; // could initialize to this
        int ct = 0;
        for( String actor : actors ) {
            String[] toks = actor.split(";");
            try{
                int bd = Integer.parseInt(toks[3]);
                if ( bd < inYear ) {
                    olderActors[ct++] = String.format( "%s %s", toks[0], toks[1]);
                }
            } catch( Exception e ){
                System.out.printf("\n Illegal Line:%s", actor);
            }
        }
        return olderActors;
    }
    private static void showTheseActors( int yr, String[] olderActors) {
        System.out.printf("\n -------- Showing Actors Older than:%s -----", yr);
        int ct = 1;
        for( String actor : olderActors ){
            if ( actor != null ) {
                System.out.printf("\n Ct:%s Actor:%s", ct++, actor);
            }
        }
    }
}

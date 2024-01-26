public class ActorNetWorth {
    public static void main(String[] args) {
        String[] actors = getActorData();
        final int YEAR = 1960;
        String[] olderActors = getActorsOlderThan( YEAR, actors);
//        int totalNW = getTotalNetworthOfThese( olderActors);
//        showOlderActors( olderActors, YEAR, totalNW  );
    }

    private static void showOlderActors(String[] olderActors, int yr) {
        System.out.printf("\n ---- Showing actors born B4 %s", yr);
        for( int i=0; i<olderActors.length; i++){
            String row = olderActors[i];
            if ( row == null ) break;
            String[] toks = row.split(";");
            System.out.printf("\n First:%s Last:%s; NetW:%s BD:%s",
                    toks[0], toks[1], toks[2], toks[3]);
        }
    }

    private static String[] getActorsOlderThan(int yr, String[] actors) {
        String[] oActors = new String[actors.length];
//        for ( int i=0; i<oActors.length; i++){
        int ct = 0;
        for( String actor : actors){
            String[] toks = actor.split(";");
            String stYear = toks[3];
            try {
                int bYear = Integer.parseInt(stYear);
                if (bYear < yr) {
                    oActors[ct++] = actor;
//                ct = ct + 1;
//                ct += 1;
                }
            } catch ( Exception e){
                System.out.printf("\n Bad Records Skipping:%s", actor);
            }
        }
        return  oActors;
    }

    private static String[] getActorData() {
        String[] actors = new String[6];
        actors[0] = "Jerry;Sienfield;960;1954";
        actors[1] = "Tyler;Perry;600;1960";
        actors[2] = "Tom;Cruise;560;1962xxxx";
        actors[3] = "George;Clooney;500;1962";
        actors[4] = "Robert;DiNiro;500;1943";
        actors[5] = "John;Wayne;50;1907";
        return actors;
    }
}

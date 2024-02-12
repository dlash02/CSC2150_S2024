public class ListManager {
    private int n;

    public ListManager(int n) {
        this.n = n;
    }
    public int doALoop(){
        int ct =0;
        for ( int i=0; i<n; i++){
//            if ( ct > 50 ) break;
            ct++;
        }
        return ct;
    }
    public int doLoop2(){
        int ct =0;
        for ( int i=0; i<n; i++){
            for ( int j=0; j<n; j++) {
                if ( j > 50 ) break;
                ct++;
            }
        }
        return ct;
    }
    public int doAnotherOne(){
        int ct = 0;
        for ( int i = 0; i<n; i++) {
            ct = doALoop();
            ct += doALoop();
        }
        return ct;
    }
    public boolean gotThisLetter( String myS, char inC ){
        int ct = 0;
        for( int i=0; i<myS.length(); i++){
            char c = myS.charAt(i);
            if ( c == inC ){
                return true;
            }
        }
        return false;
    }
    public int doALoopV2(){
        int ct =0;
        for ( int i=0; i<n; i++){
//            if ( ct > 50 ) break;
            ct++;
        }
        for ( int i=0; i<n; i++){
//            if ( ct > 50 ) break;
            ct++;
        }
        doALoop();
        return ct;
    }
}

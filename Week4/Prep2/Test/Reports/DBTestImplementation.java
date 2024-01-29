package Reports;
import ModelPrep.DBInterface;

import java.util.ArrayList;

public class DBTestImplementation implements DBInterface {

    @Override
    public ArrayList<String> doQueryAL(String sql) {
        ArrayList<String> myStrings = new ArrayList<>();
        myStrings.add( "101671;Jack;Sparrow;CSC;2.0");
        myStrings.add( "101671;Bruce;Wayne;CSC;4.0");
        myStrings.add( "101671;Peter;Parker;CSC;4.0");
        myStrings.add( "101671;Tony;Stark;CSC;2.0");
        return myStrings;
    }
}

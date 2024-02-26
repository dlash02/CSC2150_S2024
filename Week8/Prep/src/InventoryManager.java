import java.util.ArrayList;

public class InventoryManager {
    String file = "sales.txt";
    FileIO_Service fio;

    public InventoryManager( FileIO_Service fio) {
        this.fio = fio;
        fio.setfName( file );
    }
    public ArrayList<String> getData() {
        ArrayList<String> salesData = fio.getTheFile();
        return salesData;
    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class DriveHashExamples {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> shoppingList = new HashMap<String, ArrayList<String>>();
        HashMap< String, HashMap<String, ArrayList<Student>>> bySomething = new HashMap<>();
        HashMap<String, ArrayList<String>> departmentEmployees = new HashMap<>();
        ArrayList<String> ITEmployees = new ArrayList<>(Arrays.asList("Jan", "Jake"));
        departmentEmployees.put("IT", ITEmployees);
        departmentEmployees.put("HR", new ArrayList<>(Arrays.asList("Jeff", "Janice")));
    }
}

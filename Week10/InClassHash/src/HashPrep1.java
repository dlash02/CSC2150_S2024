import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashPrep1 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> shoppingList = new HashMap<String, ArrayList<String>>();
        ArrayList<String> meatItems = new ArrayList<String>(Arrays.asList("Steak", "Chicken", "Chops"));
        shoppingList.put("Meat", meatItems);

        ArrayList<String> veggies = new ArrayList<String>(Arrays.asList("Peas", "Corn", "Carrots", "Beans"));
        shoppingList.put("Vegetables", veggies);

        if ( shoppingList.containsKey("Vegetables")){
            System.out.printf("\n --- showing vegetable items ----");
            ArrayList<String> items = shoppingList.get("Vegetables");
            for( String item : items ){
                System.out.printf("\n Item:%s", item);
            }
        }
        // HashMap of deparemtn and department members.
        HashMap<String, ArrayList<String>> departmentEmployees = new HashMap<>();
        departmentEmployees.put("IT", new ArrayList<>(Arrays.asList("John", "Alice")));
        departmentEmployees.put("HR", new ArrayList<>(Arrays.asList("Bob", "Carol")));

        //
        HashMap<String, HashMap<String, String>> organizationHierarchy = new HashMap<>();

// Adding departments and teams
        HashMap<String, String> marketingTeam = new HashMap<>();
        marketingTeam.put("TeamLead", "John Doe");
        marketingTeam.put("TeamMembers", "Alice, Bob, Carol");

        HashMap<String, String> salesTeam = new HashMap<>();
        salesTeam.put("TeamLead", "Jane Smith");
        salesTeam.put("TeamMembers", "David, Emily, Frank");

        organizationHierarchy.put("Marketing", marketingTeam);
        organizationHierarchy.put("Sales", salesTeam);
        HashMap<String, HashMap<String, String>> menuStructure = new HashMap<>();

// Adding menu categories and items
        HashMap<String, String> mainCourseItems = new HashMap<>();
        mainCourseItems.put("Chicken", "$10.99");
        mainCourseItems.put("Beef", "$12.99");

        HashMap<String, String> dessertItems = new HashMap<>();
        dessertItems.put("Cake", "$5.99");
        dessertItems.put("Ice Cream", "$3.99");

        menuStructure.put("Main Course", mainCourseItems);
        menuStructure.put("Desserts", dessertItems);


    }
}

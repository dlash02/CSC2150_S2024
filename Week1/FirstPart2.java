public class FirstPart2 {
    public static void main(String[] args) {
        int age = 20;
        String rights = "";
        char cma = ',';
        if ( age == 15){
            rights = "You can get a learning permit";
        }
        if (  age >= 16){
            rights += "Can Drive";
        } else {
            rights += "Can Not Drive";
        }
        if (  age >= 18){
            rights += cma + "Can Vote";
        } else {
            rights += cma + "Can Not Vote";
        }
        System.out.printf("Your Rights are: %s", rights);
    }
}

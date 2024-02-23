package Prep;

public class Mapper {
    public static void main(String[] args) {
           int ret = func(35, 10);
        System.out.printf("\n ret=%s", ret );
    }
    public static int func(int x, int y){
        if (x % y == 0){
            return y;
        }
        return func(y, x % y);
    }

}

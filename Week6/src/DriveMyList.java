public class DriveMyList {
    public static void main(String[] args) {
        int[] nTimes = { 10, 100, 1000, 10000};
        for( int n : nTimes) {
            ListManager lm = new ListManager(n);
            int ret = lm.doALoop();
            System.out.printf("\nFor n:%s ret:%s", n, ret);
        }
        System.out.printf("\n -------------------------");
        for( int n : nTimes) {
            ListManager lm = new ListManager(n);
            int ret = lm.doLoop2();
            System.out.printf("\nFor n:%s ret:%s", n, ret);
        }
        System.out.printf("\n -------------------------");
        for( int n : nTimes) {
            ListManager lm = new ListManager(n);
            int ret = lm.doAnotherOne();
            System.out.printf("\nFor n:%s ret:%s", n, ret);
        }
    }
}

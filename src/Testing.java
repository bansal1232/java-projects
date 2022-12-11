public class Testing {
    public static void failChecker() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

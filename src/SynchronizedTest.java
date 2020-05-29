public class SynchronizedTest {

    private synchronized void test(String name) { // delete synchronized
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " :: " + i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedTest theDemo = new SynchronizedTest();
        new TestThread("THREAD 1", theDemo);
        new TestThread("THREAD 2", theDemo);
        new TestThread("THREAD 3", theDemo);
    }

    private static class TestThread extends Thread {
        private final String name;
        private final SynchronizedTest theDemo;

        private TestThread(String name, SynchronizedTest theDemo) {
            this.theDemo = theDemo;
            this.name = name;
            start();
        }

        @Override
        public void run() {
            theDemo.test(name);
        }
    }

}
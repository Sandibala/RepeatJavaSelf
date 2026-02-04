package m2Lev15;

public class InnerStatic {
    static class InnerClass implements Runnable{
        private String name;
        InnerClass(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " running task: " + name);
        }
    }
}

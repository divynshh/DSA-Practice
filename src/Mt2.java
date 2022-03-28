public class Mt2 {

    public synchronized  void  m1(String t) throws InterruptedException {


        System.out.println(t + " Method Starts");
        Thread.sleep(5000);
        System.out.println(t +" Method Stops");


     }

    public static void main(String[] args) {

        Mt2 o1 = new Mt2();
        Mt2 o2 = new Mt2();

       Thread t1=  new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    o1.m1("t1");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

       Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    o2.m1("t2");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        try{
            t1.join();
            t2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        t2.start();



    }
}

package com.learning.MultiThreadConcur;
 interface  CheckLambda2{
     void allowLambda();
}
public class TwoThread2 {

    public static class StopRunnable implements Runnable{

        private boolean stopRequested = false;
        public synchronized void requestStop(){
            this.stopRequested = true;
        }
        public synchronized boolean isStopRequested(){
            return this.stopRequested;
        }
        CheckLambda2 uSleep2 = () -> {
            try{
                Thread.sleep(4000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        };
        @Override
        public void run() {
            System.out.println("StopRunnable Running");
            while (!isStopRequested()) {
                uSleep2.allowLambda();
                System.out.println("<->");
            }
            System.out.println("StopRunnable Stopped");
        }

        public static void main(String[] args) {
            StopRunnable stopRun = new StopRunnable();
            Thread thread = new Thread(stopRun , "The Thread - ");
            thread.start();
            System.out.println("Requesting Stop");
            stopRun.requestStop();
            try {
                Thread.sleep(5000);

            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("stop Requested");
        }

    }



}

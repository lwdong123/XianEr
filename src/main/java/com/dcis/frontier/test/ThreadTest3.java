package com.dcis.frontier.test;
public class ThreadTest3 {
    class ThreadImp implements Runnable {
        public synchronized void run(){
            try{
                System.out.println(Thread.currentThread().getName() + "Begin");
                Thread.sleep(10);
				/*System.out.println(Thread.currentThread().getName() + "process");
				Thread.sleep(10);*/
                System.out.println(Thread.currentThread().getName() + "end");
                Thread.sleep(10);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args)throws Exception{
        ThreadTest3 T3 = new ThreadTest3();
        ThreadImp th = T3.new ThreadImp();
        //子线程
        Thread t = new Thread(th,"xc1");
        Thread t2 = new Thread(th,"xc2");
        Thread t3 = new Thread(th,"xc3");
        Thread t4 = new Thread(th,"xc4");
        Thread t5 = new Thread(th,"xc5");
        t.start();
//        t.join();
        t2.start();
        t2.join();
//        t3.start();
//        t3.join();
//        t4.start();
//        t4.join();
//        t5.start();
//        t5.join();
        System.out.println("the final");//main线程最后执行
        //t2.join();
		/*try{
			t.join(1000);//join的用法
			if (t.isAlive()) {
				System.out.println("线程1alive");
			} else {
				System.out.println("线程1dead");
			}
			System.out.println(Thread.currentThread().getName() + "finished");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
    }
}
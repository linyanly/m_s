package com.lin.sprint_boot;

import java.util.concurrent.locks.ReentrantLock;

public class TestThread {



    static class ThreadT extends Thread{

        private Object one;
        private Object two;
        private String name;

        public ThreadT(String name,Object one,Object two){
            this.name = name;
            this.one = one;
            this.two = two;
        }

        @Override
        public void run() {
            int count  = 10;
            while (count > 0){

                synchronized (one){
                    synchronized (two){
                        count--;
                        System.out.println(name);
                        two.notify();
                        try {
                            one.wait();
                        } catch (InterruptedException e) {

                        }
                    }
                }
            }
        }
    }



    public static void main(String[] args) throws Exception{
        Object a  = new Object();
        Object b  = new Object();
        Object c  = new Object();
        new ThreadT("a",c,a).start();//先放a-->one c-->two,
        Thread.sleep(10);
        new ThreadT("b",a,b).start();//先放a-->one b-->two,
        Thread.sleep(10);
        new ThreadT("c",b,c).start();//先放b-->one c-->two,
        Thread.sleep(10);
        /**
         * 线程第一把锁是a,第二把锁是c,先放a锁,再放c锁
         * 进入第二次循环的时候,先拿a锁,但是已经被线程b拿了a锁,
         */
    }

}

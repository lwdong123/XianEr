package com.dcis.frontier.test;

public class FieldVisibility {
    int a = 1;
    int b = 2;

    public static void main(String[] args) {
        for (;;){


        FieldVisibility test = new FieldVisibility();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                test.change();

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                test.print();

            }
        }).start();
        }
    }

    private void print() {
        if (b==3&&a==1){
            System.out.println("b=" + b + ",a=" + a);
        }

    }

    private void change() {
        a = 3;
        b = a;
    }
}

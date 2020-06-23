package com.dcis.frontier.test;

public class Demo09 extends Demo10{
    public int get01(){
        return 1;
    }

    @Override
    public void gets() {
        super.gets();
    }

    public static void main(String[] args) {
        Demo09 demo09 = new Demo09();
        demo09.get02();
        demo09.gets();
    }
    public void get02(){
        System.out.println(this.get01());
    }
}

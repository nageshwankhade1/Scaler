package com.company.mock;

public class TestMock {
    public static void main(String[] args) {
        //test();
        test2();

    }

    private static void test2() {
        Parents c = new child();
        c.display();
    }

    public static  void test(){
        try{
            System.out.println("try");
            throw  new RuntimeException();
            //System.out.println("try-2");
        }catch (Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
            //throw new RuntimeException();

        }
        System.out.println("after finally");
    }

    static class Parents {
        void display(){
            System.out.println("parent");
        }
    }
    static class child extends Parents{
        void display(){
            System.out.println("child");
        }
    }


}

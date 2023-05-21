package org.example.creational.singleton;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if(instance!=null){
            return instance;
        }
        synchronized (Singleton.class) {
            if(instance==null) instance = new Singleton(value);
            return instance;
        }
    }
}

class Application{
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("1");
        System.out.println(singleton);
        singleton = Singleton.getInstance("100");
        System.out.println(singleton);
    }
}

class DemoMultiThread {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
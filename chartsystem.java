import java.util.Scanner;
class Chatuser extends Thread{
    boolean running = true;
    boolean suspended = false;
    Chatuser(String name){
        super(name);
    }
    public synchronized void suspenduser(){
    suspended = true;
    System.out.println(getName()+"Suspended");
    }
    public synchronized void resumeuser(){
        suspended = false;
        notify();
        System.out.println(getName()+"Suspended");
    }
    public void terminateduser(){
        running = false;
        interrupt();
        System.out.println(getName()+"terminated");
    }
    public void sendMessage(Chatuser User,String message, boolean important){
        if(important)
        User.setPriority
        (Thread.MAX_PRIORITY);
        System.out.println(getName()+"->"+User.getName()+" "+message);
    }
    public void run(){
        try {
            while(running){
                synchronized(this){
                    while(suspended)
                    wait();
                }
                System.out.println(getName()+"is ready to chat");
                Thread.sleep(500);
            }
            
        } catch (InterruptedException e) {
            //Thread interrupted
        }
        }
}
        public class ChatSystem{
            public static void main(String[]args)
            throws InterruptedException{
                    Chatuser alice = new Chatuser("Alice");
                    Chatuser bob = new Chatuser("Bob");
                    Chatuser charlie = new Chatuser("Charlie");
                    alice.start();
                    bob.start();
                    charlie.start();
                    Thread.sleep(1000);
                    //sending message
                    alice.sendMessage(bob,"Hello Bob",false);
                    bob.sendMessage(charlie,"Important message",true);
                    //check thread status
                    System.out.println("Alice alive:"+alice.isAlive());
                    System.out.println("Bob alive:"+ bob.isAlive());
                    //suspend and resume
                    charlie.suspenduser();
                    Thread.sleep(1000);
                    charlie.resumeuser();
                    //Terminate threads
                    alice.terminateduser();
                    bob.terminateduser();
                    charlie.terminateduser();
                    //wait for threads to finish
                    alice.join();
                    bob.join();
                    charlie.join();
                    System.out.println("All threads finished.");
                    }
            }

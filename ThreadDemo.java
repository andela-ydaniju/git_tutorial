 class MyThread extends Thread {
  public void run(){
    for(int i =0; i<10; i++){
        System.out.println("Child Thread");
      }
  }

}
//add another metoh

class ThreadDemo {
  public static void main(String args[]){
    MyThread A = new MyThread();
    A.start();
    for(int i = 0; i<10; i++){
      System.out.println("Main Thread");
    }
  }
}
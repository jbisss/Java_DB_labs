// �������� ������ Thread:
class MyThread extends Thread{
   // ��������������� ������ run():
   public void run(){
      for(int i=1;i<=5;i++){
         System.out.println("�������� �����:\t"+i);
         try{
            Thread.sleep(4500);
         }
         catch(InterruptedException e){
            System.out.println("���������� ��������� ������");
         }
      }
   }
}
// ������� �����:
class ExtendingThreadDemo{
   public static void main(String[] args) throws InterruptedException{
      System.out.println("���������� ���������� ���������");
      // �������� ������� ������ MyThread:
      MyThread t=new MyThread();
      System.out.println("����������� �������� �����");
      // ������ ��������� ������:
      t.start();
      for(int k=0;k<=5;k++){
         System.out.println("������� �����:\t"+(char)('A'+k));
         Thread.sleep(2000);
      }
      if(t.isAlive()){
         t.join();
      }
      System.out.println("���������� ��������� ���������");
   }
}
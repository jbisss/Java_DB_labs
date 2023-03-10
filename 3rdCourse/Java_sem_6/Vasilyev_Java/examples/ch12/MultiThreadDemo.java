// ������ ������ Random:
import java.util.Random;
// �������� MyThread ��������� �������������
// ����������� Thread:
class MyThread extends Thread{
   // ���������� ���������:
   private int count;
   // �����������:
   MyThread(String name,int count){
      // ����� ������������ �����������:
      super(name);
      // �������� �������������� ����:
      this.count=count;
      // ������ ������ �� ����������:
      start();
   }
   // ��������������� ������ run():
   public void run(){
      // ����������� ��������� � ������� ������:
      System.out.println("����������� ����� "+getName());
      // �������� ������� ������ Random
      // ��� ������������� ��������� �����:
      Random rnd=new Random();
      // �������� �����, � ������� ��������� ���������:
      for(int k=1;k<=count;k++){
         System.out.println("��������� �� ������ "+getName()+":\t"+getName().charAt(0)+k);
         try{
            // �������� � ���������� ������:
            Thread.sleep(1000+rnd.nextInt(2001));
         }
         catch(InterruptedException e){
            System.out.println("���������� ������ "+getName());
         }
      }
      // ��������� � ���������� ���������� ������:
      System.out.println("����� "+getName()+" ��������");
   }
}
// ������� �����:
class MultiThreadDemo{
   public static void main(String[] args) throws InterruptedException{
      System.out.println("�������� ����������� ������� �����");
      // �������� �������� - ������ �������:
      MyThread A=new MyThread("ALPHA",5);
      MyThread B=new MyThread("BRAVO",3);
      MyThread C=new MyThread("CHARLIE",7);
      // ��������� �������� ������:
      for(int k=1;k<=4;k++){
         System.out.println("��������� �� �������� ������:\t"+k);
         // �������� � ���������� ������:
         Thread.sleep(2000);
      }
      // �������� ���������� �������� �������:
      if(A.isAlive()){
         A.join();
      }
      if(B.isAlive()){
         B.join();
      }
      if(C.isAlive()){
         C.join();
      }
      // ��������� � ���������� �������� ������:
      System.out.println("������� ����� ��������");
   }
}
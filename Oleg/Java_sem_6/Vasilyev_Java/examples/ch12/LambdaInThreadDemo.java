class LambdaInThreadDemo{
   public static void main(String[] args) throws InterruptedException{
      System.out.println("���������� ���������� ���������");
      // ������������ ���������� ���������
      // ������������� ������-���������:
      Runnable r=()->{
         for(int i=1;i<=5;i++){
            System.out.println("�������� �����:\t"+i);
            try{
               Thread.sleep(4500);
            }
            catch(InterruptedException e){
               System.out.println("���������� ��������� ������");
            }
         }
      };
      // ������������ ���������� ���������� ����������
      // ������������ ������ Thread:
      Thread t=new Thread(r);
      System.out.println("����������� �������� �����");
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
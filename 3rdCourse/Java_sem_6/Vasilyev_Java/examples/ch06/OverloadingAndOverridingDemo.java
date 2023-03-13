// ����������:
class Alpha{
   // ������ ������ ��� ���������:
   void show(){
      System.out.println("����� Alpha");
   }
   // ������ ������ � ��������� ����������:
   void show(String txt){
      System.out.println(txt);
   }
}
// ��������:
class Bravo extends Alpha{
   // ��������������� ������ ������ ��� ����������:
   void show(){
      System.out.println("����� Bravo");
   }
   // ������ ������ � ������������� ����������:
   void show(int num){
      System.out.println("����� "+num);
   }
}
// ������� �����:
class OverloadingAndOverridingDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� ������� �����������:
      Alpha objA=new Alpha();
      // ����� ������ ������ ������:
      objA.show();
      objA.show("������ objA");
      // �������� ������� ���������:
      Bravo obj=new Bravo();
      // ����� ������ ������ ������:
      obj.show();
      obj.show("������ objB");
      obj.show(123);
   }
}
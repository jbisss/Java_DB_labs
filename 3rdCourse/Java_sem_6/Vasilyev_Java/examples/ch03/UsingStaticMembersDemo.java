// ����� �� ������������ �������:
class MyClass{
   // ����������� ����:
   static int count=0;
   // ����������� ��� ����������:
   MyClass(){
      // ���������� �������� ������������ ����:
      count++;
      // ����������� ���������:
      System.out.println("������ ������ ����� "+count);
   }
   // ����������� �����:
   static void show(){
      System.out.println("���������� ��������: "+count);
   }
}
// ����� � ������� ������� ���������:
class UsingStaticMembersDemo{
   // ������� ����� ���������:
   public static void main(String[] args){
      // ����� ������������ ������:
      MyClass.show();
      // �������� ��������:
      MyClass objA=new MyClass();
      MyClass objB=new MyClass();
      MyClass objC=new MyClass();
      // ����� ������������ ������ ����� ������ �� �����:
      MyClass.show();
      // ����� ������������ ������ ����� ������ �� ������:
      objC.show();
      objB.show();
   }
}
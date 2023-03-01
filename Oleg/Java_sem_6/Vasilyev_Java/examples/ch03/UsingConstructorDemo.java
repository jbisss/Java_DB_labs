// �������� ������:
class MyClass{
   // ���� ������:
   int number;
   char symbol;
   // ����������� ������ ��� ����������:
   MyClass(){
      // ������������ �������� �����:
      number=100;
      symbol='A';
   }
   // ����������� ������ � ����� �����������:
   MyClass(int n,char s){
      // ������������ �������� �����:
      number=n;
      symbol=s;
   }
   // ����� ��� ����������� �������� ����� �������:
   void show(){
      System.out.println("�������� ����� "+number+" � "+symbol);
   }
}
// �������� ������ � ������� ������� ���������:
class UsingConstructorDemo{
   // ������� ����� ���������:
   public static void main(String[] args){
      // �������� ������� �������
      // (���������� ����������� ��� ����������):
      MyClass objA=new MyClass();
      // �������� ������� �������
      // (���������� ����������� � ����� �����������):
      MyClass objB=new MyClass(200,'B');
      // ����������� �������� ����� ������� �������:
      System.out.println("������ objA:");
      objA.show();
      // ����������� �������� ����� ������� �������:
      System.out.println("������ objB:");
      objB.show();
   }
}
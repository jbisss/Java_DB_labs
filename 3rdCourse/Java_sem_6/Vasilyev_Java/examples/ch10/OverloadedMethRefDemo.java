// �����:
class MyClass{
   // ����:
   int number;
   // ������������� �����:
   void set(){
      number=0;
   }
   void set(int n){
      number=n;
   }
}
// ������ ���������:
interface Alpha{
   void none();
}
// ������ ���������:
interface Bravo{
   void one(int n);
}
// ������� �����:
class OverloadedMethRefDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� �������:
      MyClass obj=new MyClass();
      // ������������� ������ �� ������������� �����:
      Alpha A=obj::set;
      Bravo B=obj::set;
      // ����� ������ ����� ������������ ����������:
      B.one(100);
      // �������� �������� ���� �������:
      System.out.println("�������� ����: "+obj.number);
      // ����� ������ ����� ������������ ����������:
      A.none();
      // �������� �������� ���� �������:
      System.out.println("�������� ����: "+obj.number);
   }
}
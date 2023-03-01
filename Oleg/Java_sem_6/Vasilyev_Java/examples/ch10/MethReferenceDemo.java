// ����� � ����� � ��������:
class MyClass{
   private int number;
   MyClass(int n){
      number=n;
   }
   void set(int n){
      number=n;
   }
   int get(){
      return number;
   }
}
// ������ �������������� ���������:
interface MyGetter{
   int myget(MyClass obj);
}
// ������ �������������� ���������:
interface MySetter{
   void myset(MyClass obj,int n);
}
// ������� �����:
class MethReferenceDemo{
   public static void main(String[] args){
      // ��������� ������:
      MyClass obj=new MyClass(100);
      System.out.println("������ ������ � ����� 100");
      // ���������� ������ �� ������:
      MyGetter A=MyClass::get;
      MySetter B=MyClass::set;
      System.out.println("���������� A: "+A.myget(obj));
      System.out.println("���������� obj: "+obj.get());
      obj.set(200);
      System.out.println("���� ��������� �������� 200");
      System.out.println("���������� A: "+A.myget(obj));
      B.myset(obj,300);
      System.out.println("��������� ������� B.myset(obj,300)");
      System.out.println("���������� A: "+A.myget(obj));
      System.out.println("���������� obj: "+obj.get());
      // ��������� ����� ������:
      obj=new MyClass(400);
      System.out.println("������ ������ � ����� 400");
      System.out.println("���������� A: "+A.myget(obj));
      System.out.println("���������� obj: "+obj.get());
      B.myset(obj,500);
      System.out.println("��������� ������� B.myset(obj,500)");
      System.out.println("���������� A: "+A.myget(obj));
      System.out.println("���������� obj: "+obj.get());
   }
}
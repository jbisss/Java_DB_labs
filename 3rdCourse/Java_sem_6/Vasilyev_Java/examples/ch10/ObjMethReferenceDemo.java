// �����:
class MyClass{
   // �������� ������������� ����:
   private int number;
   // �����������:
   MyClass(int n){
      number=n;
   }
   // ����� ��� ������������ �������� ����:
   void set(int n){
      number=n;
   }
   // ����� ��� ���������� �������� ����:
   int get(){
      return number;
   }
}
// ������ �������������� ���������:
interface MyGetter{
   int myget();
}
// ������ �������������� ���������:
interface MySetter{
   void myset(int n);
}
// ������� �����:
class ObjMethReferenceDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� �������:
      MyClass obj=new MyClass(100);
      System.out.println("������ ������ � ����� 100");
      // ���������� ������ �� ������:
      MyGetter A=obj::get;
      MySetter B=obj::set;
      // ��������� "�������� ����" ������� ������ myget()
      // �� ������������ ���������� A:
      System.out.println("���������� A: "+A.myget());
      // ��������� �������� ���� �������:
      System.out.println("���������� obj: "+obj.get());
      // ���� ������� ������������� ��������:
      obj.set(200);
      System.out.println("���� ��������� �������� 200");
      // ��������� "�������� ����" ������� ������ myget()
      // �� ������������ ���������� A:
      System.out.println("���������� A: "+A.myget());
      // ����������� "�������� ����" ������� ������ myset()
      // �� ������������ ���������� B:
      B.myset(300);
      System.out.println("��������� ������� B.myset(300)");
      // ��������� "�������� ����" ������� ������ myget()
      // �� ������������ ���������� A:
      System.out.println("���������� A: "+A.myget());
      // ��������� �������� ���� �������:
      System.out.println("���������� obj: "+obj.get());
      // ��������� ����� ������:
      obj=new MyClass(400);
      System.out.println("������ ������ � ����� 400");
      // ��������� "�������� ����" ������� ������ myget()
      // �� ������������ ���������� A:
      System.out.println("���������� A: "+A.myget());
      // ��������� �������� ���� �������:
      System.out.println("���������� obj: "+obj.get());
      // ����������� "�������� ����" ������� ������ myset()
      // �� ������������ ���������� B:
      B.myset(500);
      System.out.println("��������� ������� B.myset(500)");
      // ��������� "�������� ����" ������� ������ myget()
      // �� ������������ ���������� A:
      System.out.println("���������� A: "+A.myget());
      // ��������� �������� ���� �������:
      System.out.println("���������� obj: "+obj.get());
   }
}
// ����� � ��������� �������:
class MyClass{
   // �������� ����������� ����:
   private static int count=0;
   // �������� ������������� ����:
   private int number;
   private String name;
   // ����������� ��� ����������:
   MyClass(String n){
      // ���������� �������� ������������ ����:
      count++;
      // ������������ �������� ������������� �����:
      name=n;
      number=count;
      // ����������� ���������:
      System.out.println("������ ������ � ������ "+name);
   }
   // ����� ��� ����������� ���������:
   public void show(){
      System.out.println("�������� �������: "+name);
      System.out.println("����� �������: "+number);
      System.out.println("���������� ��������: "+count);
   }
   // ����� ��� ������������ �������� ���������
   // ���������� ����:
   public void set(String n){
      name=n;
   }
}
// ����� � ������� ������� ���������:
class UsingPrivateMembersDemo{
   // ������� ����� ���������:
   public static void main(String[] args){
      // �������� ��������:
      MyClass objA=new MyClass("Alpha");
      MyClass objB=new MyClass("Bravo");
      MyClass objC=new MyClass("Charlie");
      // ����� ������ ��� ������� �� ��������:
      objA.show();
      objB.show();
      objC.show();
      // ��������� ���� ������� �������:
      objB.set("������ ������");
      // ����������� �������� ����� �������:
      objB.show();
   }
}
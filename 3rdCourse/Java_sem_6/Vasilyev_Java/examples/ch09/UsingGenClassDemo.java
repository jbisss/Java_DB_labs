// ���������� ����� � ����� ���������� ����:
class MyClass<X>{
   // ���� ����������� ����:
   X data;
   // ����������� � ���������� ����������� ����:
   MyClass(X data){
      // ������������ �������� ����:
      this.data=data;
   }
   // ����� ��� ����������� �������� ����:
   void show(){
      System.out.println("�������� ����: "+data);
   }
}
// ������� �����:
class UsingGenClassDemo{
   public static void main(String[] args){
      // �������� ������� �� ������ ����������� ������.
      // ������ ����������� ��������� ������������
      // ������������� Integer:
      MyClass<Integer> A=new MyClass<Integer>(100);
      // �������� ������� �� ������ ����������� ������.
      // ������ ����������� ��������� ������������
      // ������������� Character:
      MyClass<Character> B=new MyClass<Character>('B');
      // �������� ������� �� ������ ����������� ������.
      // ������ ����������� ��������� ������������
      // ������������� String:
      MyClass<String> C=new MyClass<String>("�������");
      // ����� ������ show() �� ��������, ���������
      // �� ������ ����������� ������:
      A.show();
      B.show();
      C.show();
   }
}
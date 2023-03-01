// �������������� ���������:
interface MyInterface{
   // ����� � ������������� ���������� ����������
   // ������������� ���������:
   int getNumber(int n);
}
// ����� � ����� ������������� ����:
class MyClass{
   // �������� ���� ������������� ����:
   private MyInterface ref;
   // �����������:
   MyClass(MyInterface mi){
      set(mi);
   }
   // ����� ��� ������������ �������� ����:
   void set(MyInterface mi){
      ref=mi;
   }
   // ����� � ������������� ���������� ����������
   // ����������� ����� �����:
   int get(int n){
      // ����� ������ �� �������, �� ������� ���������
      // ���� ������������� ����:
      return ref.getNumber(n);
   }
}
// ������� �����:
class LambdaAsFieldDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� ������� ������ � ��������� ����������
      // ������������ ������-���������:
      MyClass obj=new MyClass((int n)->{return n*n;});
      // �������� ����������:
      System.out.println("��������:");
      for(int k=0;k<=5;k++){
         System.out.print(k+"\t");
      }
      System.out.println("\n�������� � ��������:");
      for(int k=0;k<=5;k++){
         System.out.print(obj.get(k)+"\t");
      }
      // ���� ������� ������������� ����� ��������:
      obj.set((int n)->{return n*n*n;});
      // �������� ����������:
      System.out.println("\n�������� � ����:");
      for(int k=0;k<=5;k++){
         System.out.print(obj.get(k)+"\t");
      }
      System.out.println("");
   }
}
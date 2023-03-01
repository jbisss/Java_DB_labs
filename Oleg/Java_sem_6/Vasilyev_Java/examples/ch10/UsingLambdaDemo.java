// �������������� ���������:
interface MyNums{
   // ����� � ����� �� ���������:
   default void show(int n){
      System.out.println("��������: "+n);
      System.out.println("���������: "+get(n));
   }
   // ����������� �����:
   int get(int n);
}
// ������� �����:
class UsingLambdaDemo{
   // ������� �����:
   public static void main(String[] args){
      // ������������ ������-��������� ���������
      // ���������� ������������� ����:
      MyNums A=(int n)->{
         // ��������� ����������:
         int k,s=0;
         // ���������� ����� ����������� �����:
         for(k=1;k<=n;k++){
            s+=k;
         }
         // ���������:
         return s;
      };
      System.out.println("���������� ������-���������:");
      // ����� ������� �� ������������ ����������:
      A.show(10);
      System.out.println("��������: "+A.get(10));
      // �������������� ������ �� ������:
      MyNums B=A;
      System.out.println("����� ������-���������:");
      // ������������ ��������� ��������� �������������
      // ����� ������-���������:
      A=n->n*n;
      System.out.println("����� ������ show() �� A:");
      A.show(10);
      System.out.println("����� ������ show() �� B:");
      B.show(10);
   }
}
// ����� �� ������������ ��������:
class MyClass{
   // ������� ������������ ���������:
   static void show(){
      System.out.println("����� ������ MyClass");
   }
   // ������� ����������� ����� �����:
   static int sum(int n){
      int k,s=0;
      for(k=1;k<=n;k++){
         s+=k;
      }
      return s;
   }
}
// ������ ���������:
interface MyShow{
   void myshow();
}
// ������ ���������:
interface MySum{
   int mysum(int n);
}
// ������ ���������:
interface MyPrinter{
   void myprint(Object t);
}
// ������� �����:
class StatMethReferenceDemo{
   // ������� �����:
   public static void main(String[] args){
      // ������������� ������ �� ����������� ������:
      MyShow A=MyClass::show;
      MySum B=MyClass::sum;
      MyPrinter P=System.out::println;
      // ����� ������� �� ������������ ����������:
      A.myshow();
      P.myprint("����� �����: "+B.mysum(10));
   }
}
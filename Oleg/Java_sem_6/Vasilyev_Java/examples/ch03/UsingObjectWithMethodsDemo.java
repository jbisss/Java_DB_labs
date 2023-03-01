import javax.swing.JOptionPane;
// �������� ������:
class MyClass{
   // ���� ������:
   int number;
   char symbol;
   // ����� ��� ������������ �������� �����:
   void set(int n,char s){
      number=n;
      symbol=s;
   }
   // ������� ������������ ��������� ������
   // � ��������� �������:
   String getInfo(){
      // �����, ������� ������������
      // ����������� ������:
      String text="�����:  "+number+"\n";
      text+="������:  "+symbol;
      // ��������� ������:
      return text;
   }
}
// �������� ������ � ������� ������� ���������:
class UsingObjectWithMethodsDemo{
   // ������� ����� ���������:
   public static void main(String[] args){
      // �������� ������� �������:
      MyClass objA=new MyClass();
      // �������� ������� �������:
      MyClass objB=new MyClass();
      // ������������ �������� ����� ������� �������:
      objA.set(100,'A');
      // ������������ �������� ����� ������� �������:
      objB.set(200,'B');
      // ����������� ������� ����������� ����:
      JOptionPane.showMessageDialog(null,
         objA.getInfo(),  // ������������ �����
         "������ ������", // ��������� ����
         JOptionPane.INFORMATION_MESSAGE); // ��� ����
      // ����������� ������� ����������� ����:
      JOptionPane.showMessageDialog(null,
         objB.getInfo(),  // ������������ �����
         "������ ������", // ��������� ����
         JOptionPane.INFORMATION_MESSAGE); // ��� ����
   }
}
import javax.swing.JOptionPane;
// �������� ������:
class MyClass{
   // ���� ������:
   int number;
   char symbol;
}
// �������� ������ � ������� ������� ���������:
class UsingObjectDemo{
   // ������� ����� ���������:
   public static void main(String[] args){
      // �������� �������:
      MyClass obj=new MyClass();
      // ������������ �������� ����� �������:
      obj.number=100;
      obj.symbol='A';
      // ����� ��� ����������� � ���������� ����:
      String text="�����:  "+obj.number+"\n";
      text+="������:  "+obj.symbol;
      // ����������� ����������� ����:
      JOptionPane.showMessageDialog(null,text);
   }
}
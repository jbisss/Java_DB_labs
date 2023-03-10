// ������ ������ JFrame:
import javax.swing.JFrame;
// �������� ������ ������������� ����������� JFrame:
class MyFrame extends JFrame{
   // �����������:
   MyFrame(String name){
      // ����� ������������ �����������:
      super(name);
      // ��������� � ������� ����:
      setBounds(250,250,300,200);
      // ���� ���������� ��������:
      setResizable(false);
      // ������� �� ������ ��������� �����������:
      setDefaultCloseOperation(EXIT_ON_CLOSE);
      // ����������� ���� �� ������:
      setVisible(true);
   }
}
// ������� �����:
class SimpleWindowDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� ���������� ������� ���������:
      new MyFrame("������� ����");
   }
}
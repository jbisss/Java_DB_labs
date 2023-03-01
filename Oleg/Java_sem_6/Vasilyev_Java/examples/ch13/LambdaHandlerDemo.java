// ������ �������:
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// ����� ��� �������� ����:
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
      // ���������� ��������� ����������:
      setLayout(null);
      // ������ ����������� (��� ����������� � �����):
      ImageIcon img=new ImageIcon("d:/books/pictures/giraffe.png");
      // ��������� �������� ��� ����������� � �����:
      String txt="<html>��� �����.<br>�� �������.<br>�� ��� �����.</html>";
      // �������� ������� �����:
      JLabel lbl=new JLabel(txt,img,JLabel.LEFT);
      // �������� ������� ������:
      Font F=new Font(Font.MONOSPACED,Font.BOLD,16);
      // ���������� ������ � �����:
      lbl.setFont(F);
      // ��������� � ������� �����:
      lbl.setBounds(10,30,280,80);
      // ������� � ����� �������������� �����:
      lbl.setOpaque(true);
      // ������-����� ���� ��� ���� �����:
      lbl.setBackground(Color.LIGHT_GRAY);
      // ����� ������ �����:
      lbl.setBorder(BorderFactory.createEtchedBorder());
      // ���������� ����� � ����:
      add(lbl);
      // �������� ������� ������:
      JButton btn=new JButton("������� ����");
      // ��������� � ������� ������:
      btn.setBounds(50,120,200,30);
      // ���������� ����� ����������� ����� ������:
      btn.setFocusPainted(false);
      // ����������� � ������ �����������
      // �� ������ ������-���������:
      btn.addActionListener(e->{System.exit(0);});
      // ���������� ������ � ����:
      add(btn);
      // ����������� ���� �� ������:
      setVisible(true);
   }
}
// ������� �����:
class LambdaHandlerDemo{
   // ������� �����:
   public static void main(String[] args){
      // �������� ������� ����:
      new MyFrame("������-���������");
   }
}
package fromBook.chapter11.example_1;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
class TryCatchExampleDemo{
    public static void main(String[] args){
        String input;
        int num;
        input=showInputDialog(null,
                "Введите число",
                "Число",
                QUESTION_MESSAGE
        );
        try{
            num=parseInt(input);
            showMessageDialog(null,
                    "Числа "+(num-1)+", "+num+" и "+(num+1),
                    "Числа",
                    INFORMATION_MESSAGE
            );
        }catch(Exception e){
            showMessageDialog(null,
                    "Что-то пошло не так…",
                    "Ошибка",
                    ERROR_MESSAGE
            );
        }
    }
}

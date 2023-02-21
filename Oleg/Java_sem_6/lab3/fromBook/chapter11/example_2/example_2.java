package fromBook.chapter11.example_2;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
class MoreTryCatchDemo{
    public static void main(String[] args){
        String input;
        char[] symbs;
        int size,index;
        input=showInputDialog(null,
                "Укажите размер массива",
                "Символьный массив",
                QUESTION_MESSAGE
        );
        try{
            size=parseInt(input);
            symbs=new char[size];
            String txt="| ";
            for(int k=0;k<size;k++){
                symbs[k]=(char)('A'+k);
                txt+=symbs[k]+" | ";
            }
            showMessageDialog(null,
                    txt,
                    "Символы из массива",
                    INFORMATION_MESSAGE
            );
            input=showInputDialog(null,
                    "Укажите индекс элемента",
                    "Индекс элемента массива",
                    QUESTION_MESSAGE
            );
            index=parseInt(input);
            txt="Индекс — "+index+"\nСимвол — "+symbs[index];
            showMessageDialog(null,
                    txt,
                    "Символ",
                    INFORMATION_MESSAGE
            );
        }
        catch(NumberFormatException e){
            showMessageDialog(null,
                    "К сожалению возникла ошибка…",
                    "Ошибка",
                    WARNING_MESSAGE
            );
        }
        catch(NegativeArraySizeException e){
            showMessageDialog(null,
                    "Некорректный размер массива!",
                    "Ошибка при создании массива",
                    ERROR_MESSAGE
            );
        }
        catch(ArrayIndexOutOfBoundsException e){
            showMessageDialog(null,
                    "Вы уверены? Такого элемента нет!",
                    "Ошибка при выборе индекса",
                    QUESTION_MESSAGE
            );
        }
    }
}

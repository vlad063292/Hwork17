
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* System.out.println("Hello World");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        System.out.println(i);

         // mySwitch(i);
        myIf(i);*/
       // myFor();
        //myMultiplicationTable();
        myArithmeticmean();
    }

    /* Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
          1, 2 или 3, а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3.
          Написать двумя способами. If и switch.
        static void myIf(int i){
            if(i == 3) System.out.println(i);
            else if (i == 2) System.out.println(i);
            else if(i == 1) System.out.println(i);
            else    System.out.println("Вы ввели неправильное число");*/

        }

        static void mySwitch (int i) {
            switch (i) {
                case 1:
                    System.out.println("Вы ввели число 1");
                    break;
                case 2:
                    System.out.println("Вы ввели число 2");
                    break;
                case 3:
                    System.out.println("Вы ввели число 3");
                    break;
                default:
                    System.out.println("Вы ввели неправильное число");
            }
        }
    /*Необходимо вывести на экран числа от 5 до 1. На экране должно быть:
        5 4 3 2 1 */

          static void myFor(){

              for (int i = 5; i >=0;i--)
              System.out.print(i + " ");
          }


    /*Необходимо вывести на экран таблицу умножения на 3*/

          static void myMultiplicationTable(){

              for (int i = 1; i<=10; i ++)
              System.out.printf("3 * %d = %d \n", i, 3 * i);
          }


    /*Необходимо вывести на экран числа от 5 до 1. На экране должно быть:
         5 4 3 2 1
         */
    static void myArithmeticmean(){
        float sum = 0;
        for(int i = 1; i<=100; i ++){
            sum = sum+i;
        }
        System.out.printf("Average = %.2f", sum/100);

    }

}







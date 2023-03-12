/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*; 
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
public class Main
{
    static void HowOldMyBuddy(int friendYear){ 
        /*
         Создайте переменную currentYear, которая будет содержать текущий год. 
         Создайте переменную friendYear, которая будет содержать год рождения друга. 
         Вывести в консоль "Моему Другу (число) лет".
         yyyy/MM/dd HH:mm:ss
        */
        
         // создаю текущий год
         
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");  
         LocalDateTime now = LocalDateTime.now(); 
         int currentYear = Integer.parseInt(dtf.format(now)); 
         
         // вывожу возраст друга, тут конечно надо учесть день и месяц, а то можно обидеть :)
         
         System.out.println("Моему Другу "+(currentYear-friendYear)+" лет"); 
    }
    static void NumberManipulation(int InputNumber){
        /*
        В переменной number записано число. 
        В переменную lastDigit необходимо записать последнюю цифру этого числа. 
        Например number = 122256, lastDigit будет = 6
        */
        
        //вычисляю остаток от деления
        
        int lastDigit = InputNumber%10;
        System.out.println(lastDigit);
    }
    static void HowIfWorks(int InputAge, String InputName){
        /*
        У нас есть имя и возраст. 
        Если возраст в пределах 18–30(включительно), 
        то вывести надпись «Имя, поздравляю вы разобрались как работает if».
        */
        
        //старше 30 какая-то дискриминация :)
        
        if((InputAge>=18)&(InputAge<=30)){
            System.out.println(InputName+", поздравляю вы разобрались как работает if");
        }
    }
    static void Coordinates(int x, int y){
        /*
        Вспомним математику и систему координат. 
        Необходимо написать программу в которой будут две переменных x, y. 
        Программа должна говорить в какой четверти находится цель согласно значениям x, y. 
        В консоль должно выводиться – "Цель находится в (номер четверти)!", 
        учтите обработку если x, y будут = 0
        */
        
        
        if ((x>0)&(y>0)){
            System.out.println("Цель находится в (1)!");
        }
        if ((x<0)&(y>0)){
            System.out.println("Цель находится в (2)!");
        }
        if ((x<0)&(y<0)){
            System.out.println("Цель находится в (3)!");
        }
        if ((x>0)&(y<0)){
            System.out.println("Цель находится в (4)!");
        }
        
        // не нашел как интерпретировать принадлежность осям, поэтому посчитал оси точками пересечения четвертей
        
        if ((x==0)&(y>0)){
            System.out.println("Цель находится в (1,2)!");
        }
        if ((x>0)&(y==0)){
            System.out.println("Цель находится в (1,4)!");
        }
        if ((x<0)&(y==0)){
            System.out.println("Цель находится в (2,3)!");
        }
        if ((x==0)&(y<0)){
            System.out.println("Цель находится в (3,4)!");
        }
        if ((x==0)&(y==0)){
            System.out.println("Цель находится в (1,2,3,4)!");
        }        
    }
    static void TrianglePossibility(double d, double e, double f){
        /*
        Дано три числа - стороны треугольника! 
        Необходимо проверить - может ли существовать с такими значениями треугольник! 
        На экран нужно вывести "Такой треугольник можно построить" или "Такой треугольник нельзя построить"
        */
        
        // длинна стороны должна быть положительной и больше нуля
        
        if ((d>0)&(e>0)&(f>0)){
            System.out.println("Такой треугольниk можно построить");
        }
        else{
            System.out.println("Такой треугольниk нельзя построить");
        }
    }
    
	public static void main(String[] args) {
	    System.out.println("Решаем задачи:");
	    System.out.println("1. Создайте переменную currentYear, которая будет содержать текущий год. Создайте переменную friendYear, которая будет содержать год рождения друга. Вывести в консоль «Моему Другу (число) лет».");   
	    System.out.println("2. В переменной number записано число. В переменную lastDigit необходимо записать последнюю цифру этого числа. Например number = 122256, lastDigit будет = 6");
	    System.out.println("3. У нас есть имя и возраст. Если возраст в пределах 18–30(включительно), то вывести надпись «Имя, поздравляю вы разобрались как работает if».");
	    System.out.println("4. Вспомним математику и систему координат. Необходимо написать программу в которой будут две переменных x, y. Программа должна говорить в какой четверти находится цель согласно значениям x, y. В консоль должно выводиться – «Цель находится в (номер четверти)!», учтите обработку если x, y будут = 0");
	    System.out.println("5. Дано три числа - стороны треугольника! Необходимо проверить - может ли существовать с такими значениями треугольник! На экран нужно вывести «Такой треугольник можно построить» или «Такой треугольник нельзя построить»");
	    System.out.println("");
	    
		Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
		System.out.print("Выберите номер задачи: ");  
        int a= sc.nextInt(); 
        if (a == 1){
            System.out.print("Введите год рождения друга: ");
            int friendYear= sc.nextInt();
            HowOldMyBuddy(friendYear);
        }
        if (a == 2){
            System.out.print("Введите целое положительное число не больше 2147483647: ");
            int number= sc.nextInt();
            NumberManipulation(number);
        }
        if (a == 3){ // тут интересный глючек компилятора, первый ввод стринга проскакивает :)
            System.out.print("Введите имя: ");
            String InputName = sc.nextLine();
            InputName = sc.nextLine();
            System.out.print("Введите возраст ( целое положительное число не больше 2147483647): ");
            int InputAge = sc.nextInt();
            HowIfWorks(InputAge, InputName);
        }
        if (a == 4){
            System.out.print("Введите X: ");
            int x = sc.nextInt();
            System.out.print("Введите Y: ");
            int y = sc.nextInt();
            Coordinates(x,y);
        }
        if (a == 5){
           System.out.println("Введите стороны треугольника d, e, f");
           System.out.print("Введите длинну стороны d: ");
           double d = sc.nextInt();
           System.out.print("Введите длинну стороны e: ");
           double e = sc.nextInt();
           System.out.print("Введите длинну стороны f: ");
           double f = sc.nextInt();
           TrianglePossibility(d,e,f);
        }
	}
}

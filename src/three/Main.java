package three;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = null;

        System.out.println("Ввести выражение вручную - 1, Прочитать с файла - 2:");
        int vibor = s.nextInt();
        s.nextLine();
        switch(vibor){
            case 1:
                a = s.nextLine();
                break;
            case 2:
                a = "";
                try(FileReader reader = new FileReader("input.txt")){
                    int c;
                    while((c=reader.read())!=-1){
                        a += (char)c;
                    }
                    System.out.println(a);
                }catch (IOException ex){
                    System.out.println(ex.getMessage());
                }
                break;
            default:
                System.out.println("Неправильно введено значение");
                break;
        }

        String res = "";
        try{
            String[] a1 = a.split(" ");
            int a3, a2;
            String a4;
            a2 = Integer.parseInt(a1[0]);
            a3 = Integer.parseInt(a1[2]);
            a4 = a1[1];
            switch (a4){
                case "+":
                    res = (a2+a3) + "";
                    break;
                case "-":
                    res = (a2-a3) + "";
                    break;
                case "*":
                    res = (a2*a3) + "";
                    break;
                case "/":
                    res = (a2/a3) + "";
                    break;
                default:
                    throw new Exception("Operation Error!");
            }
        }catch (NumberFormatException e){
            res = "Error! Not number";
        } catch (ArithmeticException e) {
            res = "Error! Division by zero";
        } catch (Exception e) {
            res = e.getMessage();
        }

        System.out.println("Вывести результат консоль - 1, Записать в файл - 2:");
        int vibor2 = s.nextInt();
        switch(vibor2){
            case 1:
                System.out.println(res);
                break;
            case 2:
                try(FileWriter writer = new FileWriter("output.txt", false)){
                    writer.write(res);
                }catch (IOException ex){
                    System.out.println(ex.getMessage());
                }
                break;
            default:
                System.out.println("Неправильно введено значение");
                break;
        }

    }
}
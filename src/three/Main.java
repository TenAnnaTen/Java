package three;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] b = {"+", "-", "*", "/"};
        String a = s.nextLine();
        try{
            String[] a1 = a.split(" ");
            int a3, a2;
            String a4;
            a2 = Integer.parseInt(a1[0]);
            a3 = Integer.parseInt(a1[2]);
            a4 = a1[1];
            switch (a4){
                case "+":
                    System.out.println(a2+a3);
                    break;
                case "-":
                    System.out.println(a2-a3);
                    break;
                case "*":
                    System.out.println(a2*a3);
                    break;
                case "/":
                    System.out.println(a2/a3);
                    break;
                default:
                    throw new Exception("Operation Error!");
            }
        }catch (NumberFormatException e){
            System.out.println("Error! Not number");
        } catch (ArithmeticException e) {
            System.out.println("Error! Division by zero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

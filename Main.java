import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    // Объявляем объект класса Scanner для ввода данных
    public static Scanner in = new Scanner(System.in);
    // Объявляем объект класса PrintStream для вывода данных
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        // Считывание двух вещественных чисел a и b из консоли
        double a = in.nextDouble(), b = in.nextDouble();

        // Определение отношения b к 0
        if (b==0) {
            // Определение отношения a к 0, при b = 0
            // При a = 0 и a < 0 x имет одинаковую область допустимых значений (-∞,0)U(0,+∞)
            // При a > 0 x принадлежит пустому множеству
            if (a<=0) out.print("(-∞,0)U(0,+∞)");
            else out.print("x∈∅");
        } else if (b>0) {
            // Определение отношения a к 0, при b > 0
            // При a = 0 x принадлежит промежутку x∈(-∞,0)U(0,b)U(b,+∞)
            // При a > 0 x принадлежит промежутку x∈(0,b)
            // При a < 0 x принадлежит промежутку x∈(-∞,0)U(b,+∞)
            if (a==0) {
                out.print("x∈(-∞,0)U(0,"+b+")U("+b+",+∞)");
            } else if (a>0) {
                out.print("x∈(0,"+b+")");
            } else out.print("x∈(-∞,0)U("+b+",+∞)");
        } else {
            // Определение отношения a к 0, при b < 0
            // При a = 0 x принадлежит промежутку x∈(-∞,b)U(b,0)U(0,+∞)
            // При a > 0 x принадлежит промежутку x∈(b,0)
            // При a < 0 x принадлежит промежутку x∈(-∞,b)U(0,+∞)
            if (a==0) {
                out.print("x∈(-∞,"+b+")U("+b+",0)U(0,+∞)");
            } else if (a>0) {
                out.print("x∈("+b+",0)");
            } else out.print("x∈(-∞,"+b+")U(0,+∞)");
        }
    }
}
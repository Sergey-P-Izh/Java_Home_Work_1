//Задача 1 Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

public class Task1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
 
        while ( true ) {
            System.out.print("Number: ");
            if ( ! scanner.hasNextInt() )
                break;
            int n = scanner.nextInt();
            if ( n < 0 )
                break;
            int s = String.valueOf(n).chars().map(a -> a - '0').sum();
            System.out.println("Sum of digits: " + s);
        }
 
        scanner.close();
    }
}
    

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Triangle triangle =new Triangle();
//        Scanner scanner =new Scanner(System.in);
//        System.out.print("vysota :");
//        triangle.a= scanner.nextInt();
//        System.out.print("osnovanie triugolnika :");
//        triangle.b=scanner.nextInt();
//        triangle.c=2;
//
//        triangle.area();
        Scanner scanner =new Scanner(System.in);

        Triangle triangle1 = new Triangle();
        System.out.print("a = ");
        triangle1.a = scanner.nextInt();
        System.out.print("b = ");
        triangle1.b = scanner.nextInt();
        System.out.print("c = ");
        triangle1.c = scanner.nextInt();
        triangle1.area();
    }
}
    
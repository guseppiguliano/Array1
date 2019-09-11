import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size = input.nextInt();
        
        khpalaArray obj = new khpalaArray(size);
        obj.createArray();
        obj.printArray();
    }
}

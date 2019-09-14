import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        /*
        System.out.println("Menu");
        System.out.println("fillArray");
        System.out.println("printArray");
        System.out.println("Search Elements");
        System.out.println("Del Elements");
        System.out.println("modify elements");
        */
        
        System.out.println("Enter size of the array: ");
        int size = input.nextInt();
        
        khpalaArray obj = new khpalaArray(size);
        obj.fillArray();
        obj.printArray();
        obj.searchElement(47);
        obj.deleteElement(11);
//        obj.modifyElement(12);
//        obj.printArray();
    }
}

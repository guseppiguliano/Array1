import java.util.Scanner;

public class khpalaArray {
    private int size;
    private int[] list;
    
    public khpalaArray() {}
    
    public khpalaArray(int size) {
        this.size = size;
    }
    
    public void createArray()
    {
        list = new int[size];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < list.length; i++)
        {
            System.out.print("Enter element[" + i + "]: ");
            list[i] = input.nextInt();
        }
    }
    
    public void printArray()
    {
        System.out.println("Array elements are: ");
        
        for (int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + " ");
        }
    }
}

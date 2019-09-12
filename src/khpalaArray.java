import java.util.Scanner;

public class khpalaArray {
    private int size;
    private int[] list;
    
    public khpalaArray() {}
    
    public khpalaArray(int size) {
        this.size = size;
    }
    
    public void fillArray()
    {
        list = new int[size];
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter element[" + i + "]: ");
            list[i] = input.nextInt();
        }
    }
    
    public int searchElement(int key)
    {
        return 0;
        
    }
    
    public void printArray()
    {
        System.out.println("Array elements are: ");
        
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
    
    public void deleteElement(int num)
    {
        int index = -1;
        for (int i = 0; i < list.length; i++) {
            if (list[i] == num) {
                index = i;
                break;
            }
        }
    }
}

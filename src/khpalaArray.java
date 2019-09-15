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
        System.out.println();
    }
    
    public void searchElement(int key)
    {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
		System.out.println("Requested element found at index: " + i);
                break;
            }
	    else
		System.out.println("Element not found!");
        }
        System.out.println();
    }
    
    public void deleteElement(int key)
    {
	for (int i = 0; i < list.length; i++) {
	    if (list[i] == key) {
//		todo
	    }
	}
    }
    
    public void printArray()
    {
        System.out.println("Array elements are: ");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
	
        System.out.println();
    }
        
    public void modifyElement(int key)
    {
        
    }
}

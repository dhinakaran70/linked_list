package custom_singly_linked_list;

import java.util.Locale;
import java.util.Scanner;

public class s_main {
    public static void main(String[] args) {
        node_body list = new node_body();
        Scanner scn = new Scanner(System.in);

        //to insert elements
        while(true) {
            System.out.println("you can do these following functions( 1.add, 2.delete, 3.display, 4.quit)");
            String input=scn.nextLine().trim().toLowerCase();

            if(input.equals("add") || input.equals("insert") || input.equals("1")){
                System.out.println("No of elements to insert:");
                int size = scn.nextInt();
                int[] array = new int[size];
                System.out.println("enter the " + size + " elements to insert :");
                for (int i = 0; i < size; i++) {
                    array[i] = scn.nextInt();
                }
                scn.nextLine();
                for (int i : array) {
                    list.add(i);
                }
                System.out.println("Inserted sucessfully");
            }
            else if (input.equals("delete") ||input.equals("remove") || input.equals("2")) {
                System.out.println("No of elements to delete:");
                int size = scn.nextInt();
                int[] array = new int[size];
                System.out.println("enter the " + size + " elements to remove:");
                for (int i = 0; i < size; i++) {
                    array[i] = scn.nextInt();
                }
                for (int i : array) {
                    list.delete(i);
                }
                System.out.println("Deleted successfully");
            }
            else if(input.equals("display") || input.equals("show")|| input.equals("view") || input.equals("3")){
                list.display();
                System.out.println();
            }
            else if(input.equals("quit") || input.equals("exit") || input.equals("4")){
                System.out.println("Exiting the function stack .. byee ");
                break;
            }
            else{
                System.out.println("This is an Invalid input . try again");
            }

        }
    }

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LiveProgram {
    public static void main(String[] args) throws IOException {
        SinglyLinkedList listStudents = new SinglyLinkedList();

        boolean exit = false;
        int prn = 0;
        String name = null;
        String address = null;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while(!exit){

            try {
                System.out.println("Enter prn: ");
                prn = Integer.parseInt(reader.readLine());
                System.out.println("Enter name: ");
                name = reader.readLine();
                System.out.println("Enter City Location: ");
                address = reader.readLine();

            }
            catch (Exception exception){
                System.out.println(exception);
            }

            Student newStudent = new Student(prn,name,address);

            listStudents.push(newStudent);

            System.out.println("More names? (y/n): ");
            String response = reader.readLine();

            if (response.equals("n")){
                exit = true;
            }

        }

        printStudentList(listStudents);

        SelectionSort.sort(listStudents.head);

    }

    private static void printStudentList(SinglyLinkedList students) {
        SinglyLinkedList.Node currentNode = students.head;

        System.out.println("PRN: " + currentNode.data.getPrn());
        System.out.println("Name: " + currentNode.data.getName());
        System.out.println("Location: " + currentNode.data.getAddress());

        while (currentNode.next != null){
            System.out.println("PRN: " + currentNode.next.data.getPrn());
            System.out.println("Name: " + currentNode.next.data.getName());
            System.out.println("Location: " + currentNode.next.data.getAddress());
            currentNode = currentNode.next;
        }

    }
}

class SinglyLinkedList{

    //Head of list
    Node head;
    //Tail of list
    Node tail;

    int counter = 0;

    static class Node {
        Student data;
        Node next;

        Node(Student d) {
            this.data = d;
            this.next = null;
        }

    }

    public void push(Student new_data)
    {
        //Allocate new node w/ data
        Node new_node = new Node(new_data);

        //Make next of new node as 'old' head ref
        new_node.next = head;

        //Move the head to point to appropriate new Node
        head = new_node;

        //Tail should remain fixed to the bottom of stack in push operation, unless manually changed
        if(counter == 0){
            tail = new_node;
        }

        counter++;
    }

}


/* 4.1 Create the class with the name "ForLoop_Q4"
4.2 Create a method with the name "printMyName" with no return type and two parameters with the type string and name "name" and int type name 'howManyTime'.
4.3 Write the for loop into the "printMyName '' method which prints your name depending upon howManyTime's value.
4.4	Create the main method
4.5 Create the Object and call the 'printMyName' method into the main method.

*/
package automationtest;

public class ForLoop_Q4 {

    public void printMyNmae (String name , int howanytime){

        for (int i = 1; i<=howanytime; i++){
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        ForLoop_Q4 obj= new ForLoop_Q4();
        obj.printMyNmae("Alpesh",10);

    }
}

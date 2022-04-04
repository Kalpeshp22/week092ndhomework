
/*  5.1 Create the class with the name "ArrayList_Q5"
5.2	Create the main method
5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
5.4 Print the list using a forEach loop

 */
package automationtest;

import java.util.ArrayList;

public class ArrayList_Q5 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Scrum");
        arrayList.add("Java");
        arrayList.add("Jira");
        arrayList.add("Selenium");
        arrayList.add("Cucumber");
        arrayList.add("Postman");
        arrayList.add("Rest Assured");

        for (String team : arrayList) {
            System.out.println(team);
        }

    }
}

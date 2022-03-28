package com.C4Evaluation;
import java.util.*;

/*      Create a HashMap object with key as department name, and value as Employee object
        Add 4 department(HR,Sales,Marketing,Accounts) and Employee entries in the map
        Call the above getSortedMapWithValue method by passing the HashMap object
        Print all the entries from the returned Map from the getSortedMapWithValue method as follows:*/
public class Main {
    public static void main(String[] args) {
        HashMap<String,Employee> hm =new HashMap<>();
        hm.put("HR",new Employee("123","Aman",10000));
        hm.put("Sales",new Employee("124","Akash",12000));
        hm.put("Marketing",new Employee("125","Apoorva",17000));
        hm.put("Accounts",new Employee("123","Ankush",13000));


        Set<String> states = hm.keySet();
        for(String state : states)
        {
            System.out.println(state);
        }
        Collection<Employee> cols = hm.values();
        List<Employee> employees =  new ArrayList<>(cols);
        Collections.sort(employees,new ComparingSalary());

            System.out.println(employees.toString());



    }

}

package za.ac.cput.ADPAssignment2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    List<Employee> employeeList = new ArrayList<>();

    // Collection
    @Test
    public void testAddCollection() {

        Collection employeeCollection = new LinkedHashSet();
        Employee employee1 = new Employee (001, "Fukama","Athi", 20);
        Employee employee2 = new Employee (002, "George", "Paul",23);
        Employee employee3 = new Employee (003,"Phillip", "John", 24);
        Employee employee4 = new Employee (004, "Smith","Alvis", 21);
        Employee employee5 = new Employee (005, "Jack","Donald",23);

        employeeCollection.add(employee1);
        employeeCollection.add(employee2);
        employeeCollection.add(employee3);
        employeeCollection.add(employee4);
        employeeCollection.add(employee5);


        assertEquals(5, employeeCollection.size());

    }
    @Test
    public void testRemoveCollection(){

        Collection employeeCollection = new LinkedHashSet();
        Employee employee1 = new Employee (001, "Fukama","Athi", 20);
        Employee employee2 = new Employee (002, "George", "Paul",23);
        Employee employee3 = new Employee (003,"Phillip", "John", 24);
        Employee employee4 = new Employee (004, "Smith","Alvis", 21);
        Employee employee5 = new Employee (005, "Jack","Donald",23);

        employeeCollection.add(employee1);
        employeeCollection.add(employee2);
        employeeCollection.add(employee3);
        employeeCollection.add(employee4);
        employeeCollection.add(employee5);

        employeeCollection.remove(employee1);
        employeeCollection.remove(employee2);
        employeeCollection.remove(employee5);
        System.out.println(employeeCollection);
        assertEquals(2, employeeCollection.size());

    }
    @Test
    public void testFindCollection(){


        Collection employeeCollection = new LinkedHashSet();
        Employee employee1 = new Employee (001, "Fukama","Athi", 20);
        Employee employee2 = new Employee (002, "George", "Paul",23);
        Employee employee3 = new Employee (003,"Phillip", "John", 24);
        Employee employee4 = new Employee (004, "Smith","Alvis", 21);
        Employee employee5 = new Employee (005, "Jack","Donald",23);

        employeeCollection.add(employee1);
        employeeCollection.add(employee2);
        employeeCollection.add(employee3);
        employeeCollection.add(employee4);
        employeeCollection.add(employee5);

        if (employeeCollection.contains(employee4)) {
            System.out.println(employee4);
        }
        assertEquals(5,employeeCollection.size());
    }


    // List
    @Test
    public void testAddList() {


        Employee employee1 = new Employee (001, "Fukama","Athi", 20);
        Employee employee2 = new Employee (002, "George", "Paul",23);
        Employee employee3 = new Employee (003,"Phillip", "John", 24);
        Employee employee4 = new Employee (004, "Smith","Alvis", 21);
        Employee employee5 = new Employee (005, "Jack","Donald",23);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);


        assertEquals(5, employeeList.size());

    }
    @Test
    public void testRemoveList(){

        Employee employee1 = new Employee (001, "Fukama","Athi", 20);
        Employee employee2 = new Employee (002, "George", "Paul",23);
        Employee employee3 = new Employee (003,"Phillip", "John", 24);
        Employee employee4 = new Employee (004, "Smith","Alvis", 21);
        Employee employee5 = new Employee (005, "Jack","Donald",23);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        employeeList.remove(employee1);
        assertEquals(4, employeeList.size());

    }
    @Test
    public void testFindList(){


        Employee employee1 = new Employee (001, "Fukama","Athi", 20);
        Employee employee2 = new Employee (002, "George", "Paul",23);
        Employee employee3 = new Employee (003,"Phillip", "John", 24);
        Employee employee4 = new Employee (004, "Smith","Alvis", 21);
        Employee employee5 = new Employee (005, "Jack","Donald",23);

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        System.out.println(employeeList.get(0));
        assertEquals(5,employeeList.size());

    }

    //Set

    @Test
    public void testAddSet(){

        Set<Employee> employeeSet = new HashSet<>();

        Employee employee1 = new Employee (001, "Fukama","Athi", 20);
        Employee employee2 = new Employee (002, "George", "Paul",23);
        Employee employee3 = new Employee (003,"Phillip", "John", 24);
        Employee employee4 = new Employee (004, "Smith","Alvis", 21);
        Employee employee5 = new Employee (005, "Jack","Donald",23);


        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);


        assertEquals(5, employeeSet.size());
    }

    @Test
    public void testRemoveSet(){

        Set<Employee> employeeSet = new HashSet<>();

        Employee employee1 = new Employee (001, "Fukama","Athi", 20);
        Employee employee2 = new Employee (002, "George", "Paul",23);
        Employee employee3 = new Employee (003,"Phillip", "John", 24);
        Employee employee4 = new Employee (004, "Smith","Alvis", 21);
        Employee employee5 = new Employee (005, "Jack","Donald",23);


        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);

        employeeSet.remove(employee1);
        employeeSet.remove(employee2);
        assertEquals(3, employeeSet.size());

    }

    @Test
    public void testFindSet() {

        Set<Employee> employeeSet = new HashSet<>();

        Employee employee1 = new Employee(001, "Fukama", "Athi", 20);
        Employee employee2 = new Employee(002, "George", "Paul", 23);
        Employee employee3 = new Employee(003, "Phillip", "John", 24);
        Employee employee4 = new Employee(004, "Smith", "Alvis", 21);
        Employee employee5 = new Employee(005, "Jack", "Donald", 23);


        employeeSet.add(employee1);
        employeeSet.add(employee2);
        employeeSet.add(employee3);
        employeeSet.add(employee4);
        employeeSet.add(employee5);
        if (employeeSet.contains(employee4)) {
            System.out.println(employee4);
        }
        assertEquals(5,employeeSet.size());
    }

    //Map
    @Test
    public void testAddMap(){

        Map<Integer,Employee> employeeMap = new HashMap<>();


        Employee employee1 = new Employee (001, "Fukama","Athi", 20);
        Employee employee2 = new Employee (002, "George", "Paul",23);
        Employee employee3 = new Employee (003,"Phillip", "John", 24);
        Employee employee4 = new Employee (004, "Smith","Alvis", 21);
        Employee employee5 = new Employee (005, "Jack","Donald",23);

        employeeMap.put(001,employee1);
        employeeMap.put(002,employee2);
        employeeMap.put(003,employee3);
        employeeMap.put(004,employee4);
        employeeMap.put(005,employee5);

        System.out.println(employeeMap);
        assertEquals(5, employeeMap.size());

    }

    @Test
    public void testRemoveMap(){

        Map<Integer,Employee> employeeMap = new HashMap<>();


        Employee employee1 = new Employee (001, "Fukama","Athi", 20);
        Employee employee2 = new Employee (002, "George", "Paul",23);
        Employee employee3 = new Employee (003,"Phillip", "John", 24);
        Employee employee4 = new Employee (004, "Smith","Alvis", 21);
        Employee employee5 = new Employee (005, "Jack","Donald",23);

        employeeMap.put(001,employee1);
        employeeMap.put(002,employee2);
        employeeMap.put(003,employee3);
        employeeMap.put(004,employee4);
        employeeMap.put(005,employee5);


        employeeMap.remove(2);
        employeeMap.remove(3);
        System.out.println(employeeMap);
        assertEquals(3, employeeMap.size());

    }

    @Test
    public void testFindMap(){

        Map<Integer,Employee> employeeMap = new HashMap<>();


        Employee employee1 = new Employee (001, "Fukama","Athi", 20);
        Employee employee2 = new Employee (002, "George", "Paul",23);
        Employee employee3 = new Employee (003,"Phillip", "John", 24);
        Employee employee4 = new Employee (004, "Smith","Alvis", 21);
        Employee employee5 = new Employee (005, "Jack","Donald",23);

        employeeMap.put(001,employee1);
        employeeMap.put(002,employee2);
        employeeMap.put(003,employee3);
        employeeMap.put(004,employee4);
        employeeMap.put(005,employee5);


        employeeMap.get(employee1);
        employeeMap.get(employee2);
        System.out.println(employeeMap);
        assertEquals(5, employeeMap.size());

    }

}

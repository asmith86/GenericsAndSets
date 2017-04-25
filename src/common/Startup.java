/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Alex
 */
public class Startup {
    public static void main(String[] args) {
        List emps = new ArrayList();
        emps.add(new Employee("124-08-6789"));
        emps.add(new Employee("999-02-0451"));
        emps.add(new Employee("133-11-6442"));
        
        //Lab 2
        for(Object o : emps) {
            Employee e = (Employee)o;
            System.out.println(e.getSsn());
        }
        System.out.println("");
        
        //Lab 3
        List<Employee> genEmps = new ArrayList<>(emps);
        
        for(Employee e : genEmps) {
            System.out.println(e.getSsn());
        }
        
        //Lab 4 
        List<Dog> dogDupes = new ArrayList<>();
        dogDupes.add(new Dog(1234));
        dogDupes.add(new Dog(1211));
        dogDupes.add(new Dog(1234));
        dogDupes.add(new Dog(2222));
        dogDupes.add(new Dog(1234));
        dogDupes.add(new Dog(5555));
        
        Set<Dog> rmDupes = new HashSet<Dog>(dogDupes);
        
        List<Dog> noDogDupes = new ArrayList<>(rmDupes);
        
        System.out.println("");
        for(Dog d : noDogDupes) {
            System.out.println(d.getRabiesId());
        }
       
        
        
        
    }
}

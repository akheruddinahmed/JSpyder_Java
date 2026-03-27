package com.Java8.stream.method.foreach;

import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private Integer id;
    private String name;
    private Integer sal;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSal() {
        return sal;
    }

    public void setSal(Integer sal) {
        this.sal = sal;
    }

    public Employee(Integer id, String name, Integer sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;



    }
//to sort
    public static int compare(Employee e1,Employee e2){
        return  (e1.getId()<e2.getId()?-1:((e1.getId()==e2.getId())?-1:0));
    }

    @Override
    public int compareTo(Employee e) {
        return compare(this,e);
    }

    //for distinct object(based on id)
    @Override
    public boolean equals(Object o) {

        Employee e1=(Employee) o;
        if (this.id==e1.id){
            return true;
        }
        else
            return false;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return Objects.equals(id, employee.id) && Objects.equals(name, employee.name) && Objects.equals(sal, employee.sal);
    }

    @Override
    public int hashCode() {
        return id;
//        return Objects.hash(id, name, sal);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }




}

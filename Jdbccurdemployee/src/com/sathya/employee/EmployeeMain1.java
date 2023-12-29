// EmployeeMain1 class
package com.sathya.employee;

public class EmployeeMain1 {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();
        // table created
        int create = dao.createEmptable();
        System.out.println("create table succeeded..." + create);
    }
}

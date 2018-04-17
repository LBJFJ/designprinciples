package com.webapp.lbj.lkp.example1.v2;

import java.util.ArrayList;
import java.util.List;

class CompanyManager {

    public void printAllEmployee(SubCompanyManager sub) {
        sub.printEmployee();
        printEmployee();
    }

    private void printEmployee() {
        List<Employee> list2 = this.getAllEmployee();
        for (Employee e : list2) {
            System.out.println(e.getId());
        }
    }
    
    private List<Employee> getAllEmployee() {
        List<Employee> list = new ArrayList<Employee>();
        for (int i = 0; i < 30; i++) {
            Employee emp = new Employee();
            // 为总公司人员按顺序分配一个ID
            emp.setId("总公司" + i);
            list.add(emp);
        }
        return list;
    }
}

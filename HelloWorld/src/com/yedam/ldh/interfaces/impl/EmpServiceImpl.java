package com.yedam.ldh.interfaces.impl;
import com.yedam.ldh.interfaces.model.EmpService;
import com.yedam.ldh.interfaces.model.Employee;

public class EmpServiceImpl implements EmpService{

	@Override
	public void addEmp(Employee emp, Employee[] emps) {
		//System.out.println("추가");
		for(int i = 0; i <emps.length; i ++) {
			if (emps[i]==null) {
				emps[i]=emp;
				break;
			}
		}
		System.out.println("입력완료");
	}

	@Override
	public void searchEmp(int empNo, Employee[] emps) {
//		System.out.println("조회");		
		for(Employee emp : emps) {
			if(emp!=null && emp.getEmpNo()==empNo) {
				System.out.println(emp);
			}
		}
	}

	@Override
	public void empList(Employee[] emps) {
//		System.out.println("리스트");
		for (Employee emp : emps) {
			if(emp!=null) {
				System.out.println(emp);
			}
		}
	
	}

	@Override
	public void delEmp(int empNO, Employee[] emps) {
//		System.out.println("삭제");
		for(int i = 0; i <emps.length; i ++) {
			if(emps[i]!=null && emps[i].getEmpNo() ==empNO) {
				emps[i]= null;
			}
		}
	}

}

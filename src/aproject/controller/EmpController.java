package aproject.controller;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

import aproject.model.EmpService;
import aproject.view.EmpView;
import aproject.vo.EmpVO;

public class EmpController {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmpService eService = new EmpService();
	
		while(true) {
			System.out.println("1.모든직원");
			System.out.println("2.직원상세");
			System.out.println("3.부서의직원");
			System.out.println("4.부서, 직책, 급여로 조회");
			System.out.println("5.부서의 평균급여 이하인 직원 조회");
			System.out.println("6.신규직원 등록");
			System.out.println("7.직원정보 수정");
			System.out.println("8.직원 삭제");
			System.out.println("9 직원의 급여 조회(SP)");
			System.out.println("exit 종료");
			System.out.println("=====작업선택>>");
			
			String job = sc.nextLine();
			if(job.equals("exit")) break;
			
			switch(job) {
			case"1":
				EmpView.print(eService.selectAll());break;
			case"2":{
				System.out.println("조회할 직원번호>>");
				int empId = sc.nextInt();
				EmpView.print(eService.selectById(empId));break;//뷰로 보내서 프린트한다.	
			}
			case"3":{
				System.out.println("조회할 부서를 입력하세요>>");
				int deptid = sc.nextInt();
				EmpView.print(eService.selectByDept(deptid));break;//뷰로 보내서 프린트한다.	
			}
			case"4":{//같은 이름이 있으므로 블럭으로 감싼다.
				System.out.println("조회할 부서번호, job, salary>>");
				int deptid = sc.nextInt();
				String jobid = sc.next();
				double salary = sc.nextDouble();
				EmpView.print(eService.selectByCondition(deptid,jobid,salary));break;//뷰로 보내서 프린트한다.	
			}
			case "5":
				List<EmpVO> empList = eService.selectLAB();//할일이 있으면 변수로 받아온다.
				System.out.println("[Controller] 5번 작업" +empList.size());
				EmpView.print(empList);
			case "6":
				{EmpVO emp = makeEmp(sc);
				EmpView.print(eService.empInsert(emp));
				}
			case "7":{
				System.out.println("==수정할 직원ID===");
				int empid = sc.nextInt();
				EmpVO emp = makeEmp2(sc, empid);
				EmpView.print(eService.empUpdate(emp));
			}
			
			case "8":{
				System.out.println("==삭제할 직원ID===");
				int empid = sc.nextInt();
				EmpView.print(eService.selectById(empid));
				System.out.println("삭제를 계속 하겠습니까? Y/N");
				String ans = sc.next();
				if(ans.equals("Y")) EmpView.print(eService.empDelete(empid));
				
			}
			case "9":{
				System.out.println("조회할 직원번호>>");
				int empId = sc.nextInt();
				EmpView.print("급여는 "+ eService.getSalary(empId)); 
				break;//뷰로 보내서 프린트한다.	
			}
					
			default:
				break;
			}
			
		}
		System.out.println("수고하셨습니다......");
		

	}

	private static EmpVO makeEmp(Scanner sc) {
		System.out.print("1.신규직원의 first_NAME>>");
		String fName = sc.next();
		System.out.print("2.신규직원의 LAST_NAME>>");
		String lastName = sc.next();
		System.out.print("3.신규직원의 email>>");
		String email = sc.next();
		System.out.print("4.신규직원의 jobid>>");
		String jobid = sc.next();
		System.out.print("5.신규직원의 phone>>");
		String phone = sc.next();
		
		System.out.print("6.신규직원의 manager>>");
		int mid = sc.nextInt();
		System.out.print("7.신규직원의 dept>>");
		int deptid = sc.nextInt();
		System.out.print("8.신규직원의 commission>>");
		double comm = sc.nextDouble();
		System.out.print("9.신규직원의 salary>>");
		double sal = sc.nextDouble();
		
		System.out.print("10.신규직원의 입사일 yyyy/mm/dd>>");
		String sdate = sc.next();
		//String->Date
		Date hiredata = DateUtil.convertToDate(sdate);
		
		EmpVO emp = new EmpVO();
		emp.setLast_name(lastName);
		emp.setEmail(email);
		emp.setJob_id(jobid);	
		emp.setCommission_pct(comm);
		emp.setDepartment_id(deptid);
		emp.setFirst_name(fName);
		emp.setHire_date(hiredata);
		emp.setManager_id(mid);
		emp.setPhone_number(phone);
		emp.setSalary(sal);
		return emp;
	}

	private static EmpVO makeEmp2(Scanner sc,int empid) {
	
		System.out.println("1 직원의 EMAIL string>>");
		String email = sc.next();
		System.out.println("2 직원의 department_id int>>");
		int department = sc.nextInt();
		System.out.println("3 직원의 salary double>>");
		Double salary = sc.nextDouble();
		System.out.println("4 직원의 JOB_ID string IT_PROG>>");
		String jobid = sc.next();
		
		System.out.println("5 직원의 HIRE_DATE>>");
		String sDate = sc.next();
		Date hiredata = DateUtil.convertToDate(sDate);
		
		System.out.println("6 직원의 manager_id int>>");
		int manager_id = sc.nextInt();
		

		
		EmpVO emp=new EmpVO();
		emp.setEmail(email);
		emp.setJob_id(jobid);
		emp.setDepartment_id(department);
		emp.setSalary(salary);
		emp.setEmployee_id(empid);
		emp.setHire_date(hiredata);
		emp.setManager_id(manager_id);
		
		return emp;
	}

}

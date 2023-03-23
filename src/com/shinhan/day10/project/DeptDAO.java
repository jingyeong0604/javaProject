package com.shinhan.day10.project;

import java.util.ArrayList;
import java.util.List;

//DAO (Data Access Object)
//CRUD (Create, Read, Update, Delete)
public class DeptDAO {

	private List<DeptVO> data = new ArrayList<>();
	
	//모두 조회
	public List<DeptVO> selectAll() {
		//DB가서 data 가져오기 code 추가될 예정 select * from departments;
		return data;
	}
	
	public DeptVO selectById(int deptId){
		//부서의 번호를 찾아서 리턴하기
		for(DeptVO dept: data) {
			if(dept.getDepartment_id()==deptId) return dept;
		}
//		for(int i=0; i<data.size(); i++) {
//			if(deptId==data.get(i)) {
//				return deptId;
//			}
//		}
		return null;
	}
	
	void insert(DeptVO dept) {
		data.add(dept);
	}
	
	
}

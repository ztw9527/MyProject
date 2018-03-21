package org.sshTP1.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.sshTP1.dao.EmpDao;
import org.sshTP1.dao.impl.EmpDaoImpl;
import org.sshTP1.pojo.Emp;
import org.sshTP1.service.EmpService;
@Service
@Transactional
public class EmpServiceImpl implements EmpService{

	@Resource
	private EmpDaoImpl edl;
	
	public List<Emp> findAll(String hql) {
		List<Emp> e=edl.selectAll(hql);
		return e;
	}

	public void delete(Emp emp) {
		edl.delete(emp);
		
	}

}

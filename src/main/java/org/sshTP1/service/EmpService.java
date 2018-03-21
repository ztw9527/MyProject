package org.sshTP1.service;

import java.util.List;

import org.sshTP1.pojo.Emp;

public interface EmpService {

	List<Emp> findAll(String hql);

	void delete(Emp emp);

}

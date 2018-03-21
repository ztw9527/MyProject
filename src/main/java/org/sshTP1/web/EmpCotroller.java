package org.sshTP1.web;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import org.sshTP1.pojo.Emp;
import org.sshTP1.service.EmpService;

/**
 * @author Administrator emp控制器
 */
@Controller
public class EmpCotroller {

	@Resource
	private EmpService es;

	/**
	 * oliver 2018年3月1日 sshTP1 查询所有
	 */
	@RequestMapping("/list")
	public String fn1(ModelMap model) {	
		String hql=" from Emp";
		List<Emp> el = es.findAll(hql);
		model.put("el", el);
		return "empList";
	}
	
	@RequestMapping("/del")
	public String fn2(Emp emp) {	
		es.delete(emp);
		return "empList";
	}
}

package org.sshTP1.dao;

import java.util.List;

public interface BaseDao<T> {
	
	// 查询所有
	List<T> selectAll(String hql);

	// 增加
	void add(T t);

	// 删除
	void delete(T t);

	// 修改
	void update(T t);

	// 条件查询
	List<T> selectBySql(String sql, T t);

}

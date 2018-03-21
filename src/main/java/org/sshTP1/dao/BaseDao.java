package org.sshTP1.dao;

import java.util.List;

public interface BaseDao<T> {
	
	// ��ѯ����
	List<T> selectAll(String hql);

	// ����
	void add(T t);

	// ɾ��
	void delete(T t);

	// �޸�
	void update(T t);

	// ������ѯ
	List<T> selectBySql(String sql, T t);

}

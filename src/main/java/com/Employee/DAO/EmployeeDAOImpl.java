package com.Employee.DAO;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.Employee.Entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	SessionFactory sessionfactory;

	@Override
	public void saveEmployee(Employee employee) {
		Session session = sessionfactory.getCurrentSession();
		session.save(employee);
	}

	@Override
	public List<Employee> listEmployee() {
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery("from Employee", Employee.class);
		return query.getResultList();
	}

	@Override
	public void deleteEmployee(int empid) {
		Session session = sessionfactory.getCurrentSession();
		Query query = session.createQuery("delete from Employee where empid=:employeeid");
		query.setParameter("employeeid",empid);
		query.executeUpdate();
	}

}

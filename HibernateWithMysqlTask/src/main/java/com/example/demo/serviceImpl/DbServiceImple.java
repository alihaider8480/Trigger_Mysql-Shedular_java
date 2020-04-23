package com.example.demo.serviceImpl;

import java.sql.SQLException;
import java.util.Timer;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.sql.DataSource;
import javax.transaction.Transactional;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.LoginPojo;
import com.example.demo.repository.DbRepository;
import com.example.demo.service.DbService;

@Service
public class DbServiceImple implements DbService
{
	@Autowired
	public DbRepository db;
	
	@Autowired
	public DataSource dataSource;
	
	@Autowired
	public DbTimer dbtimer_obj;
	
	//@PersistenceUnit
	//EntityManager entityManager;
	
	//@Autowired
	//private SessionFactory session;
	
	@Override
	public void create_db() 
	{
		//db.createdb();
		System.out.println("aaa");
	}

	@Override   
	public void db_maker() 
	{
		//clent mediam
		//auto refirect
		
		
		
		
		
		/*
		 * String sql = "SELECT * FROM EMPLOYEE"; SQLQuery query =
		 * session.createSQLQuery(sql); query.addEntity(Employee.class); List results =
		 * query.list();
		 */
		
	//	Timer t = new Timer();
		//dbtimer_obj.run();
		//t.schedule(dbtimer_obj, 1000, 1000);
		
	//	db.exsistsdb();
		//System.out.println("aaaaa");
		
		
		
		/*
		 * //db.exsistsdb(); try { //CREATE TABLE FOO (id int primary key,nn
		 * varchar(255); // entityManager.find(LoginPojo.class, 63);
		 * 
		 * System.out.println(dataSource.getConnection().getMetaData().getURL());
		 * System.out.println(dataSource.getConnection().getMetaData().getUserName());
		 * System.out.println(dataSource.getConnection().getMetaData().
		 * getDatabaseProductName());
		 * System.out.println(dataSource.getConnection().getMetaData().getTableTypes());
		 * System.out.println(dataSource.getConnection().getMetaData().
		 * getMaxTablesInSelect());
		 * System.out.println(dataSource.getConnection().getMetaData().
		 * allTablesAreSelectable());
		 * System.out.println(dataSource.getConnection().getMetaData().
		 * supportsCatalogsInTableDefinitions());
		 * 
		 * 
		 * 
		 * 
		 * 
		 * } catch (SQLException e) { System.out.println("//////////////////////"+e);
		 * e.printStackTrace(); } System.out.println("sss");
		 */
	}
}
package com.example.demo.serviceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.TimerTask;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.LoginPojo;
import com.example.demo.repository.DbRepository;

@Service
public class DbTimer extends TimerTask
{
	@Autowired
	public DbRepository ddbb;
	
    LoginPojo login_obj =  new LoginPojo();

	@Override
	public void run() 
	{
		System.out.println("Starting...");
		try 
		{
			login_obj.setId(0);
			login_obj.setAddress("Demy Address");
			login_obj.setCity("Demo city");
			login_obj.setName("demy Name");
			login_obj.setContact("Demu Conact");
			
			if(ddbb.existsById(0))
			     ddbb.deleteById(0);
			else
				 ddbb.save(login_obj);
		
			LocalDateTime localTime = LocalDateTime.now();
	        System.out.println("Time : " + localTime.toString());
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Ending...");	
	}
}


/*
 * Query a= entityManager.createNativeQuery("select * from employees");
 * a.executeUpdate(); List f = a.getResultList(); System.out.println(f);
 */
/*
 * Connection conn = DriverManager.getConnection("com.mysql.jdbc.Driver");
 * String sql =
 * "INSERT INTO `employees` (`id`, `address`, `city`, `contact`, `name`) VALUES ('55', 'nazimabad', 'khi', '0222556525852', 'ali');"
 * ; PreparedStatement pstmt = conn.prepareStatement(sql);
 * pstmt.executeUpdate(); pstmt.close();
List<LoginPojo> li = entityManager.createQuery("SELECT p FROM LoginPojo p").getResultList();
	
			System.out.println(li);
			
			for(LoginPojo s:li)
			{
				System.out.println(s.getId()+" "+s.getAddress()+" "+s.getCity()+" "+s.getContact()+" "+s.getName());
			}
 */



//TypedQuery li2 = (TypedQuery) entityManager.createQuery("SELECT id,address,city,contact,name FROM employees");
//li2.executeUpdate();
//	Criteria criteria = sessionFactory.openSession().createCriteria(LoginPojo.class);
//criteria.addQueryHint("SELECT id,address,city,contact,name FROM employees");
//System.out.println(criteria.list());
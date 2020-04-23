package com.example.demo.repository;

import javax.persistence.Table;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.pojo.LoginPojo;

@Repository
public interface DbRepository extends JpaRepository<LoginPojo, Integer>
{		
//	@Query("INSERT INTO employees(id,address,city,contact,name) VALUES (:id, :address, :city, :contact, :name)")
	//public void sending_another_db(int id,String address,String city,String contact,String name);
}
















//  c


//@Query("create table anwer(id int primary key,name varchar(255);")
//public void createdb();

// @Query(value="show tables like '%LoginPojo%';", nativeQuery=true)
// public void exsistsdb();
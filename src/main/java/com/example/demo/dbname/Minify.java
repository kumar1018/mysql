package com.example.demo.dbname;

// create the mysql tables
// i.e is empdetails and cliendetails

// to create database in mysql is 

CREATE DATABASE dbname;
      CREATE DATABASE minify;
       use minify;
       
       // to create tables in mysql
       
       CREATE TABLE tablename;
       CREATE TABLE employeeDetails(
    		    ->     id String NOT NULL AUTO_INCREMENT,
    		    ->     name varchar(45) NOT NULL,
    		    ->     role varchar(35) NOT NULL,
    		    ->     age int NOT NULL,
    		    ->     PRIMARY KEY (id)
    		    );
       
       
    		   CREATE TABLE clientDetails(
    				    ->     id int NOT NULL AUTO_INCREMENT,
    				    ->     name varchar(45) NOT NULL,
    				    ->     companyname varchar(50)  NOT NULL,
    				    ->     PRIMARY KEY (id)
    				    -> );
    		   
    		   
    		   // To insert into employeedetails  values
    		   
    		   INSERT INTO employeedetails (id, name, role, age)
    		    -> VALUES (1, 'prashanth', 'Javadeveloper', 24);
    		    
   select * from 	employeedetails;
    	
    	+----+-----------+---------------+-----+
    	| id | name      | role          | age |
    	+----+-----------+---------------+-----+
    	|  1 | prashanth | Javadeveloper |  24 |
    	+----+-----------+---------------+-----+
    	
    	           // To insert into clientdetails  values
    	INSERT INTO clientdetails (id, name, companyname)
    -> VALUES (501, 'xyz', 'minfy');
    
    select * from clientdetails;
    
    +-----+------+-------------+
    | id  | name | companyname |
    +-----+------+-------------+
    | 501 | xyz  | minfy       |
    +-----+------+-------------+
    

    	
    	
    		   
       
  

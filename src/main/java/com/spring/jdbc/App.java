package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("My program started...");
        //Spring jdbc=>JdbcTemplate
        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        /*JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);
        //insert query
        String query="insert into student(id, name, city) values(?,?,?)";
        
        //fire the query
        int result = template.update(query, 457, "Nityanand", "Gorakhpur");*/

        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        /*Student student =new Student();
        student.setId(630);
        student.setName("Pankaj Kr Singh");
        student.setCity("Delhi");
        int result= studentDao.insert(student);
        System.out.println("student added: "+result);*/
        
        Student student =new Student();
        student.setId(630);
        student.setName("Rakesh Pandey");
        student.setCity("Lucknow");
        int result = studentDao.change(student);
        System.out.println("data changed: "+result);
    }
}

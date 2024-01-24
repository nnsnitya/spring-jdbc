package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

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
        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

        //insert query
        String query="insert into student(id, name, city) values(?,?,?)";
        
        //fire the query
        int result = template.update(query, 457, "Nityanand", "Gorakhpur");
        System.out.println("number of record inserted.."+result);
    }
}

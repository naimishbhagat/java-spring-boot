package com.naimish.SpringJDBCEx;

import com.naimish.SpringJDBCEx.model.Student;
import com.naimish.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringJdbcExApplication.class, args);

		Student s = context.getBean(Student.class);
		s.setMarks(78);
		s.setName("Naimish");
		s.setRollno(1);
		StudentService service  = context.getBean(StudentService.class);
		service.addStudent(s);
		//System.out.println(s);
		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}

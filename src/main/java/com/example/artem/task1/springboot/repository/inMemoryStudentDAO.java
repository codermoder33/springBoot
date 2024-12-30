package com.example.artem.task1.springboot.repository;

import com.example.artem.task1.springboot.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class inMemoryStudentDAO {
  private List<Student> base = new ArrayList<>();

    public List<Student> findAllStudents() {
        return List.of(
                new Student("Oleg", "fsdf@mail.ru",23),
                new Student("Anna", "fsdsdff@mail.ru", 44),
                new Student("Holg", "fsdgfdgd@mail.ru", 13)
        );
    }
    public Student saveStudent(Student s) {
        base.add(s);
        return s;
    }
    public Student findByEmail(String email) {
        return base.stream().filter(a->a.getEmail().equals(email)).findFirst().orElse(null);
    }
    public Student updateStudent(Student student) {
        int g= IntStream.range(0,base.size()).filter(a->base.get(a).getEmail().equals(student.getEmail())).findFirst().orElse(-1);
        if(g==-1) return null;
        base.set(g,student);
        return student;
    }
    public void deleteStudent(String email) {
        var s = findByEmail(email);
        if(s!=null) base.remove(s);
    }

}

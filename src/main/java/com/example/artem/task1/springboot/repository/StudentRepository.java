package com.example.artem.task1.springboot.repository;

import com.example.artem.task1.springboot.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

@Repository
public class StudentRepository {
  private List<Student> base = new ArrayList<>();
  private int lastID =1;

    public List<Student> getStudents() {
        return List.of(
                new Student(lastID++,"Oleg", "fsdf@mail.ru"),
                new Student(lastID++,"Anna", "fsdsdff@mail.ru"),
                new Student(lastID++,"Holg", "fsdgfdgd@mail.ru")
        );
    }
    public Student saveStudent(Student s) {
        s.setId(lastID++);
        base.add(s);
        return s;
    }
    public Optional<Student> findById(int id) {
        return base.stream()
                 .filter(a->a.getId()==id)
                 .findFirst();
    }
    public Optional<Student> updateStudent(Student student) {
        int i = base.indexOf(student);        // реализован метод hashcode-equals по id
        if(i>-1) base.set(i,student);
        return Optional.ofNullable(i>-1?student:null);
    }
    public boolean deleteStudent(int id) {
        Optional<Student> o = findById(id);
        return base.removeIf(s->o.isPresent()&&s.equals(o.get()));
    }

}

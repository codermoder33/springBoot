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
  int COUNTER=1;

    public List<Student> getStudents() {
        return List.of(
                new Student(COUNTER++,"Oleg", "fsdf@mail.ru"),
                new Student(COUNTER++,"Anna", "fsdsdff@mail.ru"),
                new Student(COUNTER++,"Holg", "fsdgfdgd@mail.ru")
        );
    }
    public Student saveStudent(Student s) {
        s.setId(COUNTER++);
        base.add(s);
        return s;
    }
    public Optional<Student> findById(int id) {
         Optional<Student> op = base.stream().filter(a->a.getId()==id).findFirst();
         return op;
    }
    public Optional<Student> updateStudent(Student student) {
        int g = IntStream.range(0,base.size()).filter(a->base.get(a).equals(student)).findFirst().orElse(-1);
        if(g==-1) return Optional.ofNullable(null);
        base.set(g,student);
        return Optional.of(student);
    }
    public boolean deleteStudent(int id) {
        var s = findById(id);
        return base.remove(s);
    }

}

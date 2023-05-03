package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Student;


public class Studentdao {
EntityManagerFactory  f= Persistence.createEntityManagerFactory("dev");
EntityManager e=f.createEntityManager();
EntityTransaction t=e.getTransaction();

public void save(Student s){
t.begin();
e.persist(s);  
t.commit();
}

public List<Student> fetchAll(){
return e.createQuery("select x from Student x").getResultList();
}

public Student find(int id) {
return e.find(Student.class, id);

}

public void update(Student s) {
	t.begin();
	e.merge(s);
	t.commit();
	
}

public void delete(int id) {
	t.begin();
	e.remove(e.find(Student.class, id));
	t.commit();
}
}

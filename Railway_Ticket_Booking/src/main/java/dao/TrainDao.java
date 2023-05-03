package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Train;

public class TrainDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();

	public void save(Train train) {
		transaction.begin();
		manager.persist(train);
		transaction.commit();
	}

	public List<Train> fecthAll() {
		// TODO Auto-generated method stub
		return manager.createQuery("select x from Train x").getResultList();
	}

}
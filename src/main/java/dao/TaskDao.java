package dao;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Task;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class TaskDao {
	
	@PersistenceContext
	private EntityManager em;

	public Task get(Long id) {
		return em.find(Task.class, id);
	}

	@SuppressWarnings("unchecked")
	public Collection<Task> list() {
		Query query = em.createQuery("select from Task order by title");
		List resultList = query.getResultList();
		return resultList;
	}

	@Transactional
	public void save(Task entita) {
		em.persist(entita);
	}

	public void evict(Task entita) {
		if (em.contains(entita))
			// EntityManager lacks of evict(), clear() is far from ideal :(
			em.clear();
	}

}

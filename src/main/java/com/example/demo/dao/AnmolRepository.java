package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Anmol;

// extend JpaRepository for more features;
// otherwise extend CrudRepository
public interface AnmolRepository extends JpaRepository<Anmol, Integer> {

	List<Anmol> findByLname(String lname);
	
	List<Anmol> findByIdGreaterThan(Integer id);
	
	// pass 2 or more paramaters also
	@Query("from Anmol where lname = ?1 order by id")
	List<Anmol> findByLnameSortedId(String lname);
}

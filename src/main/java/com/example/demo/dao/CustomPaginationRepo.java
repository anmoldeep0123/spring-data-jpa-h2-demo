package com.example.demo.dao;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.model.NameModel;

// extend PagingAndSortingRepository for pagination features;
// otherwise extend CrudRepository
public interface CustomPaginationRepo extends PagingAndSortingRepository<NameModel, Integer> {

	Slice<NameModel> findAllByFname(String fname, Pageable pageable);

}

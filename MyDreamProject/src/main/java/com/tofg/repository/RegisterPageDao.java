package com.tofg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tofg.model.RegisterModelPage;
import java.util.List;
import java.lang.Long;

public interface RegisterPageDao extends JpaRepository<RegisterModelPage, Long>{

	List<RegisterModelPage> findByMobilenumber(Long mobilenumber);
}

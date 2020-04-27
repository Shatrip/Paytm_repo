package com.tofg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tofg.model.loginModelPage;
import java.lang.Long;
import java.util.List;

public interface LoginPageDao extends JpaRepository<loginModelPage, Long>{
	
List<loginModelPage> findByMobilenumber(Long mobilenumber);
}

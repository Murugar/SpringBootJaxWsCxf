package com.iqmsoft.spring.jaxws.cxf;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UsersRepository extends JpaRepository<User, Long> {
	
}

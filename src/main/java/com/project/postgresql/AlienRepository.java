package com.project.postgresql;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienRepository extends JpaRepository<Information, Integer> {
    
}

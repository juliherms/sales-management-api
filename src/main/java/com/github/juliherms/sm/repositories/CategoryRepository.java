package com.github.juliherms.sm.repositories;

import com.github.juliherms.sm.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * This class responsible to provide access to Category Model
 */
@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}

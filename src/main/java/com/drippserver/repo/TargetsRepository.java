package com.drippserver.repo;

import com.drippserver.entity.Target;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TargetsRepository extends CrudRepository<Target,Long> {
}

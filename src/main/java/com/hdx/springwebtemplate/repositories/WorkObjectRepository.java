package com.hdx.springwebtemplate.repositories;

import com.hdx.springwebtemplate.models.WorkObject;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by michael.hadox on 5/17/17.
 */
public interface WorkObjectRepository extends CrudRepository<WorkObject, Long>{

    List<WorkObject> findByUser(String user);
}

package com.example.spingboot.reponsitory;

import com.example.spingboot.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductReponsitory extends CrudRepository <ProductEntity, Long>{
}

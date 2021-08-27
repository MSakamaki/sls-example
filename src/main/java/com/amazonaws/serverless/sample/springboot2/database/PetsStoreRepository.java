package com.amazonaws.serverless.sample.springboot2.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Document Sharing Repository.
 */
@Repository
public interface PetsStoreRepository extends JpaRepository<PetsStoreEntity, String> {

  PetsStoreEntity findByPetId(String petId);

}

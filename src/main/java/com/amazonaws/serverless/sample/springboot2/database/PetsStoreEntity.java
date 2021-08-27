package com.amazonaws.serverless.sample.springboot2.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pets_store")
@Data
@NoArgsConstructor
public class PetsStoreEntity {

  @Column(name = "pet_id")
  Integer petId;

  @Column(name = "name")
  String name;

  @Column(name = "breeds")
  String breeds;

  @Column(name = "date_of_birth")
  String dateOfBirth;
}

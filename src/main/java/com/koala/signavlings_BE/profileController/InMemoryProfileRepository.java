package com.koala.signavlings_BE.profileController;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface InMemoryProfileRepository extends CrudRepository<Profile, Long> {

}

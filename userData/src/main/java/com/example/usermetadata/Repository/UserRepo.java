package com.example.usermetadata.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.usermetadata.Entity.UserMetaData;

import java.util.UUID;

@Repository
public interface UserRepo extends CrudRepository<UserMetaData, Long>{

	UserMetaData save(UserMetaData userdata);
	UserMetaData findAllByuniqueId(String uniqueId);

	UserMetaData findAllByuserId(UUID userId);

}

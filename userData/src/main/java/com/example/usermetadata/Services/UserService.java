package com.example.usermetadata.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Repository.UserRepo;
import com.example.usermetadata.Repository.UsersRepo;

import java.util.UUID;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;

	public UserMetaData saveUserMetaDataTODB(UserMetaData metaData) {
		metaData.setUserId(UUID.randomUUID());
		return userRepo.save(metaData);
		//return new UserMetaData();
	}

	public UserMetaData getsUserDetailsFromDB(String uniqueId) {
		return userRepo.findAllByuniqueId(uniqueId);
		//return new UserMetaData();
	}

	public UserMetaData getUserDetailForUserId(UUID userId) {
		return userRepo.findAllByuserId(userId);
		//return new UserMetaData();
	}
}

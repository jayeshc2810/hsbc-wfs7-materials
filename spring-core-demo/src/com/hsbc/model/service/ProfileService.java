package com.hsbc.model.service;

import java.util.List;

import com.hsbc.model.beans.Profile;

public interface ProfileService {
	public int createProfile(Profile profile);
	public List<Profile> getProfilesSortedByName();
	public List<Profile> getProfilesSortedById();
	public List<Profile> getAllProfiles();
	public void deleteProfile(int id);
	public Profile getProfile(int id);
	
}

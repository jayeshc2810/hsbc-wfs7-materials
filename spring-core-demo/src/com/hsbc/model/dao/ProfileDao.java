package com.hsbc.model.dao;

import java.util.List;

import com.hsbc.model.beans.Profile;

public interface ProfileDao {
	public int createProfile(Profile profile);
	public List<Profile> getProfiles(); // ResultSet -> Profile -> Add to List<Profile>
	public Profile getProfile(int id); 
	public void deleteProfile(int id);
}

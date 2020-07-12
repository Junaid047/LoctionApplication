package com.Webservice.practiceWebservice.service;

import java.util.List;
import com.Webservice.practiceWebservice.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location getLocation(int id);
	List<Location> getAllLocations();
}

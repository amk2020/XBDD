package io.github.orionhealth.xbdd.model.common;

import java.util.HashMap;

public class Stats {
	String id;
	CoordinatesDto coordinates;
	HashMap<String, Integer> summary;

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

	public CoordinatesDto getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(final CoordinatesDto coordinates) {
		this.coordinates = coordinates;
	}

	public HashMap<String, Integer> getSummary() {
		return summary;
	}

	public void setSummary(final HashMap<String, Integer> summary) {
		this.summary = summary;
	}
}

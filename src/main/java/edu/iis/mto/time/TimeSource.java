package edu.iis.mto.time;

import org.joda.time.DateTime;

public interface TimeSource {

	public DateTime now();

}

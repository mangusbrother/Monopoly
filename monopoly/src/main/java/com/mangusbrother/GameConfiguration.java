package com.mangusbrother;

@Component
public class GameConfiguration {
	/**
	 * @return The name of the property file to use when selecting between monopoly versions
	 * Currently set to static value
	 */
	public String getChosenPropertyFile() {
		return "default";
	}
}

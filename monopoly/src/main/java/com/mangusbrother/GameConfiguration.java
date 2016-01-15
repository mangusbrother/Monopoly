package com.mangusbrother;

import org.springframework.stereotype.Component;

@Component
class GameConfiguration {
	/**
	 * @return The name of the property file to use when selecting between monopoly versions
	 * Currently set to static value
	 */
	public String getChosenPropertyFile() {
		return "default";
	}
}

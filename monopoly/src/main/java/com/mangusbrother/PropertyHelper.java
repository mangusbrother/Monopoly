package com.mangusbrother;

//@Component
public class PropertyHelper {

	private static PropertyHelper INSTANCE = new PropertyHelper();
	//	@Autowired
	private GameConfiguration gameConfiguration;

	private PropertyHelper() {
	}
	
	public static PropertyHelper getInstance() { return INSTANCE; }
	
	public String resolveValue(final String valueName) {
		return null;
	}
}
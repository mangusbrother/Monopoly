package com.mangusbrother;

//@Component
public class PropertyHelper {
	
//	@Autowired 
	private GameConfiguration gameConfiguration;
	
	private static PropertyHelper INSTANCE = new PropertyHelper();
	
	private PropertyHelper() { };
	
	public static PropertyHelper getInstance() { return INSTANCE; }
	
	public String resolveValue(final String valueName) {
		return null;
	}
}
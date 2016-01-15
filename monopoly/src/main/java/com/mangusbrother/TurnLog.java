package com.mangusbrother;

import java.util.HashMap;
import java.util.Map;

@Component
public class TurnLog {

	private static TurnLog INSTANCE = new TurnLog();
	
	private TurnLog() { }
	
	public static TurnLog getInstance() { return INSTANCE; }
	
	private Map<Integer, StringBuilder> turnLog = new HashMap<>();
	
	public void addLog(final int turnCount, final String log) {
		final StringBuilder stringBuilder = turnLog.get(new Integer(turnCount));
		if (stringBuilder == null) {
			stringBuilder = new StringBuilder();
			turnLog.put(new Integer(turnCount), stringBuilder);
		}
		stringBuilder.append(log+"\n");
	}
	
	public String getTurnLog(final int turnCount) {
		final StringBuilder stringBuilder = turnLog.get(new Integer(turnCount));
		return stringBuilder == null ? "" : stringBuilder.toString();
	}
}

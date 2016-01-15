package com.mangusbrother;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class TurnLog {

	private static final TurnLog INSTANCE = new TurnLog();
	private final Map<Integer, StringBuilder> turnLog = new HashMap<>();
	
	private TurnLog() { }
	
	public static TurnLog getInstance() { return INSTANCE; }
	
	public void addLog(final int turnCount, final String log) {
		StringBuilder stringBuilder = turnLog.get(turnCount);
		if (stringBuilder == null) {
			stringBuilder = new StringBuilder();
			turnLog.put(turnCount, stringBuilder);
		}
		stringBuilder.append(log).append("\n");
	}
	
	public String getTurnLog(final int turnCount) {
		final StringBuilder stringBuilder = turnLog.get(turnCount);
		return stringBuilder == null ? "" : stringBuilder.toString();
	}
}

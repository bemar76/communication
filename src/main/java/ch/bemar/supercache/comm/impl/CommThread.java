package ch.bemar.supercache.comm.impl;

import java.util.Map;

import com.google.common.collect.Maps;

public class CommThread extends Thread {

	private final Map<String, Object> threadAttributes;

	public CommThread(Runnable target, String name) {
		super(target, name);
		threadAttributes = Maps.newConcurrentMap();
	}

	public CommThread(Runnable target) {
		super(target);
		threadAttributes = Maps.newConcurrentMap();
	}

	public CommThread(String name) {
		super(name);
		threadAttributes = Maps.newConcurrentMap();
	}

	public CommThread(ThreadGroup group, Runnable target, String name, long stackSize, boolean inheritThreadLocals) {
		super(group, target, name, stackSize, inheritThreadLocals);
		threadAttributes = Maps.newConcurrentMap();
	}

	public CommThread(ThreadGroup group, Runnable target, String name, long stackSize) {
		super(group, target, name, stackSize);
		threadAttributes = Maps.newConcurrentMap();
	}

	public CommThread(ThreadGroup group, Runnable target, String name) {
		super(group, target, name);
		threadAttributes = Maps.newConcurrentMap();
	}

	public CommThread(ThreadGroup group, Runnable target) {
		super(group, target);
		threadAttributes = Maps.newConcurrentMap();
	}

	public CommThread(ThreadGroup group, String name) {
		super(group, name);
		threadAttributes = Maps.newConcurrentMap();
	}

	public void addAttribute(String key, Object value) {
		this.threadAttributes.put(key, value);
	}

	public Object getAttribute(String key) {
		return this.threadAttributes.get(key);
	}

	public boolean containsKey(String key) {
		return this.threadAttributes.containsKey(key);
	}

}

package ch.bemar.supercache.comm.impl;

import java.util.concurrent.ThreadFactory;

public class CommThreadFactory implements ThreadFactory {

	private int counter = 0;

	@Override
	public Thread newThread(Runnable r) {
		return new CommThread(r, "CacheServer" + increaseCounter());
	}

	public synchronized int increaseCounter() {

		try {
			return counter;
		} finally {
			counter++;
		}
	}

}

package ch.bemar.supercache.comm;

import java.io.Serializable;

public interface IRemoteReceiverChannel<K extends Serializable, V extends Serializable> {

	public void put(K key, V value);
	
	public void remove(K key);

}

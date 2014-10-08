
package com.woorea.openstack.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Krishna
 * @author Mona
 */
public class Backup implements Iterable<Volume>, Serializable{
    
    @JsonProperty("Backup")
	private List<Volume> list;

	/**
	 * @return the list
	 */
	public List<Volume> getList() {
		return list;
	}
	
        @Override
	public Iterator<Volume> iterator() {
		return list.iterator();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Backup [list=" + list + "]";
	}
}

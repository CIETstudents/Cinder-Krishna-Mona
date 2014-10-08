
package com.woorea.openstack.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Krishna
 * @author Mona.
 */
public class QosSpecs implements Iterable<QosSpec>, Serializable {
    
    @JsonProperty("QosSpecs")
	private List<QosSpec> list;

	/**
	 * @return the list
	 */
	public List<QosSpec> getList() {
		return list;
	}
	
	@Override
	public Iterator<QosSpec> iterator() {
		return list.iterator();
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QosSpec [list=" + list + "]";
	}

    
}

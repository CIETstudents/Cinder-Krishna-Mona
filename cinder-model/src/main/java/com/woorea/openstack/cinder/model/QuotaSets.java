
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
public class QuotaSets implements Iterable<QuotaSet>, Serializable {
        
        @JsonProperty("QuotaSets")
	private List<QuotaSet> list;

	/**
	 * @return the list
	 */
	public List<QuotaSet> getList() {
		return list;
	}
	
	@Override
	public Iterator<QuotaSet> iterator() {
		return list.iterator();
	}
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "QuotaSets [list=" + list + "]";
	}

    
}

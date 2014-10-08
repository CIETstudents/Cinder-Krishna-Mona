
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
public class Volumes implements Iterable<Volume>, Serializable{
    
    @JsonProperty("Volumes")
	private List<Volume> list;

	
	public List<Volume> getId() {
            return list;
	}
        
	public List<Volume> getName() {
            return list;
	}
        
	@Override
	public Iterator<Volume> iterator() {
		return list.iterator();
	}
	
}

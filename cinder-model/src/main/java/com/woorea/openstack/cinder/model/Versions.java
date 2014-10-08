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
public class Versions implements Iterable<Version>, Serializable {
    
        @JsonProperty("Versions")
	private List<Version> list;

	
	public List<Version> getId() {
            return list;
	}
        
	public List<Version> getName() {
            return list;
	}
        
        public List<Version> getStatus() {
            return list;
	}
        
        public List<Version> getAttachments() {
            return list;
	}
    
        @Override
	public Iterator<Version> iterator() {
		return list.iterator();
	}
}

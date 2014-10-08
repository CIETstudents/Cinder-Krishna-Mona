
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
public class QosAssociations implements Iterable<QosSpec>, Serializable{
    
    @JsonProperty("QosAssociations")
	private List<QosSpec> list;

	
	public List<QosSpec> getId() {
            return list;
	}
	
        public List<QosSpec> getName() {
            return list;
	}
        
	@Override
	public Iterator<QosSpec> iterator() {
		return list.iterator();
	}

    
    
}

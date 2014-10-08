
package com.woorea.openstack.cinder.model;

import java.util.Map;

/**
 *
 * @author Krishna
 * @author Mona
 */
public class Metadata {
    	private Map<String, String> metadata;

	/**
	 * @return the meta data
	 */
	public Map<String, String> getMetadata() {
		return metadata;
	}

	/**
	 * Set the meta data
	 * @param metadata
	 */
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}
	

}

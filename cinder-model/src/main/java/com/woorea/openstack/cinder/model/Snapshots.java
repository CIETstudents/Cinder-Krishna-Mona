package com.woorea.openstack.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Krishna
 * @author Mona.
 */
public class Snapshots implements Iterable<Snapshot>, Serializable {

  @JsonProperty("SnapshotManage")
        private List<Snapshot> list;
  
        private Map<String, String> metadata;

	
	public List<Snapshot> getId() {
            return list;
	}
        
	public List<Snapshot> getName() {
            return list;
	}
        
        public List<Snapshot> getStatus() {
            return list;
	}
        
        public List<Snapshot> getDescription() {
            return list;
	}
     
        public Map<String, String> getMetadata() {
		return metadata;
	}


        public List<Snapshot> getCreated_at() {
            return list;
	}
        
               
        public List<Snapshot> getVolume_id() {
            return list;
	}
        
        
        public List<Snapshot> getSize() {
            return list;
	}
          
	@Override
	public Iterator<Snapshot> iterator() {
		return list.iterator();
	}

}

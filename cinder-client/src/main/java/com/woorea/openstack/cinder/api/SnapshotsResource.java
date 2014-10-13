package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.Entity;
import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.cinder.model.Snapshot;
import com.woorea.openstack.cinder.model.Snapshots;
import com.woorea.openstack.cinder.model.Metadata;

/**
 * This class consists of the all the resources for snapshots.
 * @author Krishna
 * @author Mona.
 */
public class SnapshotsResource {

    /**
     * An instance CLIENT is created for the OpenStackClient API.
     */
    private final OpenStackClient CLIENT;
    
    /**
     * The created method is used to access the SnapshotResource class.
     * @param client gives the client request.
     */
    public SnapshotsResource(OpenStackClient client) {
        CLIENT = client;
    }

    /**
     * This method is to return list of detail.
     * @param detail includes snapshot details.
     * @return detail.
     */
    public List list(boolean detail) {
        return new List(detail);
    }
    
    /**
     * This method is to create snapshot.
     * @param snapshot time copy of data. 
     * @return snapshot.
     */
    public Create create(Snapshot snapshot) {
        return new Create(snapshot);
    }

    /**
     * This method is to show String identifier 
     * @param id uniquely identifies string.
     * @return identifier.
     */
    public Show show(String id) {
        return new Show(id);
    }

    /**
     * This method to update newly added string in the method.
     * @param id as updated identifier.
     * @return identifier.
     */
    public Update update(String id) {
        return new Update(id);
    }

    /**
     * Show key and value pairs in meta data. 
     * @param id as String. 
     * @return identifier.
     */
    public ShowMetadata showMetadata(String id) {
        return new ShowMetadata(id);
    }

    /**
     * Update key and value pairs in meta data.
     * @param id as String identifier.
     * @return updated id.
     */
    public UpdateMetadata updateMetadata(String id) {
        return new UpdateMetadata(id);
    }

    /**
     * This method is to delete identifier. 
     * @param id in String.
     * @return identifier.
     */
    public Delete delete(String id) {
        return new Delete(id);
    }
    
    /**
     * This class extends the attributes in the snapshot.
     */
    public class List extends OpenStackRequest<Snapshots> {

        public List(boolean detail) {
            super(CLIENT, HttpMethod.GET, detail ? "/os-snapshots/detail"
                    : "/os-snapshots", null, Snapshots.class);
        }
    }

    /**
     * Create a snapshot with aid of predefined snapshot model. 
     */
      public class Create extends OpenStackRequest<Snapshot> {
                /**
                 * declare a private variable as snapshot.
                 */
		private Snapshot snapshot;
		
                /**
                 * create a method for snapshot.
                 * @param snapshot as snapshot client.
                 */
		public Create(Snapshot snapshot) {
			super(CLIENT, HttpMethod.POST, "/snapshots", Entity.json(snapshot), Snapshot.class);
			this.snapshot = snapshot;
		}
		
	}

      /**
       * This class is to show the attributes of the snapshot class.
       */
        public class Show extends OpenStackRequest<Snapshot> {
            
            /**
             * This method to show the attributes included in the snapshot. 
             * @param id as client snapshot.
             */
            public Show(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-Snapshots/")
                    .append(id).toString(), null, Snapshot.class);
        }
    }

    /**
     * The class ShowMetadata extends the Meta data from the snapshot Model.
     */
    public class ShowMetadata extends OpenStackRequest<Metadata> {
        
        /**
         * This method is show key and value pairs
         * @param id as meta data 
         */
        public ShowMetadata(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-snapshots/")
                    .append(id).append("/metadata").toString(),
                    null, Metadata.class);
        }
    }

    /**
     * This class update the newly added methods or attributes in snapshot.
     */
    public class Update extends OpenStackRequest<Snapshot> {

        /**
         * Update the method snapshot
         * @param id as updates client snapshot values.
         */
        public Update(String id) {
            super(CLIENT, HttpMethod.PUT, new StringBuilder("/os-snapshots/")
                    .append(id).toString(), null, Snapshot.class);
        }
    }    
        
    /**
     * This class extends key and value pairs of the meta data.
     */
    public class UpdateMetadata extends OpenStackRequest<Metadata> {

        /**
         * this method update the key and value pairs.
         * @param id passed as parameter.
         */
        public UpdateMetadata(String id) {
            super(CLIENT, HttpMethod.PUT, new StringBuilder("/os-spanshots/")
                    .append(id).toString(), null, Metadata.class);
        }
    }    
    
    /**
     * The class Delete extend the OpenStackRequest class.
     */
    public class Delete extends OpenStackRequest<Void> {

        /**
         * Deletes the identifier.
         * @param id the id to set
         */
        public Delete(String id) {
            super(CLIENT, HttpMethod.DELETE, new StringBuilder("/os-snapshots/")
                    .append(id).toString(), null, Void.class);
        }
    }
}


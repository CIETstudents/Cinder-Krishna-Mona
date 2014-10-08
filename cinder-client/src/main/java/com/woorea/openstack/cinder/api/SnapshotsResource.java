package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.Entity;
import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.cinder.model.Snapshot;
import com.woorea.openstack.cinder.model.Snapshots;
import com.woorea.openstack.cinder.model.Metadata;

/**
 * @author govindon.

 The class SnapshotsResource.
 */
public class SnapshotsResource {

    /**
     * Instance is created for the OpenStackClient.
     */
    private final OpenStackClient CLIENT;

    /**
     * The created instance is used to access the SnapshotsExtensions class.
     *
     * @param client the client to set
     */
    public SnapshotsResource(OpenStackClient client) {
        CLIENT = client;
    }

    /**
     * Ths instance is created for the List class.
     *
     * @param detail the detail to set
     * @return the List
     */
    public List list(boolean detail) {
        return new List(detail);
    }

    /**
     * The instance is created for the Create class.
     *
     * @param snapshotForCreate the snapshotForCreate to set
     * @return the Create
     */
    public Create create(Snapshot snapshot) {
        return new Create(snapshot);
    }

    /**
     * The instance is created for the Show class.
     *
     * @param id the id to set
     * @return the id
     */
    public Show show(String id) {
        return new Show(id);
    }

    public Update update(String id) {
        return new Update(id);
    }

    /**
     * The instance is created for the ShowMetadata class.
     *
     * @param id the id to set
     * @return the id
     */
    public ShowMetadata showMetadata(String id) {
        return new ShowMetadata(id);
    }

    public UpdateMetadata updateMetadata(String id) {
        return new UpdateMetadata(id);
    }

    /**
     * The instance is created for the Delete class.
     *
     * @param id the id to set
     * @return the id
     */
    public Delete delete(String id) {
        return new Delete(id);
    }

    /**
     * The class List extends the Snapshots class from the Nova Model.
     */
    public class List extends OpenStackRequest<Snapshots> {

        /**
         * Get the detail.
         *
         * @param detail the detail to set
         */
        public List(boolean detail) {
            super(CLIENT, HttpMethod.GET, detail ? "/os-snapshots/detail"
                    : "/os-snapshots", null, Snapshots.class);
        }
    }

      public class Create extends OpenStackRequest<Snapshot> {

		private Snapshot snapshot;
		
		public Create(Snapshot snapshot) {
			super(CLIENT, HttpMethod.POST, "/snapshots", Entity.json(snapshot), Snapshot.class);
			this.snapshot = snapshot;
		}
		
	}

        public class Show extends OpenStackRequest<Snapshot> {

        /**
         * Method Show is used to show the id value of the Client, it is
         * Constructor and depends on the Base Class.
         *
         * @param id the id to set
         */
        public Show(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-Snapshots/")
                    .append(id).toString(), null, Snapshot.class);
        }
    }


    /**
     * The class ShowMetadata extends the Metadata from the Nova Model.
     */
    public class ShowMetadata extends OpenStackRequest<Metadata> {

        /**
         * Get the identifier and displays the id.
         *
         * @param id the id to set
         */
        public ShowMetadata(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-snapshots/")
                    .append(id).append("/metadata").toString(),
                    null, Metadata.class);
        }
    }

      public class Update extends OpenStackRequest<Snapshot> {

        public Update(String id) {
            super(CLIENT, HttpMethod.PUT, new StringBuilder("/os-snapshots/")
                    .append(id).toString(), null, Snapshot.class);
        }
    }    
        
        
          public class UpdateMetadata extends OpenStackRequest<Snapshot> {

        public UpdateMetadata(String id) {
            super(CLIENT, HttpMethod.PUT, new StringBuilder("/os-spanshots/")
                    .append(id).toString(), null, Snapshot.class);
        }
    }    
    /**
     * The class Delete extend the OpenStackRequest class.
     */
    public class Delete extends OpenStackRequest<Void> {

        /**
         * Deletes the id.
         *
         * @param id the id to set
         */
        public Delete(String id) {
            super(CLIENT, HttpMethod.DELETE, new StringBuilder("/os-snapshots/")
                    .append(id).toString(), null, Void.class);
        }
    }
}


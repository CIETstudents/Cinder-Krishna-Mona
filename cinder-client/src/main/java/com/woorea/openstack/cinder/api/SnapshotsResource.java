package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.Entity;
import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.cinder.model.Snapshot;
import com.woorea.openstack.cinder.model.Snapshots;
import com.woorea.openstack.cinder.model.Metadata;

public class SnapshotsResource {

    private final OpenStackClient CLIENT;

    public SnapshotsResource(OpenStackClient client) {
        CLIENT = client;
    }

    public List list(boolean detail) {
        return new List(detail);
    }
    public Create create(Snapshot snapshot) {
        return new Create(snapshot);
    }

    public Show show(String id) {
        return new Show(id);
    }

    public Update update(String id) {
        return new Update(id);
    }

    public ShowMetadata showMetadata(String id) {
        return new ShowMetadata(id);
    }

    public UpdateMetadata updateMetadata(String id) {
        return new UpdateMetadata(id);
    }

    public Delete delete(String id) {
        return new Delete(id);
    }

    public class List extends OpenStackRequest<Snapshots> {

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

        public Show(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-Snapshots/")
                    .append(id).toString(), null, Snapshot.class);
        }
    }


    /**
     * The class ShowMetadata extends the Metadata from the Nova Model.
     */
    public class ShowMetadata extends OpenStackRequest<Metadata> {

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
        
        
          public class UpdateMetadata extends OpenStackRequest<Metadata> {

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


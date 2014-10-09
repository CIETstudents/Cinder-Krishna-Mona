package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.Entity;
import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.cinder.model.Volume;
import com.woorea.openstack.cinder.model.Volumes;
import com.woorea.openstack.cinder.model.VolumeTypes;
import com.woorea.openstack.cinder.model.VolumeManage;

public class VolumesResource {

    private final OpenStackClient CLIENT;

    public VolumesResource(OpenStackClient client) {
        CLIENT = client;
    }

    public List list(boolean detail) {
        return new List(detail);
    }

    public Create create(Volume volume) {
        return new Create(volume);
    }

    public Show show(String id) {
        return new Show(id);
    }

//    /**
//     * Method showMetadata for VolumesResource Class and pass the id value.
//     *
//     * @param id gives id of Client.
//     * @return MetaData as new id value.
//     */
//    public ShowMetadata showMetadata(String id) {
//        return new ShowMetadata(id);
//    }

    public Update update(String id) {
        return new Update(id);
    }
    
    public Manage manage(String id) {
        return new Manage(id);
    }
    
    public Types types(Sting id) {
        return new Types(id);
    }

    public Delete delete(String id) {
        return new Delete(id);
    }

    public class List extends OpenStackRequest<Volumes> {

        public List(boolean detail) {
            super(CLIENT, HttpMethod.GET, detail ? "/os-volumes/detail"
                    : "/os-volumes", null, Volumes.class);
        }
    }

    public class Create extends OpenStackRequest<Volume> {

		private Volume volume;
		
		public Create(Volume volume) {
			super(CLIENT, HttpMethod.POST, "/volumes", Entity.json(volume), Volume.class);
			this.volume = volume;
		}
		
	}

    public class Show extends OpenStackRequest<Volume> {

        public Show(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, Volume.class);
        }
    }

//    /**
//     * Class ShowMetadata inherits the OpenStackRequest given by the Client and
//     * has the Metadata information.
//     */
//    public class ShowMetadata extends OpenStackRequest<Metadata> {
//
//        /**
//         * Constructor method of ShowMetadata and depends on the Base Class.
//         *
//         * @param id gives the Client Id.
//         */
//        public ShowMetadata(String id) {
//            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-volumes/")
//                    .append(id).append("/metadata").toString(), null,
//                    Metadata.class);
//        }
//    }

    public class Update extends OpenStackRequest<Volume> {

        public Update(String id) {
            super(CLIENT, HttpMethod.PUT, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, Volume.class);
        }
    }
//		private Update endpoint;
//		
//		public Create(Update endpoint) {
//			super(client, HttpMethod.POST, "/endpoints", Entity.json(endpoint), Update.class);
//			this.endpoint = endpoint;
//		}
		
	
    public class Manage extends OpenStackRequest<VolumeManage> {

        public Manage(String id) {
            super(CLIENT, HttpMethod.PUT, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, VolumeManage.class);
        }
    }
    //note tis it ll come or not i dont knw.
    public class Types extends OpenStackRequest<VolumeManage> {

        public Manage(String id) {
            super(CLIENT, HttpMethod.PUT, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, VolumeManage.class);
        }
    }
    
    public class Delete extends OpenStackRequest<Void> {

        public Delete(String id) {
            super(CLIENT, HttpMethod.DELETE, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, Void.class);
        }
    }
}


package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.Entity;
import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.cinder.model.Volume;
import com.woorea.openstack.cinder.model.Volumes;
import com.woorea.openstack.cinder.model.VolumeTypes;
import com.woorea.openstack.cinder.model.VolumeManage;

/**
 * @author Govindon.

 The VolumesResource Class gives the Volume Extension to Extension Class.
 */
public class VolumesResource {

    /**
     * The instance is created for the OpenStackClient class.
     */
    private final OpenStackClient CLIENT;

    /**
     * Constructor VolumesExtension uses the OpenStackClient Request from
     * Client.
     *
     * @param client gives the Request of the Client.
     */
    public VolumesResource(OpenStackClient client) {
        CLIENT = client;
    }

    /**
     * @return the New List
     */
    public List list(boolean detail) {
        return new List(detail);
    }

    /**
     * The instance of VolumeForCreate class is used to access the Create class.
     *
     * @param volume gives the volume detail.
     * @return new flavor variable for create method.
     */
    public Create create(Volume volume) {
        return new Create(volume);
    }


    /**
     * Method Show for VolumesResource Class and pass the id value.
     *
     * @param id gives id of Client.
     * @return Shows new id value.
     */
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
    /**
     * Method Delete for VolumesResource Class and pass the id value.
     *
     * @param id gives id of Client.
     * @return deleted id value.
     */
    public Delete delete(String id) {
        return new Delete(id);
    }

    /**
     * Class list inherits the OpenStackRequest given by the Client and pass to
     * the VolumeExtension Class.
     */
    public class List extends OpenStackRequest<Volumes> {

        /**
         * Parameterized Constructor for the list Class and return type of
         * boolean.
         *
         * @param detail gives the Volumes detail.
         */
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

    /**
     * Class Show inherits the OpenStackRequest given by the Client and pass to
 the VolumesResource Class.
     */
    public class Show extends OpenStackRequest<Volume> {

        /**
         * Method Show is used to show the id value of the Client, it is
         * Constructor and depends on the Base Class.
         *
         * @param id the id to set
         */
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
		
	
    public class Manage extends OpenStackRequest<Volume> {

        public Update(String id) {
            super(CLIENT, HttpMethod.PUT, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, Volume.class);
        }
    /**
     * Class Delete inherits the OpenStackRequest given by the Client and
     * deletes the Request given by the Client.
     */
    public class Delete extends OpenStackRequest<Void> {

        /**
         * Constructor method of Delete and Calls the HttpMethod of Delete.
         *
         * @param id the id to set
         */
        public Delete(String id) {
            super(CLIENT, HttpMethod.DELETE, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, Void.class);
        }
    }
}


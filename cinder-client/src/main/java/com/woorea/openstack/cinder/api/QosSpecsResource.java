
package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.Entity;
import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.cinder.Cinder;
import com.woorea.openstack.cinder.model.QosSpec;
import com.woorea.openstack.cinder.model.QosSpecs;

/**
 *
 * @author sony
 */
public class QosSpecsResource {

   
    /**
     * The instance is created for the OpenStackClient class.
     */
    private final OpenStackClient CLIENT;

    /**
     * The created instance is used to access the QuotaSetsResource class.
     *
     * @param client the client to set
     */
    public QosSpecsResource(OpenStackClient client) {
        CLIENT = client;
    }

     public Create create(QosSpec qosspec) {
        return new Create(qosspec);
    }

      public List list(boolean detail) {
        return new List(detail);
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
        
    public Delete delete(String id) {
        return new Delete(id);
    }


    public class List extends OpenStackRequest<QosSpecs> {

        public List(boolean detail) {
            super(CLIENT, HttpMethod.GET, detail ? "/os-QosSpecs/detail"
                    : "/os-QosSpecs", null, QosSpecs.class);
        }
    }

    public class Create extends OpenStackRequest<QosSpec> {
		
            private QosSpec qosspec;
		public Create(QosSpec qosspec) {
			super(CLIENT, HttpMethod.POST, "/QosSpec", Entity.json(qosspec), QosSpec.class);
			this.qosspec = qosspec;
		}
		
	}

    public class Show extends OpenStackRequest<QosSpec> {

        public Show(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-QosSpecs/")
                    .append(id).toString(), null, QosSpec.class);
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

    public class Update extends OpenStackRequest<QosSpec> {

        public Update(String id) {
            super(CLIENT, HttpMethod.PUT, new StringBuilder("/os-QosSpecs/")
                    .append(id).toString(), null, QosSpec.class);
        }
    }
    
     
    public class Delete extends OpenStackRequest<Void> {

        public Delete(String id) {
            super(CLIENT, HttpMethod.DELETE, new StringBuilder("/os-QosSpecs/")
                    .append(id).toString(), null, Void.class);
        }
    }










}


package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.Entity;
import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.cinder.model.QosSpec;
import com.woorea.openstack.cinder.model.QosSpecs;

/**
 * This class encompasses the resources for Quality of Service Specification.
 * @author Krishna
 * @author Mona
 */
public class QosSpecsResource {

     /**
     * The instance is created for the OpenStackClient class.
     */
    private final OpenStackClient CLIENT;

    /**
     * The created instance is used to access the QuotaSetsResource class.
     * @param client the client to set
     */
    public QosSpecsResource(OpenStackClient client) {
        CLIENT = client;
    }

    /**
     * This class is to create Quality of Service of Specification object.
     * @param qosspec as object
     * @return QOsspec.
     */
     public Create create(QosSpec qosspec) {
        return new Create(qosspec);
    }

     /**
      * This class use to indicate whether detail is in list.
      * @param detail as value.
      * @return detail.
      */
      public List list(boolean detail) {
        return new List(detail);
    }
    
    /**
     * This is to show the string identifier. 
     * @param id identifier.
     * @return id.
     */
    public Show show(String id) {
        return new Show(id);
    }

    /**
     * This method is to update the string identifier.
     * @param id updated identifier.
     * @return id.
     */
    public Update update(String id) {
        return new Update(id);
    }
     
    /**
     * This method is to delete String.
     * @param id delete String.
     * @return identifier.
     */
    public Delete delete(String id) {
        return new Delete(id);
    }

    /**
     * This class extends openStack Request.
     */
    public class List extends OpenStackRequest<QosSpecs> {

        /**
         * This method is to indicate whether the specified in detail in volume. 
         * @param detail represents boolean value.
         */
        public List(boolean detail) {
            super(CLIENT, HttpMethod.GET, detail ? "/os-QosSpecs/detail"
                    : "/os-QosSpecs", null, QosSpecs.class);
        }
    }

    /**
     * This method create is to extend the open Stack Request.
     */
    public class Create extends OpenStackRequest<QosSpec> {
	    
        /**
         * This method is to specify the private variable QOs Spec. 
         */
        private QosSpec qosspec;
	  
          /**
           * Create Quality of Service Specification and POST using HTTP method.
           * @param qosspec as specification.
           */
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

    /**
     * This class update open stack Request.
     */
    public class Update extends OpenStackRequest<QosSpec> {

        /**
         * This method update String identifier and put using HTTP method.
         * @param id as updated identifier.
         */
        public Update(String id) {
            super(CLIENT, HttpMethod.PUT, new StringBuilder("/os-QosSpecs/")
                    .append(id).toString(), null, QosSpec.class);
        }
    }

    /**
     * This method delete extends open stack request and delete using HTTP method.
     */
    public class Delete extends OpenStackRequest<Void> {

        /**
         * This method to delete String identifier.
         * @param id as deleted identifier.
         */
        public Delete(String id) {
            super(CLIENT, HttpMethod.DELETE, new StringBuilder("/os-QosSpecs/")
                    .append(id).toString(), null, Void.class);
        }
    }
}

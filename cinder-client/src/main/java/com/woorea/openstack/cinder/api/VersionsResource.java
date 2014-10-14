
package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.cinder.model.Version;
import com.woorea.openstack.cinder.model.Versions;

/**
 * This class encompasses all the resources required for versions.
 * @author Krishna <krishna.it2329@gmail.com>
 * @author Mona <mona@gmail.com>
 */
public class VersionsResource {
    
    /**
     * An instance CLIENT is created for the OpenStackClient API.
     */
    private final OpenStackClient CLIENT;

    /**
     * The created instance is used to access the VersionsResource class.
     * @param client gives the Client Request.
     */
    public VersionsResource(OpenStackClient client) {
        CLIENT = client;
    }

    /**
     * Instance is created for the List class.
     * @param detail the detail to set
     * @return the list
     */
    public List list(boolean detail) {
        return new List(detail);
    }
    
    /**
     * Instance is created for the Show class.
     * @param id gives id of Client
     * @return Shows new id value
     */
    public Show show(String id) {
        return new Show(id);
    }
    
    /**
     * The class List extends the Versions class.
     */
     public class List extends OpenStackRequest<Versions> {

         /**
         * Parameterized Constructor for the list Class and return type of boolean.
         * @param detail the detail to set
         */
        public List(boolean detail) {
            super(CLIENT, HttpMethod.GET, detail ? "/os-volumes/detail"
                    : "/os-volumes", null, Versions.class);
        }
    }
     
     /**
     * The class Show extends the Version class.
     */
    public class Show extends OpenStackRequest<Version> {

        /**
         * Method Show is used to show the id value of the Client, it iS constructor and depends on the Base Class.
         * @param id gives the Client Id.
         */
        public Show(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, Version.class);
        }
    }
}

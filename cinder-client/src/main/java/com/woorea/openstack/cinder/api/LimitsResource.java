
package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.cinder.model.Limits;

/**
 *
 * @author Krishna
 * @author Mona
 */
public class LimitsResource {
    
    /**
     * The instance is created for the OpenStackClient class.
     */
    private final OpenStackClient CLIENT;

    /**
     * The created instance is used to access the QuotaSetsResource class.
     *
     * @param client the client to set
     */
    public LimitsResource(OpenStackClient client) {
        CLIENT = client;
    }
    
    public Show show(String id) {
        return new Show(id);
    }


    public class Show extends OpenStackRequest<Limits> {

        /**
         * Show Constructor gives the Client Id, depends on base Class and uses
         * HttpMethod GET.
         *
         * @param id the id to set
         */
        public Show(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/images/")
                    .append(id).toString(), null, Limits.class);
        }

    }

}

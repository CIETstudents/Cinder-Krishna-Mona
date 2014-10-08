
package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.cinder.Cinder;

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

        
}

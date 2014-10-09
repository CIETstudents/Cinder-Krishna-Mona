
package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.OpenStackClient;

/**
 *
 * @author Krishna
 * @author Mona
 * 
 */
public class VersionsResource {

    
    private final OpenStackClient CLIENT;

    
    public VersionsResource(OpenStackClient client) {
        CLIENT = client;
    }

}

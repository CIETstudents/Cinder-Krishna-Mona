
package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.OpenStackClient;

/**
 *
 * @author sony
 */
public class VersionsResource {

    /**
     * The instance is created for the OpenStackClient class.
     */
    private final OpenStackClient CLIENT;

    /**
     * The created instance is used to access the QuotaSetsResource class.
     *
     * @param client the client to set
     */
    public VersionsResource(OpenStackClient client) {
        CLIENT = client;
    }

}

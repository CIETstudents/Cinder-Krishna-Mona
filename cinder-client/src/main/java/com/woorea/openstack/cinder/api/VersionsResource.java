
package com.woorea.openstack.cinder.api;

import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.cinder.model.Version;
import com.woorea.openstack.cinder.model.Versions;

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

    public List list(boolean detail) {
        return new List(detail);
    }
    
    public Show show(String id) {
        return new Show(id);
    }

     public class List extends OpenStackRequest<Versions> {

        public List(boolean detail) {
            super(CLIENT, HttpMethod.GET, detail ? "/os-volumes/detail"
                    : "/os-volumes", null, Versions.class);
        }
    }

    
    
    
    public class Show extends OpenStackRequest<Version> {

        public Show(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-volumes/")
                    .append(id).toString(), null, Version.class);
        }
    }
}

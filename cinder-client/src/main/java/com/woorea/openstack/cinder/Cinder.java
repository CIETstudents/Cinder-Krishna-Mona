package com.woorea.openstack.cinder;

import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackClientConnector;
import com.woorea.openstack.cinder.api.LimitsResource;
import com.woorea.openstack.cinder.api.QosSpecsResource;
import com.woorea.openstack.cinder.api.QuotaSetsResource;
import com.woorea.openstack.cinder.api.SnapshotsResource;
import com.woorea.openstack.cinder.api.VersionsResource;
import com.woorea.openstack.cinder.api.VolumesResource;

/**
 * @author Krishna.
 * @author Mona
 * The class Cinder extends the OpenStackClient class.
 */
public class Cinder extends OpenStackClient {
    /**
     * The instance is created for the SnapshotResouce class.
     * Lists Block Storage API extensions.
     */
    private final SnapshotsResource SNAPSHOTS;
    /**
     * The instance is created for the VolumesResource class.
     * A volume is a detachable block storage device. You can think of it as a
     * USB hard drive. You can attach a volume to one instance at a time
     */
    private final VolumesResource VOLUMES;
 
    /**
     * The instance is created for QuotaSetsResource class.
     * Administrators only, depending on policy settings. View, update, and
     * delete quotas for a tenant
     */
    private final QuotaSetsResource QUOTA_SETS;
 
    private final QosSpecsResource QOS_SPECS;
    
    private final VersionsResource VERSIONS;
    
    private final LimitsResource LIMITS;
    /**
     * The instance of OpenStackClientConnector is used to access the Cinder
     * class.
     *
     * @param endpoint the endpoint to set
     * @param connector the connector to set
     */
    public Cinder(String endpoint, OpenStackClientConnector connector) {
        super(endpoint, connector);
        SNAPSHOTS = new SnapshotsResource(this);
        VOLUMES = new VolumesResource(this);
        QUOTA_SETS = new QuotaSetsResource(this);
        QOS_SPECS = new QosSpecsResource(this);
        VERSIONS = new VersionsResource(this);
        LIMITS = new LimitsResource(this);
    }

    /**
     * @param endpoint the endpoint to set
     */
    public Cinder(String endpoint) {
        this(endpoint, null);
    }

    /**
     * @return the SNAPSHOTS
     */
    public SnapshotsResource snapshots() {
        return SNAPSHOTS;
    }

    /**
     * @return the VOLUMES
     */
    public VolumesResource volumes() {
        return VOLUMES;
    }

    /**
     * @return the QUOTA_SETS
     */
    public QuotaSetsResource quotaSets() {
        return QUOTA_SETS;
    }
    
    /**
     * 
     * @return 
     */
     public QosSpecsResource qosspecs() {
        return QOS_SPECS;
    }
     
     public VersionsResource versions(){
         return VERSIONS;
     }
     
     public LimitsResource limits() {
         return LIMITS;
     }
}
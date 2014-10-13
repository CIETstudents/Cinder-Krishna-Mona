package com.woorea.openstack.cinder.api;

import com.woorea.openstack.cinder.model.QuotaSet;
import com.woorea.openstack.base.client.Entity;
import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.cinder.model.QuotaSets;

/**
 * This class gives all the resources for QuotaSetsResource.
 * @author Krishna.
 * @author Mona.
 */
public class QuotaSetsResource {
    
    /**
     * Create a instance for Rest API CLIENT.
     */
    private final OpenStackClient CLIENT;

    /**
     * The created method is used to access the QuotaSetsResource class.
     * @param client gives the client request.
     */
    public QuotaSetsResource(OpenStackClient client) {
        CLIENT = client;
    }

    /**
     * This class is to show account or tenant id.
     * @param tenantId as account id. 
     * @return tenant id.
     */
    public ShowQuota showQuota(String tenantId) {
        return new ShowQuota(tenantId);
    }

    /**
     * This class is to update the QuotaSets values.
     * @param tenantId as unique identifier.
     * @param quotaSet as instance 
     * @return tenant id, quota set.
     */
    public UpdateQuota updateQuota(String tenantId, QuotaSet quotaSet) {
        return new UpdateQuota(tenantId, quotaSet);
    }

    /**
     * Delete the identifier.
     * @param id in String
     * @return identifier.
     */
    public Delete delete(String id) {
        return new Delete(id);
    }
    
    /**
     * ShowQuota User through tenant id.
     * @param tenantId is to show quota set user.
     * @return tenant id.
     */
    public ShowQuotaUser showquotauser(String tenantId) {
        return new ShowQuotaUser(tenantId);
    }

     /**
     * The class ShowQuota extends the QuotaSet class.
     */
    public class ShowQuota extends OpenStackRequest<QuotaSet> {

        /**
         * This method shows attributes of quota set
         * @param tenantId as identifier. 
         */
        public ShowQuota(String tenantId) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-quota-sets/")
                    .append(tenantId), null, QuotaSet.class);
        }

    }

    /**
     * This class update quota quota sets attributes.
     */
    public class UpdateQuota extends OpenStackRequest<QuotaSet> {

        /**
         * Update tenant id and quota set.
         * @param tenantId as unique identifier.
         * @param quotaSet as instance.
         */
        public UpdateQuota(String tenantId, QuotaSet quotaSet) {
            super(CLIENT, HttpMethod.PUT, new StringBuilder("/os-quota-sets/")
                    .append(tenantId), Entity.json(quotaSet), QuotaSet.class);
        }
    }

    /**
     * This class extends OpenStackRequest.
     */
    public class Delete extends OpenStackRequest<Void> {

        /**
         * THis method is to delete identifier.
         * @param id as String.
         */
        public Delete(String id) {
            super(CLIENT, HttpMethod.DELETE, new StringBuilder("/os-quota-sets/")
                    .append(id).toString(), null, Void.class);
        }
    }

    /**
     * This method is to show quota user.
     */
    public class ShowQuotaUser extends OpenStackRequest<QuotaSets> {

        /**
         * This method is to show quota set user.
         * @param id as String.
         */
        public ShowQuotaUser(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-quota-sets/")
                    .append(id).toString(), null, QuotaSets.class);
        }
    }

}


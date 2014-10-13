package com.woorea.openstack.cinder.api;

import com.woorea.openstack.cinder.model.QuotaSet;
import com.woorea.openstack.base.client.Entity;
import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.cinder.model.QuotaSets;

public class QuotaSetsResource {

    private final OpenStackClient CLIENT;

    public QuotaSetsResource(OpenStackClient client) {
        CLIENT = client;
    }

    public ShowQuota showQuota(String tenantId) {
        return new ShowQuota(tenantId);
    }

    public UpdateQuota updateQuota(String tenantId, QuotaSet quotaSet) {
        return new UpdateQuota(tenantId, quotaSet);
    }

    public Delete delete(String id) {
        return new Delete(id);
    }
    
    public ShowQuotaUser showquotauser(String tenantId) {
        return new ShowQuotaUser(tenantId);
    }

    
    /**
     * The class ShowQuota extends the QuotaSet class.
     */
    public class ShowQuota extends OpenStackRequest<QuotaSet> {

        public ShowQuota(String tenantId) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-quota-sets/")
                    .append(tenantId), null, QuotaSet.class);
        }

    }

    public class UpdateQuota extends OpenStackRequest<QuotaSet> {

        public UpdateQuota(String tenantId, QuotaSet quotaSet) {
            super(CLIENT, HttpMethod.PUT, new StringBuilder("/os-quota-sets/")
                    .append(tenantId), Entity.json(quotaSet), QuotaSet.class);
        }
    }

    public class Delete extends OpenStackRequest<Void> {

        public Delete(String id) {
            super(CLIENT, HttpMethod.DELETE, new StringBuilder("/os-quota-sets/")
                    .append(id).toString(), null, Void.class);
        }
    }

    public class ShowQuotaUser extends OpenStackRequest<QuotaSets> {

        public ShowQuotaUser(String id) {
            super(CLIENT, HttpMethod.GET, new StringBuilder("/os-quota-sets/")
                    .append(id).toString(), null, QuotaSets.class);
        }
    }

}


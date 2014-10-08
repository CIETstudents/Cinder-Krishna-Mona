
package com.woorea.openstack.cinder.model;

import java.util.Calendar;

/**
 *
 * @author Krishna
 * @author Mona
 */
public class Version {

    private String id;
    
    private String status;
    
    private Calendar updated;
    
    private String links;
    
    private String media_types;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Calendar getUpdated() {
        return updated;
    }

    public void setUpdated(Calendar updated) {
        this.updated = updated;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public String getMedia_types() {
        return media_types;
    }

    public void setMedia_types(String media_types) {
        this.media_types = media_types;
    }
}


package com.woorea.cinder.model;

import java.util.Date;

/**
 * The version of API. 
 * @author Krishna
 * @author Mona
 */
public class Version {

    /**
     * Identifier of the version.
     */
    private String id;
    
    /**
     * The status of the version.It is supported or not.
     */
    private String status;
    
    /**
     * Last updated date.
     */
    private Date updated;
    
    /**
     * Links in the API version.
     */
    private String links;
    
    /**
     * base and type of application.
     */
    private String media_types;

    /**
     * get the identifier of version.
     * @return identifier.
     */
    public String getId() {
        return id;
    }

    /**
     * set the identifier of version.
     * @param id for version.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get the status of the version.
     * @return status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * set the status of version.
     * @param status as supported or not
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * get last updated date 
     * @return updated.
     */
    public Date getUpdated() {
        return updated;
    }

    /**
     * set updated date.
     * @param updated as new date.
     */
    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    /**
     * get the links
     * @return links.
     */
    public String getLinks() {
        return links;
    }
    
    /**
     * set the links.
     * @param links from version.
     */
    public void setLinks(String links) {
        this.links = links;
    }

    /**
     * get base and type of application.
     * @return media_types.
     */
    public String getMedia_types() {
        return media_types;
    }

    /**
     * set the base and types of application
     * @param media_types for application.
     */
    public void setMedia_types(String media_types) {
        this.media_types = media_types;
    }
}

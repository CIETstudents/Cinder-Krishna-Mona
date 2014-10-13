package com.woorea.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This class extends version.
 *
 * @author Krishna.
 * @author Mona.
 */
public class Versions implements Iterable<Version>, Serializable {

    /**
     * This interface serialize version attributes. 
     */
    @JsonProperty("Versions")
    private List<Version> list;

    /**
     * get identifier of version.
     * @return list.
     */
    public List<Version> getId() {
        return list;
    }

    /**
     * get the name of version.
     * @return list.
     */
    public List<Version> getName() {
        return list;
    }

    /**
     * get the status of version.
     * @return list.
     */
    public List<Version> getStatus() {
        return list;
    }

    /**
     * get the attachments for versions.
     * @return list.
     */
    public List<Version> getAttachments() {
        return list;
    }

    /**
     * to remove duplicate elements.
     * @return list.
     */
    @Override
    public Iterator<Version> iterator() {
        return list.iterator();
    }
}

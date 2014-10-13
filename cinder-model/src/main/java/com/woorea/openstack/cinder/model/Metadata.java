package com.woorea.openstack.cinder.model;

import java.util.Map;

/**
 * This class shows key and value pairs for volume.
 *
 * @author Krishna.
 * @author Mona.
 */
public class Metadata {

    /**
     * One or more meta data key and value pairs to associate with the volume.
     */
    private Map<String, String> metadata;

    /**
     * get key and value pairs.
     *
     * @return meta data.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * Set the meta data
     *
     * @param metadata as key and value pairs.
     */
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }
}

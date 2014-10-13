package com.woorea.openstack.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This gives resources for volume to create instance.
 * 
* @author Krishna
 * @author Mona
 */
public class Volumes implements Iterable<Volume>, Serializable {

    /**
     * this interface serialize attributes in order.
     */
    @JsonProperty("Volumes")
    private List<Volume> list;

    /**
     * gets identifier for volume.
     *
     * @return list.
     */
    public List<Volume> getId() {
        return list;
    }

    /**
     * gets name for the volume.
     *
     * @return list.
     */
    public List<Volume> getName() {
        return list;
    }

    /**
     * used to remove duplicate elements.
     *
     * @return list.
     */
    @Override
    public Iterator<Volume> iterator() {
        return list.iterator();
    }
}

package com.woorea.openstack.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This class gives backup is a full copy of a volume stored in an external
 * service.
 * @author Krishna.
 * @author Mona.
 */
public class Backup implements Iterable<Volume>, Serializable {

    /**
     * this interface aids to back up all the attributes stored in an external
     * service.
     */
    @JsonProperty("Backup")
    private List<Volume> list;

    /**
     * get list of attributes from volume.
     * @return list.
     */
    public List<Volume> getList() {
        return list;
    }

    /**
     * to remove the duplicate elements.
     * @return list.
     */
    @Override
    public Iterator<Volume> iterator() {
        return list.iterator();
    }
    /**
     * generates a string with required properties.
     * @return JSon string.
     */

    @Override
    public String toString() {
        return "Backup [list=" + list + "]";
    }
}

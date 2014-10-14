package com.woorea.openstack.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This class shows the required specifications for object.
 * @author Krishna
 * @author Mona
 */
public class QosSpecs implements Iterable<QosSpec>, Serializable {

    /**
     * This interface serialize the QOS attributes in order.
     */
    @JsonProperty("QosSpecs")
    private List<QosSpec> list;

    /**
     * get the list of QOs Specifications.
     * @return list.
     */
    public List<QosSpec> getList() {
        return list;
    }

    /**
     * Used to remove duplicate elements
     * @return list.
     */
    @Override
    public Iterator<QosSpec> iterator() {
        return list.iterator();
    }
    /**
     * generates a string with required properties.
     * @return JSon string.
     */
    @Override
    public String toString() {
        return "QosSpec [list=" + list + "]";
    }
}

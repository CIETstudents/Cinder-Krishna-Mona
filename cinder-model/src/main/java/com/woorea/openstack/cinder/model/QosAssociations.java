package com.woorea.openstack.cinder.model ;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This class get all associations for QoS specification.
 *
 * @author Krishna
 * @author Mona.
 */
public class QosAssociations implements Iterable<QosSpec>, Serializable {

    /**
     * This interface serialize Qos Spec attributes in order.
     */
    @JsonProperty("QosAssociations")
    private List<QosSpec> list;

    /**
     * get identifier for QOs specification.
     *
     * @return
     */
    public List<QosSpec> getId() {
        return list;
    }

    /**
     * get name for QOs specification.
     *
     * @return
     */
    public List<QosSpec> getName() {
        return list;
    }

    /**
     * remove the duplicate elements
     *
     * @return list.
     */
    @Override
    public Iterator<QosSpec> iterator() {
        return list.iterator();
    }
}

package com.woorea.openstack.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This class import quotas.
 * 
* @author Krishna.
 * @author Mona.
 */
public class QuotaSets implements Iterable<QuotaSet>, Serializable {

    /**
     * this interface serialize quota set attributes in order.
     */
    @JsonProperty("QuotaSets")
    private List<QuotaSet> list;

    /**
     * get the list of Quota Sets.
     * @return list.
     */
    public List<QuotaSet> getList() {
        return list;
    }

    /**
     * remove duplicate elements.
     * @return list.
     */
    @Override
    public Iterator<QuotaSet> iterator() {
        return list.iterator();
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */

    @Override
    public String toString() {
        return "QuotaSets [list=" + list + "]";
    }
}

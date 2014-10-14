package com.woorea.openstack.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 *
 * @author Krishna.
 * @author Mona.
 */
public class VolumeManage implements Iterable<Volume>, Serializable {

    /**
     * This interface serialize volumes attributes in order.
     */
    @JsonProperty("VolumeManage")
    private List<Volume> list;

    /**
     * get Volume identifier.
     * @return list.
     */
    public List<Volume> getId() {
        return list;
    }

    /**
     * get Volume name.
     * @return list.
     */
    public List<Volume> getName() {
        return list;
    }

    /**
     * get Volume status.
     * @return list.
     */
    public List<Volume> getStatus() {
        return list;
    }

    /**
     * get Volume attachments.
     * @return list.
     */
    public List<Volume> getAttachments() {
        return list;
    }

    /**
     * get Volume availability_zone.
     * @return list.
     */
    public List<Volume> getAvailability_zone() {
        return list;
    }

    /**
     * get Volume bootable.
     * @return list.
     */
    public List<Volume> getBootable() {
        return list;
    }

    /**
     * get Volume created_at.
     * @return list.
     */
    public List<Volume> getCreated_at() {
        return list;
    }

    /**
     * get Volume volume_type.
     * @return list.
     */
    public List<Volume> getVolume_type() {
        return list;
    }

    /**
     * get Volume snapshot id.
     * @return list.
     */
    public List<Volume> getSnapshot_id() {
        return list;
    }

    /**
     * get Volume source volume id.
     * @return list.
     */
    public List<Volume> getSource_volid() {
        return list;
    }

    /**
     * get Volume size.
     * @return list.
     */
    public List<Volume> getSize() {
        return list;
    }

    /**
     * to remove duplicate elements.
     * @return list.
     */
    @Override
    public Iterator<Volume> iterator() {
        return list.iterator();
    }
}

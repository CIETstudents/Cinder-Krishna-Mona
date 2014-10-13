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

    @JsonProperty("VolumeManage")
    private List<Volume> list;

    public List<Volume> getId() {
        return list;
    }

    public List<Volume> getName() {
        return list;
    }

    public List<Volume> getStatus() {
        return list;
    }

    public List<Volume> getAttachments() {
        return list;
    }

    public List<Volume> getAvailability_zone() {
        return list;
    }

    public List<Volume> getBootable() {
        return list;
    }

    public List<Volume> getCreated_at() {
        return list;
    }

    public List<Volume> getVolume_type() {
        return list;
    }

    public List<Volume> getSnapshot_id() {
        return list;
    }

    public List<Volume> getSource_volid() {
        return list;
    }

    public List<Volume> getSize() {
        return list;
    }

    @Override
    public Iterator<Volume> iterator() {
        return list.iterator();
    }
}

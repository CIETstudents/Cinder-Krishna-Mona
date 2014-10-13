package com.woorea.openstack.cinder.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * This class Shows information for a specified snapshot.
 * 
* @author Krishna.
 * @author Mona.
 */
public class Snapshots implements Iterable<Snapshot>, Serializable {

    /**
     * This interface serialize snapshot attributes in order.
     */
    @JsonProperty("SnapshotManage")
    private List<Snapshot> list;
    /**
     * One or more meta data key and value pairs to associate with the volume.
     */
    private Map<String, String> metadata;

    /**
     * get snapshot identifier.
     *
     * @return list.
     */
    public List<Snapshot> getId() {
        return list;
    }

    /**
     * get snapshot name.
     *
     * @return list.
     */
    public List<Snapshot> getName() {
        return list;
    }

    /**
     * get snapshot availability.
     *
     * @return list.
     */
    public List<Snapshot> getStatus() {
        return list;
    }

    /**
     * get the snapshot description.
     *
     * @return list.
     */
    public List<Snapshot> getDescription() {
        return list;
    }

    /**
     * get the key and value pairs for snapshot.
     *
     * @return meta data.
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * time or date at which the snapshot created.
     *
     * @return list.
     */
    public List<Snapshot> getCreated_at() {
        return list;
    }

    /**
     * get the volume identifier for snapshot.
     *
     * @return list.
     */
    public List<Snapshot> getVolume_id() {
        return list;
    }

    /**
     * get the size of the snapshot.
     *
     * @return list.
     */
    public List<Snapshot> getSize() {
        return list;
    }

    /**
     * used to remove duplicate elements.
     *
     * @return list.
     */
    @Override
    public Iterator<Snapshot> iterator() {
        return list.iterator();
    }
}

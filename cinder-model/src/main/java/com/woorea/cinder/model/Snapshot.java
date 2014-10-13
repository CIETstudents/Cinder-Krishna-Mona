package com.woorea.cinder.model;

import java.util.Calendar;
import java.util.Map;

/**
 *This class is to generate a time copy of the data that a volume contains.
 * @author Krishna.
 * @author Mona.
 */
public class Snapshot {

    /**
     * identifier of snapshot.
     */
    private String id;
    
    /**
     * Name of the snapshot.
     */
    private String name;
    
    /**
     * states whether the snapshot created or not.
     */
    private String status;

    /**
     * description for the snapshot.
     */
    private String description;
    
    /**
     * displays the name of the snapshot.
     */
    private String display_name;
    
    /**
     * displays the description of the snapshot. 
     */
    private String display_description;
    
    /**
     * Indicate whether to snapshot, even if the volume is attached.
     */
    private boolean force;

    /**
     * date or time for the snapshot when it is created.
     */
    private Calendar created_at;

    /**
     * One or more meta data key and value pairs to associate with the volume.
     */    
    private Map<String, String> metadata;

    /**
     * it shows the snapshot volume.
     */
    private String volume;

    /**
     * size of the snapshot.
     */
    private Long size;

    /**
     * version of the snapshot.
     */
    private String key;

   /**
     * this method gets snapshot id.
     * @return id.
     */
    public String getId() {
        return id;
    }

    /**
     * it sets received snapshot identifier.
     * @param id identifier.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * this method gets snapshot name.
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * it sets received name.
     * @param name as snapshot name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *  snapshot is availability.
     * @return status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * this method set status of the snapshot.
     * @param status of the method.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * this method gives snapshot description.
     * @return description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * sets snapshot description.
     * @param description for volume.
     */
    public void setDescription(String description) {
        this.description = description;
    }

     /**
     * size of the snapshot.
     * @return size.
     */
    public Long getSize() {
        return size;
    }

    /**
     * set snapshot size.
     * @param size in GB.
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * displays the snapshot name.
     * @return name.
     */
    public String getDisplay_name() {
        return display_name;
    }

    /**
     * set snapshot name.
     * @param display_name 
     */
    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }
    
    /**
     * gets snapshot description.
     * @return display_description.
     */
    public String getDisplay_description() {
        return display_description;
    }

    /**
     *sets snapshot description. 
     * @param display_description 
     */
    public void setDisplay_description(String display_description) {
        this.display_description = display_description;
    }

    /**
     * checks for snapshot whether the volume is attached or not..
     * @return force. 
     */
    public boolean isForce() {
        return force;
    }

    /**
     * set true when the volume is attached.
     * @param force as true.
     */
    public void setForce(boolean force) {
        this.force = force;
    }
    
    /**
     * Time or date at which the snapshot is created.
     * @return date or time.
     */
    public Calendar getCreated_at() {
        return created_at;
    }

    /**
     * Set time or date.
     * @param created_at time. 
     */
    public void setCreated_at(Calendar created_at) {
        this.created_at = created_at;
    }
    
    /**
     * get the volume of the snapshot.
     * @return volume.
     */
    public String getVolume() {
        return volume;
    }

    /**
     * set the volume of the snapshot.
     * @param volume as snapshot volume.
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * get version for snapshot
     * @return key. 
     */
    public String getKey() {
        return key;
    }

    /**
     * set the version of the snapshot.
     * @param key as version.
     */
    public void setKey(String key) {
        this.key = key;
    }
    
    /**
     * get value of the data using key value.
     * @return meta data.
     */
    public Map<String, String> getMetadata() {
		return metadata;
    }

   /**
   * Set the meta data
   * @param metadata
   */
    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
     * generate time copy of the data that volume contains.
     * @return JSon string.
     */
    @Override
    public String toString() {
        return "Snapshot{" + "id=" + id + ", name=" + name + ", status=" + status + ", "
                + "description=" + description + ", display_name=" + display_name + ", display_description=" + 
                display_description + ", force=" + force + ", created_at=" + created_at + ", metadata=" + metadata + ", "
                + "volume=" + volume + ", size=" + size + ", key=" + key + '}';
    }
}

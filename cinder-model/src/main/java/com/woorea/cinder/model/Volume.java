package com.woorea.cinder.model;

import java.util.Calendar;
import java.util.Map;

/**
 *This class gives volume details along with description.
 * @author Krishna
 * @author Mona
 */
public class Volume {
    
    /**
     * gives the volume id.
     */
    private String id;
    
    /**
     * gives the volume name.
     */
    private String name;
    
    /**
     * gives HTTP link along with its relative URL. 
     */
    private String links;
    
    /**
     * gives the volume status.
     */
    private String status;
    
    /**
     * it gives one or more instance attachments.
     */
    private String attachments;
    
    /**
     * Enables or disables the bootable attribute. You can boot an instance from a bootable volume.
     */
    private boolean  bootable;
    
    /**
     * Date and time when the volume was created.
     */
    private Calendar created_at;
    
    /**
     * it use to give volume description.
     */
    private String description;
    
    /**
     * it gives volume availability zone.
     */
    private String availability_zone;

    /**
     * To create a volume from an existing volume, specify the ID of the existing volume.
     */
    private String source_volid;

    /**
     * it displays volume description.
     */
    private String display_description;

    /**
     * To create a volume from an existing volume snapshot, specifies the ID of the existing volume snapshot.
     */
    private String snapshot_id;

    /**
     * the size of the volume in GB.
     */
    private Long size;

    /**
     * it displays the name of the volume. 
     */
    private String display_name;

    /**
     * it shows associated volume type.
     */
    private String volume_type;

    /**
     * One or more meta data key and value pairs to associate with the volume.
     */    
    private Map<String, String> metadata;

    /**
     * this method gets volume id.
     * @return id.
     */
    public String getId() {
        return id;
    }

    /**
     * it sets received volume identifier.
     * @param id identifier.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * this method gets volume name.
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * it sets received name.
     * @param name as volume name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * this method gets HTTP links. 
     * @return links.
     */
    public String getLinks() {
        return links;
    }

    /**
     * this method set links,
     * @param links with URL.
     */
    public void setLinks(String links) {
        this.links = links;
    }

    /**
     * the volume status.
     * @return status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * this method set status 
     * @param status of the method.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Gets one or more instance.
     * @return attachments.
     */
    public String getAttachments() {
        return attachments;
    }

    /**
     * set one or more instance.
     * @param attachments for instance.
     */
    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    /**
     * enable bootable attribute
     * @return bootable. 
     */
    public boolean getBootable() {
        return bootable;
    }

    /**
     * set bootable attribute.
     * @param bootable if true.
     */
    public void setBootable(boolean bootable) {
        this.bootable = bootable;
    }

    /**
     * Time or date at which the volume is created.
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
     * this method gives volume description.
     * @return description.
     */
    public String getDescription() {
        return description;
    }

    /**
     * sets volume description.
     * @param description for volume.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * get the availability zone.
     * @return availability zone.
     */
    public String getAvailability_zone() {
        return availability_zone;
    }

    /**
     * sets availability zone.
     * @param availability_zone for volume. 
     */
    public void setAvailability_zone(String availability_zone) {
        this.availability_zone = availability_zone;
    }

    /**
     * get volume identifier from existing volume.
     * @return source_volid.
     */
    public String getSource_volid() {
        return source_volid;
    }

    /**
     * set new volume identifier. 
     * @param source_volid. 
     */
    public void setSource_volid(String source_volid) {
        this.source_volid = source_volid;
    }

    /**
     * gets volume description.
     * @return display_description.
     */
    public String getDisplay_description() {
        return display_description;
    }

    /**
     *sets volume description. 
     * @param display_description 
     */
    public void setDisplay_description(String display_description) {
        this.display_description = display_description;
    }

    /**
     * gets identifier from existing volume snapshot.
     * @return snapshot_id.
     */
    public String getSnapshot_id() {
        return snapshot_id;
    }

    /**
     * sets identifier received from existing volume snapshot.
     * @param snapshot_id as new identifier.
     */
    public void setSnapshot_id(String snapshot_id) {
        this.snapshot_id = snapshot_id;
    }

    /**
     * size of the volume.
     * @return size.
     */
    public Long getSize() {
        return size;
    }

    /**
     * set volume size.
     * @param size in GB.
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * displays the volume name.
     * @return name.
     */
    public String getDisplay_name() {
        return display_name;
    }

    /**
     * set volume name.
     * @param display_name 
     */
    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    /**
     * gets type of volume.
     * @return volume_type.
     */
     public String getVolume_type() {
        return volume_type;
    }

     /**
      * sets volume type.
      * @param volume_type as associated with volume. 
      */
    public void setVolume_type(String volume_type) {
        this.volume_type = volume_type;
    }

    /**
     * Get the key for value.
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
     * generates a string with required properties.
     * @return JSon string.
     */
    @Override
    public String toString() {
        return "Volume{" + "id=" + id + ", name=" + name + ", links=" + links + ", status=" +
                status + ", attachments=" + attachments + ", bootable=" + bootable + ", created_at=" + created_at + ","
                + " description=" + description + ", availability_zone=" + availability_zone + ", source_volid=" + 
                source_volid + ", display_description=" + display_description + ", snapshot_id=" + snapshot_id + ", size=" + 
                size + ", display_name=" + display_name + ", volume_type=" + volume_type + ", metadata=" + metadata + '}';
    }       
}       

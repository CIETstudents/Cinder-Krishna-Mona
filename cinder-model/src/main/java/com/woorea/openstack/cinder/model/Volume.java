package com.woorea.openstack.cinder.model;

import java.util.Calendar;

/**
 *
 * @author Krishna.
 * @author Mona.
 * 
 */
public class Volume {
    
    private String id;
    
    private String name;
    
    private String links;
    
    private String status;
    
    private String attachments;
    
    private boolean  bootable;
    
    private Calendar created_at;
    
    private String metadata_id;
    
    private String description;
    
    private String availability_zone;

    private String source_volid;

    private String display_description;

    private String snapshot_id;

    private Long size;

    private String display_name;

    private String imageRef;

    private String volume_type;

    private String metadata;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAttachments() {
        return attachments;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public boolean getBootable() {
        return bootable;
    }

    public void setBootable(boolean bootable) {
        this.bootable = bootable;
    }

    public Calendar getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Calendar created_at) {
        this.created_at = created_at;
    }

    public String getMetadata_id() {
        return metadata_id;
    }

    public void setMetadata_id(String metadata_id) {
        this.metadata_id = metadata_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAvailability_zone() {
        return availability_zone;
    }

    public void setAvailability_zone(String availability_zone) {
        this.availability_zone = availability_zone;
    }

    public String getSource_volid() {
        return source_volid;
    }

    public void setSource_volid(String source_volid) {
        this.source_volid = source_volid;
    }

    public String getDisplay_description() {
        return display_description;
    }

    public void setDisplay_description(String display_description) {
        this.display_description = display_description;
    }

    public String getSnapshot_id() {
        return snapshot_id;
    }

    public void setSnapshot_id(String snapshot_id) {
        this.snapshot_id = snapshot_id;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getImageRef() {
        return imageRef;
    }

    public void setImageRef(String imageRef) {
        this.imageRef = imageRef;
    }

    public String getVolume_type() {
        return volume_type;
    }

    public void setVolume_type(String volume_type) {
        this.volume_type = volume_type;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "Volume{" + "id=" + id + ", name=" + name + ", links=" + links + ", status=" + status + ", attachments=" + attachments + ", bootable=" + bootable + ", created_at=" + created_at + ", metadata_id=" + metadata_id + ", description=" + description + ", availability_zone=" + availability_zone + ", source_volid=" + source_volid + ", display_description=" + display_description + ", snapshot_id=" + snapshot_id + ", size=" + size + ", display_name=" + display_name + ", imageRef=" + imageRef + ", volume_type=" + volume_type + ", metadata=" + metadata + '}';
    }   
}

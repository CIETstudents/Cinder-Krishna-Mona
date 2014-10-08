package com.woorea.openstack.cinder.model;

import java.util.Calendar;


/**
 *
 * @author Krishna
 * @author Mona.
 */
public class Snapshot {

    private String id;
    
    private String name;
    
    private String status;

    private String description;
    
    private String display_name;
    
    private String display_description;
    
    private boolean force;

    private Calendar created_at;

    private String metadata;

    private String volume;

    private Long size;

    private String key;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDisplay_name() {
        return display_name;
    }

    public void setDisplay_name(String display_name) {
        this.display_name = display_name;
    }

    public String getDisplay_description() {
        return display_description;
    }

    public void setDisplay_description(String display_description) {
        this.display_description = display_description;
    }

    public boolean isForce() {
        return force;
    }

    public void setForce(boolean force) {
        this.force = force;
    }

    public Calendar getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Calendar created_at) {
        this.created_at = created_at;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Snapshot{" + "id=" + id + ", name=" + name + ", status=" + status + ", description=" + description + ", display_name=" + display_name + ", display_description=" + display_description + ", force=" + force + ", created_at=" + created_at + ", metadata=" + metadata + ", volume=" + volume + ", size=" + size + ", key=" + key + '}';
    }

}

package com.woorea.openstack.cinder.model;

/**
 *
 * @author Krishna
 * @author Mona.
 */
public class VolumeTypes {	
        
        private String id;
        
        private String name;
        
        private String extra_specs;
         
        private String capabilities;

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

    public String getExtra_specs() {
        return extra_specs;
    }

    public void setExtra_specs(String extra_specs) {
        this.extra_specs = extra_specs;
    }

    public String getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(String capabilities) {
        this.capabilities = capabilities;
    }

    @Override
    public String toString() {
        return "VolumeTypes{" + "id=" + id + ", name=" + name + ", extra_specs=" + extra_specs + ", capabilities=" + capabilities + '}';
    }

	
}


package com.woorea.cinder.model;

/**
 * This class shows associated volume type.
 * @author Krishna
 * @author Mona
 */
public class VolumeTypes {
    
    /**
    * gives the volume id.
    */
    private String id;
    
    /**
     * gives the volume name.
     */
    private String name;
    
   /**
    * gives extra specifications.
    */
    private String extra_specs;

    /**
     * gives volume capabilities.
     */
    private String capabilities;

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
     * this method gets extra specs. 
     * @return links.
     */
    public String getExtra_specs() {
        return extra_specs;
    }

    /**
     * set the method from extra specs.
     * @param extra_specs for volume.
     */
    public void setExtra_specs(String extra_specs) {
        this.extra_specs = extra_specs;
    }

    /**
     * get volume capabilities.
     * @return capabilities.
     */
    public String getCapabilities() {
        return capabilities;
    }

    /**
     * set volume capabilities.
     * @param capabilities - properties needed for volume.
     */
    public void setCapabilities(String capabilities) {
        this.capabilities = capabilities;
    }

    /**
     * generate a string with partial representation of a volume type used in the creation process
     * @return string.
     */
    @Override
    public String toString() {
        return "VolumeTypes{" + "id=" + id + ", name=" + name + ", extra_specs=" + extra_specs + ", capabilities=" + capabilities + '}';
    }

}

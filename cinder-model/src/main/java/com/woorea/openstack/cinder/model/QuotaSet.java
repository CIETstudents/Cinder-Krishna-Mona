package com.woorea.openstack.cinder.model;

/**
 * This class for shows QuotaSet for tenants.
 *
 * @author Krishna.
 * @author Mona.
 */
public class QuotaSet {

    /**
     * The number of instance cores allowed for each tenant.
     */
    private int cores;
    /**
     * The number of fixed IP addresses allowed for each tenant. Must be equal
     * to or greater than the number of allowed instances.
     */
    private int fixed_ips;
    /**
     * The number of floating IP addresses allowed for each tenant.
     */
    private int floating_ips;
    /**
     * The Identifier for the quota set.
     */
    private int id;
    /**
     * The number of bytes of content allowed for each injected file.
     */
    private int injected_file_content_bytes;
    /**
     * The number of bytes allowed for each injected file.
     */
    private int injected_file_path_bytes;
    /**
     * The number of injected files allowed for each tenant.
     */
    private int injected_files;
    /**
     * The number of instances allowed for each tenant.
     */
    private int instances;
    /**
     * The number of key pairs allowed for each user.
     */
    private int key_pairs;
    /**
     * The number of meta data items allowed for each tenant.
     */
    private int metadata_items;
    /**
     * The amount of instance RAM in megabytes allowed for each tenant.
     */
    private int ram;
    /**
     * The number of rules allowed for each security group.
     */
    private int security_group_rules;
    /**
     * The number of security groups allowed for each tenant.
     */
    private int security_groups;

    /**
     * get the number of instance cores allowed for each tenant.
     *
     * @return cores.
     */
    public int getCores() {
        return cores;
    }

    /**
     * set the number of instance cores allowed for each tenant.
     *
     * @param cores as instance.
     */
    public void setCores(int cores) {
        this.cores = cores;
    }

    /**
     * get the number of fixed IP addresses allowed for each tenant.
     *
     * @return fixed_ips.
     */
    public int getFixed_ips() {
        return fixed_ips;
    }

    /**
     * set the number of fixed IP addresses allowed for each tenant.
     *
     * @param fixed_ips greater or equal to instance.
     */
    public void setFixed_ips(int fixed_ips) {
        this.fixed_ips = fixed_ips;
    }

    /**
     * get the number of floating IP addresses allowed for each tenant.
     *
     * @return floating_ips.
     */
    public int getFloating_ips() {
        return floating_ips;
    }

    /**
     * set the number of floating IP addresses allowed for each tenant.
     *
     * @param floating_ips for instances.
     */
    public void setFloating_ips(int floating_ips) {
        this.floating_ips = floating_ips;
    }

    /**
     * get the identifier for quota set.
     *
     * @return id.
     */
    public int getId() {
        return id;
    }

    /**
     * set the identifier for quota set.
     *
     * @param id as identifier.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * get the number of bytes of content allowed for each injected file.
     *
     * @return injected_file_content_bytes.
     */
    public int getInjected_file_content_bytes() {
        return injected_file_content_bytes;
    }

    /**
     * set the number of bytes of content allowed for each injected file.
     *
     * @param injected_file_content_bytes in integer.
     */
    public void setInjected_file_content_bytes(int injected_file_content_bytes) {
        this.injected_file_content_bytes = injected_file_content_bytes;
    }

    /**
     * get the number of bytes allowed for each injected file.
     *
     * @return injected_file_path_bytes.
     */
    public int getInjected_file_path_bytes() {
        return injected_file_path_bytes;
    }

    /**
     * set the number of bytes allowed for each injected file.
     *
     * @param injected_file_path_bytes in integer.
     */
    public void setInjected_file_path_bytes(int injected_file_path_bytes) {
        this.injected_file_path_bytes = injected_file_path_bytes;
    }

    /**
     * The number of injected files allowed for each tenant.
     *
     * @return injected_files.
     */
    public int getInjected_files() {
        return injected_files;
    }

    /**
     * set the number of injected files allowed for each tenant.
     *
     * @param injected_files for quota sets.
     */
    public void setInjected_files(int injected_files) {
        this.injected_files = injected_files;
    }

    /**
     * get the number of instances allowed for each tenant.
     *
     * @return instances.
     */
    public int getInstances() {
        return instances;
    }

    /**
     * set the number of instances allowed for each tenant.
     *
     * @param instances for tenant.
     */
    public void setInstances(int instances) {
        this.instances = instances;
    }

    /**
     * get the number of KeyPairs allowed for each user.
     *
     * @return Key_pairs.
     */
    public int getKey_pairs() {
        return key_pairs;
    }

    /**
     * The number of KeyPairs allowed for each user.
     *
     * @param key_pairs for user
     */
    public void setKey_pairs(int key_pairs) {
        this.key_pairs = key_pairs;
    }

    /**
     * get the number of meta data items allowed for each instance.
     *
     * @return meta data_items.
     */
    public int getMetadata_items() {
        return metadata_items;
    }

    /**
     * set the number of meta data items allowed for each instance.
     *
     * @param metadata_items as key and value pairs.
     */
    public void setMetadata_items(int metadata_items) {
        this.metadata_items = metadata_items;
    }

    /**
     * get the amount of instance RAM allowed for each tenant.
     *
     * @return ram.
     */
    public int getRam() {
        return ram;
    }

    /**
     * set the amount of instance RAM allowed for each tenant.
     *
     * @param ram in megabytes.
     */
    public void setRam(int ram) {
        this.ram = ram;
    }

    /**
     * get the number of rules allowed for each security group.
     *
     * @return security_group_rules.
     */
    public int getSecurity_group_rules() {
        return security_group_rules;
    }

    /**
     * set the number of rules allowed for each security group.
     *
     * @param security_group_rules for security.
     */
    public void setSecurity_group_rules(int security_group_rules) {
        this.security_group_rules = security_group_rules;
    }

    /**
     * get the number of security groups allowed for each tenant.
     *
     * @return security_groups.
     */
    public int getSecurity_groups() {
        return security_groups;
    }

    /**
     * set the number of security groups allowed for each tenant.
     *
     * @param security_groups for tenant.
     */
    public void setSecurity_groups(int security_groups) {
        this.security_groups = security_groups;
    }

    /**
     * generate a string for quota set
     *
     * @return string.
     */
    @Override
    public String toString() {
        return "QuotaSet{" + "cores=" + cores + ", fixed_ips=" + fixed_ips + ", floating_ips="
                + floating_ips + ", id=" + id + ", injected_file_content_bytes=" + injected_file_content_bytes + ", "
                + "injected_file_path_bytes=" + injected_file_path_bytes + ", injected_files=" + injected_files + ","
                + " instances=" + instances + ", key_pairs=" + key_pairs + ", metadata_items=" + metadata_items + ", "
                + "ram=" + ram + ", security_group_rules=" + security_group_rules + ", security_groups="
                + security_groups + '}';
    }
}

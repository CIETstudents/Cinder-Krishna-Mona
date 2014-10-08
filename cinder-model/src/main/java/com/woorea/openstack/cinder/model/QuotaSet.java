
package com.woorea.openstack.cinder.model;

/**
 *
 * @author Krishna
 * @author Mona
 */
public class QuotaSet {
    
  private int cores;

  private int fixed_ips;
  

private int floating_ips;

private int id;

private int injected_file_content_bytes;

private int  injected_file_path_bytes;

private int injected_files;

private int instances;

private int key_pairs;

private int metadata_items;

private int ram;

private int security_group_rules;

private int security_groups;

private int in_use;

private int limit;

private int reserved;

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getFixed_ips() {
        return fixed_ips;
    }

    public void setFixed_ips(int fixed_ips) {
        this.fixed_ips = fixed_ips;
    }

    public int getFloating_ips() {
        return floating_ips;
    }

    public void setFloating_ips(int floating_ips) {
        this.floating_ips = floating_ips;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInjected_file_content_bytes() {
        return injected_file_content_bytes;
    }

    public void setInjected_file_content_bytes(int injected_file_content_bytes) {
        this.injected_file_content_bytes = injected_file_content_bytes;
    }

    public int getInjected_file_path_bytes() {
        return injected_file_path_bytes;
    }

    public void setInjected_file_path_bytes(int injected_file_path_bytes) {
        this.injected_file_path_bytes = injected_file_path_bytes;
    }

    public int getInjected_files() {
        return injected_files;
    }

    public void setInjected_files(int injected_files) {
        this.injected_files = injected_files;
    }

    public int getInstances() {
        return instances;
    }

    public void setInstances(int instances) {
        this.instances = instances;
    }

    public int getKey_pairs() {
        return key_pairs;
    }

    public void setKey_pairs(int key_pairs) {
        this.key_pairs = key_pairs;
    }

    public int getMetadata_items() {
        return metadata_items;
    }

    public void setMetadata_items(int metadata_items) {
        this.metadata_items = metadata_items;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSecurity_group_rules() {
        return security_group_rules;
    }

    public void setSecurity_group_rules(int security_group_rules) {
        this.security_group_rules = security_group_rules;
    }

    public int getSecurity_groups() {
        return security_groups;
    }

    public void setSecurity_groups(int security_groups) {
        this.security_groups = security_groups;
    }

    public int getIn_use() {
        return in_use;
    }

    public void setIn_use(int in_use) {
        this.in_use = in_use;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getReserved() {
        return reserved;
    }

    public void setReserved(int reserved) {
        this.reserved = reserved;
    }

    @Override
    public String toString() {
        return "QuotaSet{" + "cores=" + cores + ", fixed_ips=" + fixed_ips + ", floating_ips=" + floating_ips + ", id=" + id + ", injected_file_content_bytes=" + injected_file_content_bytes + ", injected_file_path_bytes=" + injected_file_path_bytes + ", injected_files=" + injected_files + ", instances=" + instances + ", key_pairs=" + key_pairs + ", metadata_items=" + metadata_items + ", ram=" + ram + ", security_group_rules=" + security_group_rules + ", security_groups=" + security_groups + ", in_use=" + in_use + ", limit=" + limit + ", reserved=" + reserved + '}';
    }
    
    
    
    
}

package com.woorea.openstack.cinder.model;


/**
 *
 * @author developer
 */
public class QosSpec {
    
    private String specs;

    private String availability;

    private String numberOfFailures;

    private String consumer;

    private String links;
    
    private String id; 
    
    private String name;
    
    private String delay;
    
    private String throughput;
    
    public String getSpecs() {
        return specs;
    }

    public void setSpecs(String specs) {
        this.specs = specs;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public String getNumberOfFailures() {
        return numberOfFailures;
    }

    public void setNumberOfFailures(String numberOfFailures) {
        this.numberOfFailures = numberOfFailures;
    }

    public String getConsumer() {
        return consumer;
    }

    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

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

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getThroughput() {
        return throughput;
    }

    public void setThroughput(String throughput) {
        this.throughput = throughput;
    }

    @Override
    public String toString() {
        return "QosSpec{" + "specs=" + specs + ", availability=" + availability + ", numberOfFailures=" + numberOfFailures + ", consumer=" + consumer + ", links=" + links + ", id=" + id + ", name=" + name + ", delay=" + delay + ", throughput=" + throughput + '}';
    }
}

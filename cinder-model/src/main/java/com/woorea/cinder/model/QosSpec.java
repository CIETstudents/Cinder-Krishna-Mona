package com.woorea.cinder.model;

/**
 * This class shows administrators policy settings.
 * @author Krishna
 * @author Mona.
 */
public class QosSpec {
    
    /**
     * Specifies keys nd value pairs.
     */
    private String specs;

    /**
     * Checks whether availability of the specifications.
     */
    private String availability;

    /**
     * the number of failures in key and value pairs.
     */
    private String numberOfFailures;

    /**
     * the consumer type specified by object.
     */
    private String consumer;

    /**
     * the Quality of Service specifications links.
     */
    private String links;
    
    /**
     * the quality of Service specifications identifier.
     */
    private String id; 
    
    /**
     * the quality of service specifications name.
     */
    private String name;
    
    /**
     * delay specifies value of specifications.
     */
    private String delay;
    
    /**
     * Throughput specifies key for specifications.
     */
    private String throughput;
    
    /**
     * get the key and value pairs.
     * @return specs.
     */
    public String getSpecs() {
        return specs;
    }

    /**
     * set the key and value pairs.
     * @param specs for objects.
     */
    public void setSpecs(String specs) {
        this.specs = specs;
    }

    /**
     * gets available value of the object.
     * @return availability.
     */
    public String getAvailability() {
        return availability;
    }

    /**
     * sets the available value of the object.
     * @param availability as value.
     */
    public void setAvailability(String availability) {
        this.availability = availability;
    }

    /**
     * get the number of failures in receiving key and value pairs.
     * @return number of failures.
     */
    public String getNumberOfFailures() {
        return numberOfFailures;
    }

    /**
     * set the number of failures in receiving key and value pairs.
     * @param numberOfFailures as un received key and value.
     */
    public void setNumberOfFailures(String numberOfFailures) {
        this.numberOfFailures = numberOfFailures;
    }

    /**
     * get the consumer type.
     * @return consumer.
     */
    public String getConsumer() {
        return consumer;
    }

    /**
     * set the consumer type.
     * @param consumer as type.
     */
    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }

    /**
     * get the links in Qos specifications.
     * @return links.
     */
    public String getLinks() {
        return links;
    }

    /**
     * set the links in Qos specifications.
     * @param links as specified links.
     */
    public void setLinks(String links) {
        this.links = links;
    }

    /**
     * get the specification identifier.
     * @return identifier.
     */
    public String getId() {
        return id;
    }

    /**
     * set the specification identifier.
     * @param id as specified identifier.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * get the name of the specifications.
     * @return name.
     */
    public String getName() {
        return name;
    }
    /**
     * set the name of the specification.
     * @param name as QOs specification name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get the delay value.
     * @return delay.
     */
    public String getDelay() {
        return delay;
    }

    /**
     * set the delay
     * @param delay as value.
     */
    public void setDelay(String delay) {
        this.delay = delay;
    }

    /**
     * get the key.
     * @return throughput.
     */
    public String getThroughput() {
        return throughput;
    }

    /**
     * set the throughput.
     * @param throughput as key.
     */
    public void setThroughput(String throughput) {
        this.throughput = throughput;
    }

    /**
     * get object with the quality of Service specifications.
     * @return string.
     */
    @Override
    public String toString() {
        return "QosSpec{" + "specs=" + specs + ", availability=" + availability + ", numberOfFailures="
                + numberOfFailures + ", consumer=" + consumer + ", links=" + links + ", id=" + id + ", name=" + name
                + ", delay=" + delay + ", throughput=" + throughput + '}';
    }
}

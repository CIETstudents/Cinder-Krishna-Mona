package com.woorea.openstack.cinder.model;

/**
 * This class
 *
 * @author Krishna.
 * @author Mona.
 */
public class Limits {
    /**
     * Provides the limit rate.
     */
    private int rate;
    /**
     * have the absolute limit object.
     */
    private int absolute;
    /**
     * Total number of snapshots used.
     */
    private int totalSnapshotsUsed;
    /**
     * Maximum total amount of volumes (GB).
     */
    private int maxTotalVolumeGigabytes;
    /**
     * Total number of GBs used.
     */
    private int totalGigabytesUsed;
    /**
     * Total number of snapshots.
     */
    private int maxTotalSnapshots;
    /**
     * Total number of volumes used.
     */
    private int totalVolumesUsed;
    /**
     * Maximum number of volumes.
     */
    private int maxTotalVolumes;

    /**
     * get the limit rate from SpanShots.
     * @return rate of the limit.
     */
    public int getRate() {
        return rate;
    }

    /**
     * set the rate of limit from snapshot
     * @param rate 
     */
    public void setRate(int rate) {
        this.rate = rate;
    }

    /**
     * get absolute value limit
     * @return absolute value
     */
    public int getAbsolute() {
        return absolute;
    }

    /**
     * it sets the absolute value
     * @param absolute value in integer format.
     */
    public void setAbsolute(int absolute) {
        this.absolute = absolute;
    }

    /**
     * get the total snapshots used in limits class
     * @return total snapshots consumed
     */
    public int getTotalSnapshotsUsed() {
        return totalSnapshotsUsed;
    }

    /**
     * It sets the total consumed snapshots
     * @param totalSnapshotsUsed 
     */
    public void setTotalSnapshotsUsed(int totalSnapshotsUsed) {
        this.totalSnapshotsUsed = totalSnapshotsUsed;
    }

    /**
     * gets the total maximum volume consumed in gigabytes
     * @return maximum total volume in gigabytes
     */
    public int getMaxTotalVolumeGigabytes() {
        return maxTotalVolumeGigabytes;
    }

    /**
     * sets maximum total volume in gigabytes
     * @param maxTotalVolumeGigabytes 
     */
    public void setMaxTotalVolumeGigabytes(int maxTotalVolumeGigabytes) {
        this.maxTotalVolumeGigabytes = maxTotalVolumeGigabytes;
    }

    /**
     * get the total gigabytes used 
     * @return total gigabytes used
     */
    public int getTotalGigabytesUsed() {
        return totalGigabytesUsed;
    }

    /**
     * sets the total gigabytes in int format
     * @param totalGigabytesUsed 
     */
    public void setTotalGigabytesUsed(int totalGigabytesUsed) {
        this.totalGigabytesUsed = totalGigabytesUsed;
    }

    /**
     * get the total maximum snapshots
     * @return maximum total snapshots
     */
    public int getMaxTotalSnapshots() {
        return maxTotalSnapshots;
    }

    /**
     * set maximum total snapshots from snapshot class
     * @param maxTotalSnapshots 
     */
    public void setMaxTotalSnapshots(int maxTotalSnapshots) {
        this.maxTotalSnapshots = maxTotalSnapshots;
    }

    /**
     * get total volume consumed
     * @return total volumes used
     */
    public int getTotalVolumesUsed() {
        return totalVolumesUsed;
    }

    /**
     * set total volumes used in limits class
     * @param totalVolumesUsed 
     */
    public void setTotalVolumesUsed(int totalVolumesUsed) {
        this.totalVolumesUsed = totalVolumesUsed;
    }

    /**
     * get maximum volume in limits class
     * @return maximum total volumes
     */
    public int getMaxTotalVolumes() {
        return maxTotalVolumes;
    }

    /**
     * set maximum total volumes in int format
     * @param maxTotalVolumes 
     */
    public void setMaxTotalVolumes(int maxTotalVolumes) {
        this.maxTotalVolumes = maxTotalVolumes;
    }

    /**
     * get object with limits specifications.
     * @return json to string 
     */
    @Override
    public String toString() {
        return "Limits{" + "rate=" + rate + ", absolute=" + absolute + ", totalSnapshotsUsed=" + totalSnapshotsUsed + ", maxTotalVolumeGigabytes=" + maxTotalVolumeGigabytes + ", totalGigabytesUsed=" + totalGigabytesUsed + ", maxTotalSnapshots=" + maxTotalSnapshots + ", totalVolumesUsed=" + totalVolumesUsed + ", maxTotalVolumes=" + maxTotalVolumes + '}';
    }
}

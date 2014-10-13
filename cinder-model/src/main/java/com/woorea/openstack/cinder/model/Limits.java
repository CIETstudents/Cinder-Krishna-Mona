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
     * 
     * @param rate 
     */
    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getAbsolute() {
        return absolute;
    }

    public void setAbsolute(int absolute) {
        this.absolute = absolute;
    }

    public int getTotalSnapshotsUsed() {
        return totalSnapshotsUsed;
    }

    public void setTotalSnapshotsUsed(int totalSnapshotsUsed) {
        this.totalSnapshotsUsed = totalSnapshotsUsed;
    }

    public int getMaxTotalVolumeGigabytes() {
        return maxTotalVolumeGigabytes;
    }

    public void setMaxTotalVolumeGigabytes(int maxTotalVolumeGigabytes) {
        this.maxTotalVolumeGigabytes = maxTotalVolumeGigabytes;
    }

    public int getTotalGigabytesUsed() {
        return totalGigabytesUsed;
    }

    public void setTotalGigabytesUsed(int totalGigabytesUsed) {
        this.totalGigabytesUsed = totalGigabytesUsed;
    }

    public int getMaxTotalSnapshots() {
        return maxTotalSnapshots;
    }

    public void setMaxTotalSnapshots(int maxTotalSnapshots) {
        this.maxTotalSnapshots = maxTotalSnapshots;
    }

    public int getTotalVolumesUsed() {
        return totalVolumesUsed;
    }

    public void setTotalVolumesUsed(int totalVolumesUsed) {
        this.totalVolumesUsed = totalVolumesUsed;
    }

    public int getMaxTotalVolumes() {
        return maxTotalVolumes;
    }

    public void setMaxTotalVolumes(int maxTotalVolumes) {
        this.maxTotalVolumes = maxTotalVolumes;
    }

    @Override
    public String toString() {
        return "Limits{" + "rate=" + rate + ", absolute=" + absolute + ", totalSnapshotsUsed=" + totalSnapshotsUsed + ", maxTotalVolumeGigabytes=" + maxTotalVolumeGigabytes + ", totalGigabytesUsed=" + totalGigabytesUsed + ", maxTotalSnapshots=" + maxTotalSnapshots + ", totalVolumesUsed=" + totalVolumesUsed + ", maxTotalVolumes=" + maxTotalVolumes + '}';
    }
}

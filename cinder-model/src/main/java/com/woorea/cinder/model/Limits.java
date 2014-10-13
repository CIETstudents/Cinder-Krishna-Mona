
package com.woorea.cinder.model;

/**
 * This class
 * @author Krishna
 * @author Mona
 */
public class Limits {

    private int rate;

    private int absolute;

    private int totalSnapshotsUsed;

    private int maxTotalVolumeGigabytes;

    private int totalGigabytesUsed;

    private int maxTotalSnapshots;

    private int totalVolumesUsed;

    private int maxTotalVolumes;

    public int getRate() {
        return rate;
    }

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

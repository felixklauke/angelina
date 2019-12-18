package de.felixklauke.angelina.client.model;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class NodeData {

    private String id;

    private String level;
    private String type;
    private String status;

    private long disk;
    @SerializedName("maxdisk")
    private long maxDisk;

    @SerializedName("ssl_fingerprint")
    private String sslFingerprint;
    private String node;

    private double cpu;
    @SerializedName("maxcpu")
    private double maxCPU;

    @SerializedName("mem")
    private long memory;
    @SerializedName("maxmem")
    private long maxMemory;

    private int uptime;
}
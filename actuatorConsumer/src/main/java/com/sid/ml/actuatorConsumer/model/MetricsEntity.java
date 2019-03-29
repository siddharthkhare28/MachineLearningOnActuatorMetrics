package com.sid.ml.actuatorConsumer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity(name = "metrics_entity")
@Table(name = "metrics_entity")
public class MetricsEntity {
	
	@Id  
    @GeneratedValue
	private Integer id; 
	private String mem;
	@JsonProperty("mem.free")
	private String memFree;
	private String processors;
	@JsonProperty("instance.uptime")
	private String instanceUptime;
	private String uptime;
	@JsonProperty("systemload.average")
	private String systemloadAverage;
	@JsonProperty("heap.committed")
	private String heapCommitted;
	@JsonProperty("heap.init")
	private String heapInit;
	@JsonProperty("heap.used")
	private String heapUsed;
	private String heap;
	
	@JsonProperty("nonheap.committed")
	private String nonheapCommitted;
	@JsonProperty("nonheap.init")
	private String nonheapInit;
	@JsonProperty("nonheap.used")
	private String nonheapUsed;
	private String nonheap;
	
	@JsonProperty("threads.peak")
	private String threadsPeak;
	@JsonProperty("threads.totalStarted")
	private String threadsTotalStarted;
	private String threads;
	
	private String classes;
	@JsonProperty("classes.loaded")
	private String classesLoaded;
	@JsonProperty("classes.unloaded")
	private String classesUnloaded;
	
	@JsonProperty("gc.ps_scavenge.count")
	private String gcPsScavengeCount;
	@JsonProperty("gc.ps_scavenge.time")
	private String gcPsScavengeTime;
	
	public String getProcessors() {
		return processors;
	}
	public void setProcessors(String processors) {
		this.processors = processors;
	}
	public String getInstanceUptime() {
		return instanceUptime;
	}
	public void setInstanceUptime(String instanceUptime) {
		this.instanceUptime = instanceUptime;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public String getSystemloadAverage() {
		return systemloadAverage;
	}
	public void setSystemloadAverage(String systemloadAverage) {
		this.systemloadAverage = systemloadAverage;
	}
	public String getHeapCommitted() {
		return heapCommitted;
	}
	public void setHeapCommitted(String heapCommitted) {
		this.heapCommitted = heapCommitted;
	}
	public String getHeapInit() {
		return heapInit;
	}
	public void setHeapInit(String heapInit) {
		this.heapInit = heapInit;
	}
	public String getHeapUsed() {
		return heapUsed;
	}
	public void setHeapUsed(String heapUsed) {
		this.heapUsed = heapUsed;
	}
	public String getHeap() {
		return heap;
	}
	public void setHeap(String heap) {
		this.heap = heap;
	}
	public String getNonheapCommitted() {
		return nonheapCommitted;
	}
	public void setNonheapCommitted(String nonheapCommitted) {
		this.nonheapCommitted = nonheapCommitted;
	}
	public String getNonheapInit() {
		return nonheapInit;
	}
	public void setNonheapInit(String nonheapInit) {
		this.nonheapInit = nonheapInit;
	}
	public String getNonheapUsed() {
		return nonheapUsed;
	}
	public void setNonheapUsed(String nonheapUsed) {
		this.nonheapUsed = nonheapUsed;
	}
	public String getNonheap() {
		return nonheap;
	}
	public void setNonheap(String nonheap) {
		this.nonheap = nonheap;
	}
	public String getThreadsPeak() {
		return threadsPeak;
	}
	public void setThreadsPeak(String threadsPeak) {
		this.threadsPeak = threadsPeak;
	}
	public String getThreadsTotalStarted() {
		return threadsTotalStarted;
	}
	public void setThreadsTotalStarted(String threadsTotalStarted) {
		this.threadsTotalStarted = threadsTotalStarted;
	}
	public String getThreads() {
		return threads;
	}
	public void setThreads(String threads) {
		this.threads = threads;
	}
	public String getClasses() {
		return classes;
	}
	public void setClasses(String classes) {
		this.classes = classes;
	}
	public String getClassesLoaded() {
		return classesLoaded;
	}
	public void setClassesLoaded(String classesLoaded) {
		this.classesLoaded = classesLoaded;
	}
	public String getClassesUnloaded() {
		return classesUnloaded;
	}
	public void setClassesUnloaded(String classesUnloaded) {
		this.classesUnloaded = classesUnloaded;
	}
	public String getGcPsScavengeCount() {
		return gcPsScavengeCount;
	}
	public void setGcPsScavengeCount(String gcPsScavengeCount) {
		this.gcPsScavengeCount = gcPsScavengeCount;
	}
	public String getGcPsScavengeTime() {
		return gcPsScavengeTime;
	}
	public void setGcPsScavengeTime(String gcPsScavengeTime) {
		this.gcPsScavengeTime = gcPsScavengeTime;
	}
	public String getGcPsMarksweepCount() {
		return gcPsMarksweepCount;
	}
	public void setGcPsMarksweepCount(String gcPsMarksweepCount) {
		this.gcPsMarksweepCount = gcPsMarksweepCount;
	}
	public String getGcPsMarksweepTime() {
		return gcPsMarksweepTime;
	}
	public void setGcPsMarksweepTime(String gcPsMarksweepTime) {
		this.gcPsMarksweepTime = gcPsMarksweepTime;
	}
	public String getHttpsessionsMax() {
		return httpsessionsMax;
	}
	public void setHttpsessionsMax(String httpsessionsMax) {
		this.httpsessionsMax = httpsessionsMax;
	}
	public String getHttpsessionsActive() {
		return httpsessionsActive;
	}
	public void setHttpsessionsActive(String httpsessionsActive) {
		this.httpsessionsActive = httpsessionsActive;
	}
	public String getGaugeResponseTest() {
		return gaugeResponseTest;
	}
	public void setGaugeResponseTest(String gaugeResponseTest) {
		this.gaugeResponseTest = gaugeResponseTest;
	}
	@JsonProperty("gc.ps_marksweep.count")
	private String gcPsMarksweepCount;
	@JsonProperty("gc.ps_marksweep.time")
	private String gcPsMarksweepTime;

	@JsonProperty("httpsessions.max")
	private String httpsessionsMax;
	@JsonProperty("httpsessions.active")
	private String httpsessionsActive;
	
	@JsonProperty("gauge.response.test")
	private String gaugeResponseTest;
	
	@JsonProperty("counter.status.200.test")
	private String counterStatus200Test;
	@JsonProperty("counter.status.500.test")
	private String counterStatus500Test;
	
	public String getCounterStatus200Test() {
		return counterStatus200Test;
	}
	public void setCounterStatus200(String counterStatus200Test) {
		this.counterStatus200Test = counterStatus200Test;
	}
	public String getCounterStatus500Test() {
		return counterStatus500Test;
	}
	public void setCounterStatus500(String counterStatus500Test) {
		this.counterStatus500Test = counterStatus500Test;
	}
	public String getMem() {
		return mem;
	}
	public void setMem(String mem) {
		this.mem = mem;
	}
	public String getMemFree() {
		return memFree;
	}
	public void setMemFree(String memFree) {
		this.memFree = memFree;
	}

}

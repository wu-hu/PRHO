/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package com.thinkgem.jeesite.modules.prho.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import com.thinkgem.jeesite.common.persistence.DataEntity;

/**
 * 项目任务Entity
 * @author zhl
 * @version 2017-05-12
 */
public class PrhoProjectTask extends DataEntity<PrhoProjectTask> {
	
	private static final long serialVersionUID = 1L;
	private String projectId;		// 项目id
	private String taskmanager;		// 任务负责人
	private String taskname;		// 任务名称
	private Date tastplanbegintime;		// 计划开始时间
	private Date taskplanendtime;		// 计划结束时间
	private String expectedhour;		// 预计用时 decimal
	private String taskcompleteschedule;		// 任务完成进度
	private String taskstatus;		// 任务完成进度
	private PrhoProjectInfo prhoProjectInfo;  //项目信息对象
	public PrhoProjectTask() {
		super();
	}

	public PrhoProjectTask(String id){
		super(id);
	}

	@Length(min=0, max=64, message="项目id长度必须介于 0 和 64 之间")
	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	
	@Length(min=0, max=200, message="任务负责人长度必须介于 0 和 200 之间")
	public String getTaskmanager() {
		return taskmanager;
	}

	public void setTaskmanager(String taskmanager) {
		this.taskmanager = taskmanager;
	}
	
	@Length(min=0, max=200, message="任务名称长度必须介于 0 和 200 之间")
	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getTastplanbegintime() {
		return tastplanbegintime;
	}

	public void setTastplanbegintime(Date tastplanbegintime) {
		this.tastplanbegintime = tastplanbegintime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getTaskplanendtime() {
		return taskplanendtime;
	}

	public void setTaskplanendtime(Date taskplanendtime) {
		this.taskplanendtime = taskplanendtime;
	}
	
	public String getExpectedhour() {
		return expectedhour;
	}

	public void setExpectedhour(String expectedhour) {
		this.expectedhour = expectedhour;
	}
	
	@Length(min=0, max=50, message="任务完成进度长度必须介于 0 和 50 之间")
	public String getTaskcompleteschedule() {
		return taskcompleteschedule;
	}

	public void setTaskcompleteschedule(String taskcompleteschedule) {
		this.taskcompleteschedule = taskcompleteschedule;
	}
	@Length(min=0, max=64, message="任务状态长度必须介于 0 和 64之间")
	public String getTaskstatus() {
		return taskstatus;
	}

	public void setTaskstatus(String taskstatus) {
		this.taskstatus = taskstatus;
	}

	public PrhoProjectInfo getPrhoProjectInfo() {
		return prhoProjectInfo;
	}

	public void setPrhoProjectInfo(PrhoProjectInfo prhoProjectInfo) {
		this.prhoProjectInfo = prhoProjectInfo;
	}
	
}
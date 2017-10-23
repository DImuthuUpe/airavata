package org.apache.airavata.k8s.api.server.model.task;

import org.apache.airavata.k8s.api.server.model.commons.ErrorModel;
import org.apache.airavata.k8s.api.server.model.job.JobModel;
import org.apache.airavata.k8s.api.server.model.process.ProcessModel;

import javax.persistence.*;
import java.nio.ByteBuffer;
import java.util.List;

/**
 * TODO: Class level comments please
 *
 * @author dimuthu
 * @since 1.0.0-SNAPSHOT
 */
@Entity
@Table(name = "TASK_MODEL")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private TaskTypes taskType; // required

    @ManyToOne
    private ProcessModel parentProcess; // required

    private long creationTime; // required
    private long lastUpdateTime; // required

    @OneToMany
    private List<TaskStatus> taskStatuses; // required

    private String taskDetail; // optional

    @OneToMany
    private List<ErrorModel> taskErrors; // optional

    @OneToMany
    private List<JobModel> jobs; // optional

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public TaskTypes getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskTypes taskType) {
        this.taskType = taskType;
    }

    public ProcessModel getParentProcess() {
        return parentProcess;
    }

    public void setParentProcess(ProcessModel parentProcess) {
        this.parentProcess = parentProcess;
    }

    public long getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(long creationTime) {
        this.creationTime = creationTime;
    }

    public long getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(long lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public List<TaskStatus> getTaskStatuses() {
        return taskStatuses;
    }

    public void setTaskStatuses(List<TaskStatus> taskStatuses) {
        this.taskStatuses = taskStatuses;
    }

    public String getTaskDetail() {
        return taskDetail;
    }

    public void setTaskDetail(String taskDetail) {
        this.taskDetail = taskDetail;
    }

    public List<ErrorModel> getTaskErrors() {
        return taskErrors;
    }

    public void setTaskErrors(List<ErrorModel> taskErrors) {
        this.taskErrors = taskErrors;
    }

    public List<JobModel> getJobs() {
        return jobs;
    }

    public void setJobs(List<JobModel> jobs) {
        this.jobs = jobs;
    }

    public enum TaskTypes {
        ENV_SETUP(0),
        DATA_STAGING(1),
        JOB_SUBMISSION(2),
        ENV_CLEANUP(3),
        MONITORING(4),
        OUTPUT_FETCHING(5);

        private final int value;

        private TaskTypes(int value) {
            this.value = value;
        }
    }

}

package pl.tls.mb;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.SelectEvent;
import org.springframework.stereotype.Component;
import pl.tls.model.Job;
import pl.tls.model.JobDataModel;

@Component
@ManagedBean
//@ViewScoped
@RequestScoped
//@Scope("prototype")
public class Home extends AbstractPage implements Serializable {

    private JobDataModel jobDataModel;
    private Job selectedJob;

    @Override
    public String getPageTitle() {
        return PageInfo.HOME.getTitle();
    }

    public void init() {
        System.out.println("init");
        List<Job> jobs = new ArrayList<>();
        for (long i = 0; i < 10; i++) {
            Job job = new Job();
            job.setId(i);
            job.setStatus("status: " + i);
            job.setName("name: " + i);
            job.setDescr("descr: " + i);
            jobs.add(job);
        }

        jobDataModel = new JobDataModel(jobs);
        selectedJob = null;
    }

    public Home() {
        System.out.println("Home constructor");
    }

//    public List getJobsWithErrors() {
//        System.out.println("getJobsWithErrors");
//
//        return jobs;
//    }
    public JobDataModel getJobDataModel() {
        return jobDataModel;
    }

    public Job getSelectedJob() {
        return selectedJob;
    }

    public void setSelectedJob(Job selectedJob) {
        this.selectedJob = selectedJob;
    }

    public void onRowSelect(SelectEvent event) {
        FacesMessage msg = new FacesMessage("Job Selected", ((Job) event.getObject()).getName());

        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public void update() {
        System.out.println("update");
        jobDataModel = new JobDataModel(null);
//        selectedJob = null;
    }
}

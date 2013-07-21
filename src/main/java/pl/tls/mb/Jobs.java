package pl.tls.mb;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import org.springframework.stereotype.Component;
import pl.tls.model.Job;

@Component
@ManagedBean(name = "jobs")
public class Jobs extends AbstractPage {

    public Jobs() {
    }

    public List getJobsWithErrors() {
        List<Job> jobs = new ArrayList<>();
        for (long i = 0; i < 10; i++) {
            Job job = new Job();
            job.setId(i);
            job.setStatus("status: " + i);
            job.setName("name: " + i);
            job.setDescr("descr: " + i);
            jobs.add(job);
        }

        return jobs;
    }

    @Override
    public String getPageTitle() {
        return PageInfo.JOBS.getTitle();
    }
}

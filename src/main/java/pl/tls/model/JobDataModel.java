/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tls.model;

import java.util.List;
import javax.faces.model.ListDataModel;
import org.primefaces.model.SelectableDataModel;

/**
 *
 * @author tomek
 */
public class JobDataModel extends ListDataModel<Job> implements SelectableDataModel<Job> {

    public JobDataModel() {
    }

    public JobDataModel(List<Job> data) {
        super(data);
    }

    @Override
    public Job getRowData(String rowKey) {
        //In a real app, a more efficient way like a query by rowKey should be implemented to deal with huge data

        List<Job> jobs = (List<Job>) getWrappedData();

        for (Job job : jobs) {
            if (job.getId().equals(Long.valueOf(rowKey))) {
                return job;
            }
        }

        return null;
    }

    @Override
    public Long getRowKey(Job job) {
        return job.getId();
    }
}

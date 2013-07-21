/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tls.mb;

import java.util.Arrays;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author tlenczyk
 */
@ManagedBean
@ApplicationScoped
public class Menu {

    public List<PageInfo> getItems() {
        return Arrays.asList(PageInfo.values());
    }

    public String getItemTitle(String viewId) {
        return PageInfo.fromViewId(viewId);
    }
}

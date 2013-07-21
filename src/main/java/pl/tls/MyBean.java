/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.tls;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author tomek
 */
@ManagedBean
@RequestScoped
public class MyBean {

    /**
     * Creates a new instance of MyBean
     */
    public MyBean() {
    }

    public String hello() {
        return "Hello";
    }
}

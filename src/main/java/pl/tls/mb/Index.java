package pl.tls.mb;

import javax.faces.bean.ManagedBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@ManagedBean(name = "index")
public class Index {

    @Autowired
    private MyService myService;

    public Index() {
    }

    public String moveToHome() {
        return "home";
    }

    public String getHello() {
        return "helloa " + myService.getName();
    }

    public MyService getMyService() {
        return myService;
    }

    public void setMyService(MyService myService) {
        this.myService = myService;
    }
}

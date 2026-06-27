
package com.BryanBecerra.AppletRedux;

import com.BryanBecerra.AppletRedux.enums.Status;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION)

public class houseBuilding {
    private Status door;
    private Status[] windows = new Status[2];

    public houseBuilding() {
        this.door = Status.OPEN;
        this.windows[0] = Status.OPEN;
        this.windows[1] = Status.OPEN;
    }

    public void setDoor() {
        if (door == Status.OPEN) { 
            door = Status.CLOSED;
        } else {
            door = Status.OPEN;
        }
    }
    
    public String getDoor(){
        if (this.door == Status.OPEN) {
            return "<a hx-post=\"/door\"><img src=\"doorOpen.png\" style=\"width:10%\"></a>";
        } else {
            return "<a hx-post=\"/door\"><img src=\"doorClosed.png\" style=\"width:10%\"></a>";
        }
    }

    public void setWindow(int whichOne) {
        if (windows[whichOne] == Status.OPEN) { 
            this.windows[whichOne] = Status.CLOSED;
        } else {
            this.windows[whichOne] = Status.OPEN;
        }
    }
    
    public String getWindow(int whichOne){
        if (this.windows[whichOne] == Status.OPEN) {
            return "<a hx-post=\"/window\" hx-vals='{\"whichOne\":\"1\"}'><img src=\"windowOpen.png\"></a>";
        } else {
            return "<a hx-post=\"/window\" hx-vals='{\"whichOne\":\"1\"}'><img src=\"windowClosed.png\"></a>";
        }
    }
    
    

    @Override
    public String toString() {
        return "houseBuilding{" + "door=" + door + ", windows=" + windows + '}';
    }
    
    
}

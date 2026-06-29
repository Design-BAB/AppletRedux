
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
    
    public String getDoor(){
        //first we set the door
        if (door == Status.OPEN) { 
            door = Status.CLOSED;
        } else {
            door = Status.OPEN;
        }
        //then return it
        if (this.door == Status.OPEN) {
            return "<img src=\"doorOpen.png\">";
        } else {
            return "<img src=\"doorClosed.png\">";
        }
    }
    
    public String getWindow(int whichOne){
        //first we set the window
        if (windows[whichOne] == Status.OPEN) { 
            this.windows[whichOne] = Status.CLOSED;
        } else {
            this.windows[whichOne] = Status.OPEN;
        }
        //then we return it
        if (this.windows[whichOne] == Status.OPEN) {
            return "<img src=\"windowOpen.png\">";
        } else {
            return "<img src=\"windowClosed.png\">";
        }
    }

    @Override
    public String toString() {
        return "houseBuilding{" + "door=" + door + ", windows=" + windows + '}';
    }
    
    
}

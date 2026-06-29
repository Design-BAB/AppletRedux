//Author: Design-BAB
package com.BryanBecerra.AppletRedux;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.BryanBecerra.AppletRedux.enums.Status;


@Controller
public class WebController {
    
    final private houseBuilding home = new houseBuilding();
    
    @GetMapping("/")
    public String index() {
        return "followMe";
    }

    @PostMapping("/mouseMove")
    @ResponseBody
    public ResponseEntity<String> mouseMove(@RequestParam int x, @RequestParam int y) {
        var iSayHello = new sayHello(x, y);
        return ResponseEntity.ok(iSayHello.now());
    }
    
    @PostMapping("/door")
    @ResponseBody
    public String door() {
        return home.getDoor();
    }
    
    @PostMapping("/window")
    @ResponseBody
    public String window(@RequestParam Integer whichOne) {
        return home.getWindow(whichOne);
    }
    
}
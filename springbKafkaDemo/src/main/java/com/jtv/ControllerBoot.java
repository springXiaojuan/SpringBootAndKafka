package com.jtv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerBoot {
	
	@Autowired
    private Sender sender;

    @RequestMapping("/send/{msg}")
    public String send(@PathVariable("msg") String msg) {
    	System.out.println("msg = " + msg);
        sender.send(msg);
        return msg;
    }


}

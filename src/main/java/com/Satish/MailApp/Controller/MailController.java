package com.Satish.MailApp.Controller;

import com.Satish.MailApp.Model.MailStructure;
import com.Satish.MailApp.Service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {
    @Autowired
    private MailService mailService;
    @PostMapping("/send/{mail}")
    public String sendMail(@PathVariable String mail, @RequestBody MailStructure mailStructure){
        mailService.sendMail(mail,mailStructure);
        return "Successfully send the mail";
    }
}

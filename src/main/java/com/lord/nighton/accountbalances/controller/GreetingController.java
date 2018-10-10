package com.lord.nighton.accountbalances.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping(value = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Data greeting(Model model) {
        Data data = new Data();

        data.setId("id");
        data.setCitizenship("Ukraine");
        data.setName("Rodnoi");
        data.setSsn("123-123-1231");
        data.setSurname("Allo");

        return data;
    }

}
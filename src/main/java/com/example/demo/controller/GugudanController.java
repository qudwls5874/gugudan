package com.example.demo.controller;

import com.example.demo.domain.Gugudan;
import org.springframework.web.bind.annotation.*;

@RestController
public class GugudanController {

    @RequestMapping(value = "/gugudan")
    public Gugudan gugudan(@RequestParam String dan, String value){

        Gugudan gugudan = null;

        try {

            Integer intDan = Integer.parseInt(dan);
            Integer inValue = Integer.parseInt(value);

            gugudan = new Gugudan(Integer.valueOf(intDan), Integer.valueOf(inValue));

        } catch (NumberFormatException ex){
            //ex.printStackTrace();
            gugudan = new Gugudan("입력한 데이터가 잘못되었습니다.");
        }

        return gugudan;
    }

}

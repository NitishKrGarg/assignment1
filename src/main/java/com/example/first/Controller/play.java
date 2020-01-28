package com.example.first.Controller;

import com.example.first.Match_Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class play {

    @RequestMapping("/CricketGame")
    public Match_Controller generateResult()
    {
        Match_Controller ob = new Match_Controller();
        return ob.start();
    }


//    @GetMapping("/CricketGame/{abc}")
//    public Match_Controller tempGet(@PathVariable("abc") String abc)
//            @RequestParam("") Str
//
//    {]
//
//    }

}

package app.controller;

import app.model.RequestObject;
import app.model.ResponseObject;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
public class BasicController {

    @RequestMapping(value = "/endpoint", method = RequestMethod.POST)
    public ResponseObject getSomeObject(@RequestBody RequestObject obj, HttpServletRequest request) {
        return new ResponseObject(obj.getInstance(), request.getRemoteAddr());
    }
}

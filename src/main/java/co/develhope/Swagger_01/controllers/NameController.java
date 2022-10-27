package co.develhope.Swagger_01.controllers;

import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class NameController {
    @RestController
    @RequestMapping("/name")
    public class nameController {

        @GetMapping(value = "/name/{name}")
        public String  name(@ApiParam(value = "the id of the user")@PathVariable()  String name) {
            return "Welcome "+name;
        }
    }
}

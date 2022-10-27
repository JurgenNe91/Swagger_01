package co.develhope.Swagger_01.controllers;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {


    @GetMapping(value = "/{name}")
    public String  welcomeWithNamePath(@ApiParam(value = "the name of the user")@PathVariable()  String name) {
        return "Welcome "+name;
    }
}


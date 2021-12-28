/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class HomeController {
    
    //value="/index" -> peticion del cliente http://localhost:8090/idat/index
    //method=RequestMethod.GET -> leer la peticion http://localhost:8090/idat/index
    //return "index"; -> el controlador imprime la pagina index.jsp
    
    @RequestMapping(value="/index",method = RequestMethod.GET)
    public String index_GET(){
        return "index";
    }
    
}

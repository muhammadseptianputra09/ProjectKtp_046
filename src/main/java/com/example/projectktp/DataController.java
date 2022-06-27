/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.projectktp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.crypto.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Unang
 */
@Controller 
public class DataController {
    
    
    DataJpaController datactrl = new DataJpaController();
    Data newdata = new Data();
    
            
    @RequestMapping("/main")
    public String getMain (){
        return "menu"; 
    }
    @RequestMapping("/data")
    public String getDataKTP() {
        
        try {newdata = datactrl.findDataEntities(0, 0);
        }
        catch (){}
        
        return "database";
        
    }    
    
    @RequestMapping("/edit")
    public String doEdit(){
        return "editktp";
        
    }
    
    
    
}
  

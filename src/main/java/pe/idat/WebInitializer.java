/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.idat;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    //Metodo que indica la configuracion
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    //Metodo que indica la lectura por "/"
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    
}

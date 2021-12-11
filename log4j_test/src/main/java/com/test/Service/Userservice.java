package com.test.Service;

import com.test.config.Userconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.font.TrueTypeFont;

import javax.annotation.Resource;

@Service
public class Userservice {
    @Resource
    private Userconfig userconfig;

    public boolean login(String name,String pwd){
        String username = userconfig.getUsername();
        String password = userconfig.getPassword();
        if(username.equals(name) && pwd.equals(password)){
            return true;
        }

        return false;
    }
}

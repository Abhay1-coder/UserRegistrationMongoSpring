package com.pratice.registeruser.Controllers;

import com.pratice.registeruser.DB.UserRepo;
import com.pratice.registeruser.Model.AuthModel;
import com.pratice.registeruser.Model.User;
import com.pratice.registeruser.response.response;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class UserController {
    @Autowired 
    JavaMailSender javaMailSender;

    @Autowired
    UserRepo userRepo;

    @PostMapping("/register")
    public response addUser(@RequestBody User user){
        if(userRepo.count()>0){
            List<User>list =userRepo.findAll();
            for (User usr : list) {
                if(usr.getEmail().equals(user.getEmail())){
                    return new response(400, "alread exit",user);
                } 
            }
        }

        Random r = new Random();
        String s = String.format("%04d", r.nextInt(1000));
        SimpleMailMessage msg= new SimpleMailMessage();
        msg.setTo(user.getEmail());
        user.setUid(UUID.randomUUID().toString());
        userRepo.insert(user);

        msg.setSubject("Authentiation code");
        msg.setText("hello i am here to check my program is running fine or not . thabku!, your code is" +s);
        try{
            javaMailSender.send(msg);
            return new response(200, "registered sucessfully", user);
        }catch(Exception e){
            return new response(404, "error",null);

        }
    }
    @PostMapping("/login")
    public response userLogin(@RequestBody AuthModel authModel){
        if(userRepo.count()>0){
           List<User> list= userRepo.findAll();
           for (User u : list) {
               if(u.getEmail().equals(authModel.getEmail()) && u.getPassword().equals(authModel.getPassword())){
                   return new response(200, "login sucess", u);
               }
               
               
           }
        }
        return new response(404, "no user in db", authModel);
    }
    
}

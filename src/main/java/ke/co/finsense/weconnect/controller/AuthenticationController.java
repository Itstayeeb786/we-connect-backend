package ke.co.finsense.weconnect.controller;

import ke.co.finsense.weconnect.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {
    @PostMapping("/register")
    public void register (@RequestBody User user) {

    }

    @PostMapping("/login")
    public User login () {
        return null;
    }

    @PostMapping("/logout")
    public void logout () {

    }

    @PostMapping("/reset-password")
    public void resetPassword () {

    }

}

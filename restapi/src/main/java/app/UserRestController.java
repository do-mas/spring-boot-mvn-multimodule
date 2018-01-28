package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import service.UserService;


@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "user/{userId}", method = RequestMethod.GET)
    public String getAuthenticatedUser(@PathVariable Long userId) {
        return userService.getUserName(userId);
    }

}

package guru.aguilar.demo.repositories.flux;


import guru.aguilar.demo.domain.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

interface UserFluxSample {
    Flux<User> getAllUsers();
}

//@Service
@Component
public class UserFlux implements UserFluxSample {

    private Map<Integer,User> users = null;

    public UserFlux(){
        users = Map.of(1,new User("AAA","AAA"),2,new User("AAA","AAA"),3,new User("AAA","AAA"));
    }

    @Override
    public Flux<User> getAllUsers() {
        return Flux.fromIterable(users.values());
    }

    public Map<Integer,User> getMap(){ return users; }

    public List<User> getList(){
        List<User> lst = new ArrayList<>();
        lst.addAll(users.values());
        return lst;
    }

}

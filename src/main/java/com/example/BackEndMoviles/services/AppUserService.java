package com.example.BackEndMoviles.services;

import org.springframework.stereotype.Service;

import com.example.BackEndMoviles.domain.AppUser;
import com.example.BackEndMoviles.security.ApplicationUserRol;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


//nos planteamos codificar el password aqui
@Service
public class AppUserService {
    public List<AppUser> getUsers() {
		return users;
	}
	private List<AppUser> users;

    @PostConstruct
    private void doing(){
        users=new ArrayList<>();
        users.add(new AppUser(1L,"luis","123"));
        users.add(new AppUser(2L,"Jose","321"));
        addRoleToUser("luis",ApplicationUserRol.ADMIN.name());
        addRoleToUser("Jose", ApplicationUserRol.GUEST.name());
    }
    public void addRoleToUser(String username,String role){
            findUserByUsername(username).ifPresent((a)->a.addRole(role));
    }
    private Optional<AppUser> findUserByUsername(String username){
        return users.stream().filter((a)->a.getUsername().equals(username)).findFirst();

    }
}

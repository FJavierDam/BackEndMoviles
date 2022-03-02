package com.example.BackEndMoviles.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BackEndMoviles.domain.AppUser;
import com.example.BackEndMoviles.modelo.Movil;
import com.example.BackEndMoviles.repositories.AppUserRepository;
import com.example.BackEndMoviles.security.ApplicationUserRol;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;


//nos planteamos codificar el password aqui
@Service
public class AppUserService {
	
	@Autowired
	AppUserRepository appUserRepository;
    
	private Set<AppUser> users;

    @PostConstruct
    private void doing(){
        users=new HashSet<>();
        Iterable<AppUser> findAll = appUserRepository.findAll();
        rellenarUsuarios(findAll);
//        users.add(new AppUser(1L,"luis","123"));
//        users.add(new AppUser(2L,"Jose","321"));
//        addRoleToUser("luis",ApplicationUserRol.ADMIN.name());
//        addRoleToUser("Jose", ApplicationUserRol.GUEST.name());
    }
    
    public AppUserService() {
    	 users=new HashSet<>();
    }
    
    public void rellenarUsuarios(Iterable<AppUser> findAll) {
		findAll.forEach((a)->{users.add(a);});
	}
    
    public HashSet<AppUser> getAllUsers(){
		return (HashSet<AppUser>) this.users;
	}
    
    public Set<AppUser> encontrarUser(String username, String password){
    	Set<AppUser> userEncontrado = new HashSet<AppUser>();
    	userEncontrado.add(this.getAllUsers().stream().filter((a)-> a.getUsername().equals(username)).findFirst().get());
    	userEncontrado.add(this.getAllUsers().stream().filter((a)-> a.getPassword().equals(password)).findFirst().get());
		
		return userEncontrado;
	}
    
    public Set<AppUser> getUsers() {
		return users;
	}
    public void addRoleToUser(String username,String role){
            findUserByUsername(username).ifPresent((a)->{
            	a.addRole(role);
            	});
    }
    private Optional<AppUser> findUserByUsername(String username){
        return users.stream().filter((a)->a.getUsername().equals(username)).findFirst();

    }
    
    public void addUserToList(AppUser appUser) {
        this.getUsers().add(appUser);
    }
}

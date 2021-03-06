package com.juniorAssociate.RSI.lifeJacket.Services;

import com.juniorAssociate.RSI.lifeJacket.Entities.Role;
import com.juniorAssociate.RSI.lifeJacket.Repositories.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public void saveAllRoles(){
        List<Role> steps = roleRepository.findAll();
        roleRepository.saveAll(steps);
    }
    public List<Role> findAllRole(){
        return roleRepository.findAll();
    }
    public Role findByID(String id){
        return roleRepository.findByRole(id);
    }
    public void deleteRole(String id){
        roleRepository.deleteById(id);
    }
    public void saveRole(String id){
        Role role = roleRepository.findByRole(id);
        roleRepository.save(role);
    }
}

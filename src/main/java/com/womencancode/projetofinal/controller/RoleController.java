package com.womencancode.projetofinal.controller;
import com.womencancode.projetofinal.model.Role;
import com.womencancode.projetofinal.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "/role", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

public class RoleController {

    private RoleService service;

    public RoleController (@Autowired RoleService service){this.service = service;}

  @PostMapping
  public ResponseEntity <Role> insertRole (@RequestBody Role role) throws Exception {
        return ResponseEntity.ok(service.insertRole (role));
  }

}

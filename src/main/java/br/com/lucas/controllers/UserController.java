package br.com.lucas.controllers;

import br.com.lucas.entities.User;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {

    private JPAStreamer streamer;

    public UserController(JPAStreamer streamer) {
        this.streamer = streamer;
    }

    @GetMapping
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(streamer.stream(User.class).collect(Collectors.toList()));
    }
}

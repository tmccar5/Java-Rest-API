package tom.streamdemo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tom.streamdemo.exception.LiveStreamNotFoundException;
import tom.streamdemo.model.LiveStream;
import tom.streamdemo.repository.LiveStreamRepository;

import java.util.List;

@RestController
@RequestMapping("/streams")
public class LiveStreamController {

    private final LiveStreamRepository repository;

    public LiveStreamController(LiveStreamRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<LiveStream> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public LiveStream findById(@PathVariable String id) throws LiveStreamNotFoundException {
        return repository.findById(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public LiveStream create(@RequestBody LiveStream stream) {
        return repository.create(stream);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping
    public LiveStream update(@RequestBody LiveStream stream, @PathVariable String id) {
        repository.update(stream, id);
        return null;
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public LiveStream delete(@PathVariable String id) {
        repository.delete(id);
        return null;
    }
}

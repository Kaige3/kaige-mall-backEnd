package kaigee.top.user.controller;

import kaigee.top.infrastructure.model.QueryRequest;
import kaigee.top.user.entity.User;
import kaigee.top.user.entity.dto.UserInput;
import kaigee.top.user.entity.dto.UserSpec;
import kaigee.top.user.repository.UserRepository;
import kaigee.top.user.service.UserService;
import lombok.AllArgsConstructor;
import org.babyfish.jimmer.client.FetchBy;
import org.babyfish.jimmer.client.meta.DefaultFetcherOwner;
import org.springframework.data.domain.Page;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@AllArgsConstructor
@DefaultFetcherOwner(UserRepository.class)
public class UserController {
    private final UserService userService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") User findById(@PathVariable String id) {
        return userService.findById(id);
    }

    @PostMapping("query")
    public Page<@FetchBy(value = "COMPLEX_FETCHER") User> query(@RequestBody QueryRequest<UserSpec> queryRequest) {
        return userService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated UserInput user) {
        return userService.save(user);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return userService.delete(ids);
    }
}
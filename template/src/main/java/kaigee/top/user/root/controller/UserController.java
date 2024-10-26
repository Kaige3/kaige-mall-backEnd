package kaigee.top.user.root.entity.controller;
import kaigee.top.user.root.entity.User;

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
    public Page< @FetchBy(value = "COMPLEX_FETCHER") User> query(@RequestBody QueryRequest<UserSpec> queryRequest) {
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
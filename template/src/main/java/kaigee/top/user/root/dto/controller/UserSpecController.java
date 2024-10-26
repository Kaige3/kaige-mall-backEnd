package kaigee.top.user.root.entity.dto.controller;
import kaigee.top.user.root.entity.dto.UserSpec;

@RestController
@RequestMapping("userSpec")
@AllArgsConstructor
@DefaultFetcherOwner(UserSpecRepository.class)
public class UserSpecController {
    private final UserSpecService userSpecService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") UserSpec findById(@PathVariable String id) {
        return userSpecService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") UserSpec> query(@RequestBody QueryRequest<UserSpecSpec> queryRequest) {
        return userSpecService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated UserSpecInput userSpec) {
        return userSpecService.save(userSpec);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return userSpecService.delete(ids);
    }
}
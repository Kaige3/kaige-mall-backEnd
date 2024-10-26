package kaigee.top.user.root.entity.dto.controller;
import kaigee.top.user.root.entity.dto.UserLoginInput;

@RestController
@RequestMapping("userLoginInput")
@AllArgsConstructor
@DefaultFetcherOwner(UserLoginInputRepository.class)
public class UserLoginInputController {
    private final UserLoginInputService userLoginInputService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") UserLoginInput findById(@PathVariable String id) {
        return userLoginInputService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") UserLoginInput> query(@RequestBody QueryRequest<UserLoginInputSpec> queryRequest) {
        return userLoginInputService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated UserLoginInputInput userLoginInput) {
        return userLoginInputService.save(userLoginInput);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return userLoginInputService.delete(ids);
    }
}
package kaigee.top.user.entity.dto.controller;
import kaigee.top.user.entity.dto.UserInput;

@RestController
@RequestMapping("userInput")
@AllArgsConstructor
@DefaultFetcherOwner(UserInputRepository.class)
public class UserInputController {
    private final UserInputService userInputService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") UserInput findById(@PathVariable String id) {
        return userInputService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") UserInput> query(@RequestBody QueryRequest<UserInputSpec> queryRequest) {
        return userInputService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated UserInputInput userInput) {
        return userInputService.save(userInput);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return userInputService.delete(ids);
    }
}
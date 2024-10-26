package kaigee.top.role.entity.dto.controller;
import kaigee.top.role.entity.dto.RoleInput;

@RestController
@RequestMapping("roleInput")
@AllArgsConstructor
@DefaultFetcherOwner(RoleInputRepository.class)
public class RoleInputController {
    private final RoleInputService roleInputService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") RoleInput findById(@PathVariable String id) {
        return roleInputService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") RoleInput> query(@RequestBody QueryRequest<RoleInputSpec> queryRequest) {
        return roleInputService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated RoleInputInput roleInput) {
        return roleInputService.save(roleInput);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return roleInputService.delete(ids);
    }
}
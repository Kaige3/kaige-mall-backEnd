package kaigee.top.role.entity.dto.controller;
import kaigee.top.role.entity.dto.RoleSpec;

@RestController
@RequestMapping("roleSpec")
@AllArgsConstructor
@DefaultFetcherOwner(RoleSpecRepository.class)
public class RoleSpecController {
    private final RoleSpecService roleSpecService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") RoleSpec findById(@PathVariable String id) {
        return roleSpecService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") RoleSpec> query(@RequestBody QueryRequest<RoleSpecSpec> queryRequest) {
        return roleSpecService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated RoleSpecInput roleSpec) {
        return roleSpecService.save(roleSpec);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return roleSpecService.delete(ids);
    }
}
package kaigee.top.role.entity.controller;
import kaigee.top.role.entity.Role;

@RestController
@RequestMapping("role")
@AllArgsConstructor
@DefaultFetcherOwner(RoleRepository.class)
public class RoleController {
    private final RoleService roleService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") Role findById(@PathVariable String id) {
        return roleService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") Role> query(@RequestBody QueryRequest<RoleSpec> queryRequest) {
        return roleService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated RoleInput role) {
        return roleService.save(role);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return roleService.delete(ids);
    }
}
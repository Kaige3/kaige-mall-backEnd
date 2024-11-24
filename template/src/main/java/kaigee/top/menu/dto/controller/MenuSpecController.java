package kaigee.top.menu.entity.dto.controller;
import kaigee.top.menu.entity.dto.MenuSpec;

@RestController
@RequestMapping("menuSpec")
@AllArgsConstructor
@DefaultFetcherOwner(MenuSpecRepository.class)
public class MenuSpecController {
    private final MenuSpecService menuSpecService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") MenuSpec findById(@PathVariable String id) {
        return menuSpecService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") MenuSpec> query(@RequestBody QueryRequest<MenuSpecSpec> queryRequest) {
        return menuSpecService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated MenuSpecInput menuSpec) {
        return menuSpecService.save(menuSpec);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return menuSpecService.delete(ids);
    }
}
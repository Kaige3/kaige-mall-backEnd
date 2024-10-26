package kaigee.top.menu.entity.controller;
import kaigee.top.menu.entity.Menu;

@RestController
@RequestMapping("menu")
@AllArgsConstructor
@DefaultFetcherOwner(MenuRepository.class)
public class MenuController {
    private final MenuService menuService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") Menu findById(@PathVariable String id) {
        return menuService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") Menu> query(@RequestBody QueryRequest<MenuSpec> queryRequest) {
        return menuService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated MenuInput menu) {
        return menuService.save(menu);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return menuService.delete(ids);
    }
}
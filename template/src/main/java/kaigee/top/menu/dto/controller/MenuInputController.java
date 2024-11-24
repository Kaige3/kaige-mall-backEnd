package kaigee.top.menu.entity.dto.controller;
import kaigee.top.menu.entity.dto.MenuInput;

@RestController
@RequestMapping("menuInput")
@AllArgsConstructor
@DefaultFetcherOwner(MenuInputRepository.class)
public class MenuInputController {
    private final MenuInputService menuInputService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") MenuInput findById(@PathVariable String id) {
        return menuInputService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") MenuInput> query(@RequestBody QueryRequest<MenuInputSpec> queryRequest) {
        return menuInputService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated MenuInputInput menuInput) {
        return menuInputService.save(menuInput);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return menuInputService.delete(ids);
    }
}
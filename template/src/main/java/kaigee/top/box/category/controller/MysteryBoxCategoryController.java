package kaigee.top.box.category.entity.controller;
import kaigee.top.box.category.entity.MysteryBoxCategory;

@RestController
@RequestMapping("mysteryBoxCategory")
@AllArgsConstructor
@DefaultFetcherOwner(MysteryBoxCategoryRepository.class)
public class MysteryBoxCategoryController {
    private final MysteryBoxCategoryService mysteryBoxCategoryService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") MysteryBoxCategory findById(@PathVariable String id) {
        return mysteryBoxCategoryService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") MysteryBoxCategory> query(@RequestBody QueryRequest<MysteryBoxCategorySpec> queryRequest) {
        return mysteryBoxCategoryService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated MysteryBoxCategoryInput mysteryBoxCategory) {
        return mysteryBoxCategoryService.save(mysteryBoxCategory);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return mysteryBoxCategoryService.delete(ids);
    }
}
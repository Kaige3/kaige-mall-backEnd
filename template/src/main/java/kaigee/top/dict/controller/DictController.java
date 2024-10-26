package kaigee.top.dict.entity.controller;
import kaigee.top.dict.entity.Dict;

@RestController
@RequestMapping("dict")
@AllArgsConstructor
@DefaultFetcherOwner(DictRepository.class)
public class DictController {
    private final DictService dictService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") Dict findById(@PathVariable String id) {
        return dictService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") Dict> query(@RequestBody QueryRequest<DictSpec> queryRequest) {
        return dictService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated DictInput dict) {
        return dictService.save(dict);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return dictService.delete(ids);
    }
}
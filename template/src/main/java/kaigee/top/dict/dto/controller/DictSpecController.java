package kaigee.top.dict.entity.dto.controller;
import kaigee.top.dict.entity.dto.DictSpec;

@RestController
@RequestMapping("dictSpec")
@AllArgsConstructor
@DefaultFetcherOwner(DictSpecRepository.class)
public class DictSpecController {
    private final DictSpecService dictSpecService;

    @GetMapping("{id}")
    public @FetchBy(value = "COMPLEX_FETCHER") DictSpec findById(@PathVariable String id) {
        return dictSpecService.findById(id);
    }

    @PostMapping("query")
    public Page< @FetchBy(value = "COMPLEX_FETCHER") DictSpec> query(@RequestBody QueryRequest<DictSpecSpec> queryRequest) {
        return dictSpecService.query(queryRequest);
    }

    @PostMapping("save")
    public String save(@RequestBody @Validated DictSpecInput dictSpec) {
        return dictSpecService.save(dictSpec);
    }

    @PostMapping("delete")
    public Boolean delete(@RequestBody List<String> ids) {
        return dictSpecService.delete(ids);
    }
}
package kaigee.top.user.service;

import io.qifan.infrastructure.common.constants.ResultCode;
import io.qifan.infrastructure.common.exception.BusinessException;
import kaigee.top.infrastructure.model.QueryRequest;
import kaigee.top.user.entity.User;
import kaigee.top.user.entity.dto.UserInput;
import kaigee.top.user.entity.dto.UserSpec;
import kaigee.top.user.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class UserService {
    private final UserRepository userRepository;

    public User findById(String id) {
        return userRepository.findById(id, UserRepository.COMPLEX_FETCHER).orElseThrow(() -> new BusinessException(ResultCode.NotFindError, "数据不存在"));
    }

    public String save(UserInput userInput) {
        return userRepository.save(userInput).id();
    }

    public Page<User> query(QueryRequest<UserSpec> queryRequest) {
        return userRepository.findPage(queryRequest, UserRepository.COMPLEX_FETCHER);
    }

    public boolean delete(List<String> ids) {
        userRepository.deleteAllById(ids);
        return true;
    }
}
package com.example.dcits.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 你的名字
 * @date 2019\7\12 0012 13:19
 */
@Service
@Transactional(rollbackFor = Exception.class)
public interface TestService {
}

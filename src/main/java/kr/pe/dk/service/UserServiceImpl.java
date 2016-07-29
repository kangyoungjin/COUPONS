package kr.pe.dk.service;

import org.springframework.stereotype.Service;

import kr.pe.dk.mappers.UserMapper;
import kr.pe.dk.vo.UserVO;

@Service("UserService")
public class UserServiceImpl extends GenericServiceImpl<UserVO, String, UserMapper> implements UserService {

}

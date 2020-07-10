package com.yuke.springboot.system.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yuke.springboot.system.entity.SysUserInfo;
import com.yuke.springboot.system.mapper.SysUserMapper;
import com.yuke.springboot.system.service.SysUserService;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUserInfo> implements SysUserService {

}

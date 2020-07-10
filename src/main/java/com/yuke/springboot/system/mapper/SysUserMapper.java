package com.yuke.springboot.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yuke.springboot.system.entity.SysUserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUserInfo> {
}

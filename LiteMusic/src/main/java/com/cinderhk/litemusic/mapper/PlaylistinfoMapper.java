package com.cinderhk.litemusic.mapper;

import com.cinderhk.litemusic.entity.Playlistinfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author dxy
 * @since 2024-10-10
 */
public interface PlaylistinfoMapper extends BaseMapper<Playlistinfo> {

    List<Playlistinfo> listById(Long id);

}

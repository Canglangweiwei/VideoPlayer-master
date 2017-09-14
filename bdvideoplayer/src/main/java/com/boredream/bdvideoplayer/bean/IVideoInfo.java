package com.boredream.bdvideoplayer.bean;

import java.io.Serializable;

/**
 * 视频数据类请实现本接口
 */
@SuppressWarnings("ALL")
public interface IVideoInfo extends Serializable {

    /**
     * 视频id
     */
    String getVideoID();

    /**
     * 视频标题
     */
    String getVideoTitle();

    /**
     * 视频播放路径 url / file path
     */
    String getVideoPath();

    /**
     * 视频缩略图
     */
    String getVideoThumb();

    /**
     * 视频描述
     */
    String getVideoDesc();
}

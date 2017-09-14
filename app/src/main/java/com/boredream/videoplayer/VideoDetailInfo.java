package com.boredream.videoplayer;

import com.boredream.bdvideoplayer.bean.IVideoInfo;

@SuppressWarnings("ALL")
public class VideoDetailInfo implements IVideoInfo {

    public String id;
    public String title;
    public String videoPath;
    public String videoThumb;
    public String videoDesc;

    @Override
    public String getVideoID() {
        return id;
    }

    @Override
    public String getVideoTitle() {
        return title;
    }

    @Override
    public String getVideoPath() {
        return videoPath;
    }

    @Override
    public String getVideoThumb() {
        return videoThumb;
    }

    @Override
    public String getVideoDesc() {
        return videoDesc;
    }
}

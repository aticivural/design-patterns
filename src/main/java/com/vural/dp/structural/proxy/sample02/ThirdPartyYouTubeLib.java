package com.vural.dp.structural.proxy.sample02;

import java.util.HashMap;

interface ThirdPartyYouTubeLib {
    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);
}

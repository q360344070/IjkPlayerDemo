package com.stormdzh.ijkplayer.ijk;

import tv.danmaku.ijk.media.player.IMediaPlayer;

/**
 * @Description: 描述
 * @Author: dzh
 * @CreateDate: 2021-03-05 14:27
 */
public abstract class VideoPlayerListener implements IMediaPlayer.OnBufferingUpdateListener
        , IMediaPlayer.OnCompletionListener, IMediaPlayer.OnPreparedListener, IMediaPlayer.OnInfoListener
        , IMediaPlayer.OnVideoSizeChangedListener, IMediaPlayer.OnErrorListener
        , IMediaPlayer.OnSeekCompleteListener {
}
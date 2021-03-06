package de.uniba.myREST.response;

import com.google.api.client.util.DateTime;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 * Class YoutubeResponse is primarily responsible for returning JSON objects for every search result for Youtube videos
 * Created by chandan on 23.08.16.
 */
public class YoutubeResponse implements Serializable {

    /**
     * Declaring java Util Logging Object for enabling logging in the YoutubeResponse class
     */

    private String videoId = null;
    private String videoETag = null;
    private String videoTitle = null;
    private String videoPublishedAt = null;
    private String videoChannelId = null;
    private String videoChannelTitle = null;
    private String VideoDescription = null;
    private String videoThumbnailURI = null;
    private String videoURI = null;


    /**
     * Constructor for class YoutubeResponse
     * @param videoId
     * @param videoETag
     * @param videoTitle
     * @param videoPublishedAt
     * @param videoChannelId
     * @param videoChannelTitle
     * @param videoDescription
     * @param videoThumbnailURI
     * @param videoURI
     */

    public YoutubeResponse(String videoId,
                           String videoETag,
                           String videoTitle,
                           String videoPublishedAt,
                           String videoChannelId,
                           String videoChannelTitle,
                           String videoDescription,
                           String videoThumbnailURI,
                           String videoURI) {
        this.videoId = videoId;
        this.videoETag = videoETag;
        this.videoTitle = videoTitle;
        this.videoPublishedAt = videoPublishedAt;
        this.videoChannelId = videoChannelId;
        this.videoChannelTitle = videoChannelTitle;
        VideoDescription = videoDescription;
        this.videoThumbnailURI = videoThumbnailURI;
        this.videoURI = videoURI;
    }

    /**
     * Default Constructor for class YoutubeResponse
     */
    public YoutubeResponse() {
    }

    /**
     * Getter and Setter methods for the class YoutubeResponse instance variables
     * @return
     */
    public String getVideoId() {
        return videoId;
    }

    public String getVideoETag() {
        return videoETag;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public String getVideoPublishedAt() {
        return videoPublishedAt;
    }

    public String getVideoChannelId() {
        return videoChannelId;
    }

    public String getVideoChannelTitle() {
        return videoChannelTitle;
    }

    public String getVideoDescription() {
        return VideoDescription;
    }

    public String getVideoThumbnailURI() {
        return videoThumbnailURI;
    }

    public String getVideoURI() {return videoURI;}


    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public void setVideoETag(String videoETag) {
        this.videoETag = videoETag;
    }

    public void setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
    }

    public void setVideoPublishedAt(String videoPublishedAt) {
        this.videoPublishedAt = videoPublishedAt;
    }

    public void setVideoChannelId(String videoChannelId) {
        this.videoChannelId = videoChannelId;
    }

    public void setVideoChannelTitle(String videoChannelTitle) {
        this.videoChannelTitle = videoChannelTitle;
    }

    public void setVideoDescription(String videoDescription) {
        VideoDescription = videoDescription;
    }

    public void setVideoThumbnailURI(String videoThumbnailURI) {this.videoThumbnailURI = videoThumbnailURI;}

    public void setVideoURI(String videoURI) {this.videoURI = videoURI;}
}

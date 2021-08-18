package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int createdBy;
    private String ownerAvatarUrl;
    private int date;
    private String text;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private String postType;
    private PostSourse postSourse;
    private Geo geo;
    private int signerIg;
    private boolean canPin;
    private boolean canEdit;
    private boolean canDelete;
    private boolean isPinned;
    private boolean markedAsAdc;
    private boolean isFavorite;
    private Donut donut;
    private int postponediD;
    //+ getters, setters на все поля
}



package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private String ownerAvatarUrl;
    private int date;
    private String text;
    private String imageUrl;
    private String videoURl;
    private String musicUrl;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;
    private Geo geo;
    private boolean canPin;
    private boolean canEdit;
    private boolean canDelete;
    //+ getters, setters на все поля
}



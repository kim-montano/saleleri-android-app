package com.example.jumpyjump.domain.post;

import com.example.jumpyjump.domain.useractivity.UserActivityInfo;

public class Post {
    private String id;
    private String text;
    private double discount;
    private String startDate;
    private String endDate;
    private UserActivityInfo[] likes;
    private UserActivityInfo[] dislikes;
}

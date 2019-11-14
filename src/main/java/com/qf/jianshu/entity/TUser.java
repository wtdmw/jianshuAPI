package com.qf.jianshu.entity;

import lombok.Data;

@Data
public class TUser {
    private Integer tUserId;

    private String tUserHeadPicture;

    private String tUserNickname;

    private String tUserExplain;

    private Double tUserAsset;

    private Integer tUserWordsCount;

    private Integer tUserGoodCount;

    private Integer tUserFansCount;
}
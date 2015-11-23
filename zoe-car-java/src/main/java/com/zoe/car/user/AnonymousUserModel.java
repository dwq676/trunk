package com.zoe.car.user;

/**
 * AnonymousUserModel
 *
 * @author Dai Wenqing
 * @date 2015/11/12
 */
public class AnonymousUserModel {
    private String name = "guest";
    private String userId = "9999";
    private String photo = "/theme/lib/img/noavatar.png";
    private String password = "111111";
    private String nickname="游客";

    public String getNickname() {
        return nickname;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public String getPhoto() {
        return photo;
    }
}

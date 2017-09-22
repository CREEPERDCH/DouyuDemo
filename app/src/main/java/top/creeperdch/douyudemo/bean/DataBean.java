package top.creeperdch.douyudemo.bean;

/**
 * Created by CREEPERDCH on 2017/9/22.
 * HINT:
 */

public class DataBean {
    /**
     * room_id : 232987
     * room_src : https://rpic.douyucdn.cn/acrpic/170922/232987_1421.jpg
     * vertical_src : https://rpic.douyucdn.cn/acrpic/170922/232987_1421.jpg
     * isVertical : 0
     * cate_id : 287
     * room_name : 探秘s7总决赛战队三星SSG
     * owner_uid : 12696301
     * nickname : hanjiaen
     * online : 182372
     * url : http://www.douyu.com/alice520
     * game_url : http://www.douyu.com/directory/game/xingyu
     * game_name : 星娱
     * avatar : https://apic.douyucdn.cn/upload/avatar/012/69/63/01_avatar_big.jpg
     * avatar_mid : https://apic.douyucdn.cn/upload/avatar/012/69/63/01_avatar_middle.jpg
     * avatar_small : https://apic.douyucdn.cn/upload/avatar/012/69/63/01_avatar_small.jpg
     * jumpUrl :
     * icon_data : {"status":5,"icon_url":"","icon_width":0,"icon_height":0}
     */

    private String room_id;
    private String room_src;
    private String vertical_src;
    private int isVertical;
    private int cate_id;
    private String room_name;
    private String owner_uid;
    private String nickname;
    private int online;
    private String url;
    private String game_url;
    private String game_name;
    private String avatar;
    private String avatar_mid;
    private String avatar_small;
    private String jumpUrl;
    private IconDataBean icon_data;

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public String getRoom_src() {
        return room_src;
    }

    public void setRoom_src(String room_src) {
        this.room_src = room_src;
    }

    public String getVertical_src() {
        return vertical_src;
    }

    public void setVertical_src(String vertical_src) {
        this.vertical_src = vertical_src;
    }

    public int getIsVertical() {
        return isVertical;
    }

    public void setIsVertical(int isVertical) {
        this.isVertical = isVertical;
    }

    public int getCate_id() {
        return cate_id;
    }

    public void setCate_id(int cate_id) {
        this.cate_id = cate_id;
    }

    public String getRoom_name() {
        return room_name;
    }

    public void setRoom_name(String room_name) {
        this.room_name = room_name;
    }

    public String getOwner_uid() {
        return owner_uid;
    }

    public void setOwner_uid(String owner_uid) {
        this.owner_uid = owner_uid;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getGame_url() {
        return game_url;
    }

    public void setGame_url(String game_url) {
        this.game_url = game_url;
    }

    public String getGame_name() {
        return game_name;
    }

    public void setGame_name(String game_name) {
        this.game_name = game_name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar_mid() {
        return avatar_mid;
    }

    public void setAvatar_mid(String avatar_mid) {
        this.avatar_mid = avatar_mid;
    }

    public String getAvatar_small() {
        return avatar_small;
    }

    public void setAvatar_small(String avatar_small) {
        this.avatar_small = avatar_small;
    }

    public String getJumpUrl() {
        return jumpUrl;
    }

    public void setJumpUrl(String jumpUrl) {
        this.jumpUrl = jumpUrl;
    }

    public IconDataBean getIcon_data() {
        return icon_data;
    }

    public void setIcon_data(IconDataBean icon_data) {
        this.icon_data = icon_data;
    }
}

package cn.itcast.travel.service;

import cn.itcast.travel.domain.Favorite;
import cn.itcast.travel.domain.PageBean;
import cn.itcast.travel.domain.Route;
import cn.itcast.travel.domain.User;

public interface FavoriteService {



    /**
     * 判断是否收藏
     * @param rid
     * @param uid
     * @return
     */
    public boolean ifFavorite(String rid,int uid);

    /**
     * 添加收藏
     * @param rid
     * @param uid
     * @return
     */
    public void add(String rid, int uid);

    PageBean<Favorite> myFavorite(User user, int currentPage, int pageSize);

    /**
     * 分类查询
     *
     * @param rid
     * @param currentPage
     * @param pageSize
     * @return
     */

}

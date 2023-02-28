package abstractFactory.userInfoDao;

import abstractFactory.UserInfo;

public abstract class UserInfoDao {
    public abstract void insertUserInfo(UserInfo userInfo);

    public abstract void updateUserInfo(UserInfo userInfo);

    public abstract void deleteUserInfo(UserInfo userInfo);
}

package abstractFactory.userInfoDao;

import abstractFactory.UserInfo;
import java.util.ArrayList;

public class UserInfoMysqlDao extends UserInfoDao{
    private ArrayList<UserInfo> mySqlDB = new ArrayList<>();

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        mySqlDB.add(userInfo);
        System.out.println("Insert User Info [" + userInfo.getUserName() + "] in Mysql");
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        for (UserInfo user : mySqlDB) {
            if (user.getUserId().equals(userInfo.getUserId())) {
                user.setUserName(userInfo.getUserName());
            }
        }
        System.out.println("Update User Info [" + userInfo.getUserName() + "]in Mysql");
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        for (UserInfo user : mySqlDB) {
            if (user.getUserId().equals(userInfo.getUserId())) {
                mySqlDB.remove(userInfo);
                break;
            }
        }
        System.out.println("Delete User Info [" + userInfo.getUserName() + "] in Mysql");
    }
}

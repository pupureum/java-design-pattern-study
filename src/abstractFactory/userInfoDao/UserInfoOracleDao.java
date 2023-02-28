package abstractFactory.userInfoDao;

import abstractFactory.Product;
import abstractFactory.UserInfo;
import java.util.ArrayList;

public class UserInfoOracleDao extends UserInfoDao {

    private ArrayList<UserInfo> oracleDB = new ArrayList<>();

    @Override
    public void insertUserInfo(UserInfo userInfo) {
        oracleDB.add(userInfo);
        System.out.println("Insert User Info [" + userInfo.getUserName() + "] in Oracle");
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        for (UserInfo user : oracleDB) {
            if (user.getUserId().equals(userInfo.getUserId())) {
                user.setUserName(userInfo.getUserName());
            }
        }
        System.out.println("Update User Info [" + userInfo.getUserName() + "] in Oracle");
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        for (UserInfo user : oracleDB) {
            if (user.getUserId().equals(userInfo.getUserId())) {
                oracleDB.remove(userInfo);
                break;
            }
        }
        System.out.println("Delete User Info [" + userInfo.getUserName() + "] in Oracle");
    }
}

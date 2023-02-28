package abstractFactory.daoFactory;

import abstractFactory.productDao.ProductDao;
import abstractFactory.userInfoDao.UserInfoDao;

public abstract class DaoFactory {

    public abstract UserInfoDao createUserInfoDao();

    public abstract ProductDao createProductDao();
}

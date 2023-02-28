package abstractFactory.daoFactory;

import abstractFactory.productDao.ProductDao;
import abstractFactory.productDao.ProductMySqlDao;
import abstractFactory.userInfoDao.UserInfoDao;
import abstractFactory.userInfoDao.UserInfoMysqlDao;

public class MySqlDaoFactory extends DaoFactory {
    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoMysqlDao();
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductMySqlDao();
    }
}

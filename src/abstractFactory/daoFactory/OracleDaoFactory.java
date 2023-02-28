package abstractFactory.daoFactory;

import abstractFactory.productDao.ProductDao;
import abstractFactory.productDao.ProductOracleDao;
import abstractFactory.userInfoDao.UserInfoDao;
import abstractFactory.userInfoDao.UserInfoOracleDao;

public class OracleDaoFactory extends DaoFactory{

    @Override
    public UserInfoDao createUserInfoDao() {
        return new UserInfoOracleDao() {
        };
    }

    @Override
    public ProductDao createProductDao() {
        return new ProductOracleDao();
    }
}



package empresa.dao.mysql;

import empresa.dao.ClientDao;
import empresa.dao.DaoFactory;


public class DaoFactoryMysql implements DaoFactory{

    @Override
    public ClientDao createClientDao() {
       return new ClientDaoMysql();
    }
    
}

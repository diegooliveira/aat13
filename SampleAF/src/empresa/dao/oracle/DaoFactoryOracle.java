
package empresa.dao.oracle;

import empresa.dao.ClientDao;
import empresa.dao.DaoFactory;

public class DaoFactoryOracle implements DaoFactory {

    @Override
    public ClientDao createClientDao() {
        return new ClientDaoOracle();
    }
    
}

package com.tcl.easybill.greendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.tcl.easybill.pojo.ShareBill;
import com.tcl.easybill.pojo.SortBill;
import com.tcl.easybill.pojo.TotalBill;
import com.tcl.easybill.pojo.BPay;
import com.tcl.easybill.pojo.Person;

import com.tcl.easybill.greendao.ShareBillDao;
import com.tcl.easybill.greendao.SortBillDao;
import com.tcl.easybill.greendao.TotalBillDao;
import com.tcl.easybill.greendao.BPayDao;
import com.tcl.easybill.greendao.PersonDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig shareBillDaoConfig;
    private final DaoConfig sortBillDaoConfig;
    private final DaoConfig totalBillDaoConfig;
    private final DaoConfig bPayDaoConfig;
    private final DaoConfig personDaoConfig;

    private final ShareBillDao shareBillDao;
    private final SortBillDao sortBillDao;
    private final TotalBillDao totalBillDao;
    private final BPayDao bPayDao;
    private final PersonDao personDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        shareBillDaoConfig = daoConfigMap.get(ShareBillDao.class).clone();
        shareBillDaoConfig.initIdentityScope(type);

        sortBillDaoConfig = daoConfigMap.get(SortBillDao.class).clone();
        sortBillDaoConfig.initIdentityScope(type);

        totalBillDaoConfig = daoConfigMap.get(TotalBillDao.class).clone();
        totalBillDaoConfig.initIdentityScope(type);

        bPayDaoConfig = daoConfigMap.get(BPayDao.class).clone();
        bPayDaoConfig.initIdentityScope(type);

        personDaoConfig = daoConfigMap.get(PersonDao.class).clone();
        personDaoConfig.initIdentityScope(type);

        shareBillDao = new ShareBillDao(shareBillDaoConfig, this);
        sortBillDao = new SortBillDao(sortBillDaoConfig, this);
        totalBillDao = new TotalBillDao(totalBillDaoConfig, this);
        bPayDao = new BPayDao(bPayDaoConfig, this);
        personDao = new PersonDao(personDaoConfig, this);

        registerDao(ShareBill.class, shareBillDao);
        registerDao(SortBill.class, sortBillDao);
        registerDao(TotalBill.class, totalBillDao);
        registerDao(BPay.class, bPayDao);
        registerDao(Person.class, personDao);
    }
    
    public void clear() {
        shareBillDaoConfig.clearIdentityScope();
        sortBillDaoConfig.clearIdentityScope();
        totalBillDaoConfig.clearIdentityScope();
        bPayDaoConfig.clearIdentityScope();
        personDaoConfig.clearIdentityScope();
    }

    public ShareBillDao getShareBillDao() {
        return shareBillDao;
    }

    public SortBillDao getSortBillDao() {
        return sortBillDao;
    }

    public TotalBillDao getTotalBillDao() {
        return totalBillDao;
    }

    public BPayDao getBPayDao() {
        return bPayDao;
    }

    public PersonDao getPersonDao() {
        return personDao;
    }

}

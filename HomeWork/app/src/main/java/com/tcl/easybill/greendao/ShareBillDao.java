package com.tcl.easybill.greendao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.tcl.easybill.pojo.ShareBill;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "SHARE_BILL".
*/
public class ShareBillDao extends AbstractDao<ShareBill, String> {

    public static final String TABLENAME = "SHARE_BILL";

    /**
     * Properties of entity ShareBill.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, String.class, "id", true, "ID");
        public final static Property Cost = new Property(1, float.class, "cost", false, "COST");
        public final static Property Content = new Property(2, String.class, "content", false, "CONTENT");
        public final static Property Userid = new Property(3, String.class, "userid", false, "USERID");
        public final static Property PayName = new Property(4, String.class, "payName", false, "PAY_NAME");
        public final static Property PayImg = new Property(5, String.class, "payImg", false, "PAY_IMG");
        public final static Property SortName = new Property(6, String.class, "sortName", false, "SORT_NAME");
        public final static Property SortImg = new Property(7, String.class, "sortImg", false, "SORT_IMG");
        public final static Property Crdate = new Property(8, long.class, "crdate", false, "CRDATE");
        public final static Property Income = new Property(9, boolean.class, "income", false, "INCOME");
        public final static Property Version = new Property(10, int.class, "version", false, "VERSION");
    }


    public ShareBillDao(DaoConfig config) {
        super(config);
    }
    
    public ShareBillDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"SHARE_BILL\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "\"COST\" REAL NOT NULL ," + // 1: cost
                "\"CONTENT\" TEXT," + // 2: content
                "\"USERID\" TEXT," + // 3: userid
                "\"PAY_NAME\" TEXT," + // 4: payName
                "\"PAY_IMG\" TEXT," + // 5: payImg
                "\"SORT_NAME\" TEXT," + // 6: sortName
                "\"SORT_IMG\" TEXT," + // 7: sortImg
                "\"CRDATE\" INTEGER NOT NULL ," + // 8: crdate
                "\"INCOME\" INTEGER NOT NULL ," + // 9: income
                "\"VERSION\" INTEGER NOT NULL );"); // 10: version
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"SHARE_BILL\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, ShareBill entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
        stmt.bindDouble(2, entity.getCost());
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(3, content);
        }
 
        String userid = entity.getUserid();
        if (userid != null) {
            stmt.bindString(4, userid);
        }
 
        String payName = entity.getPayName();
        if (payName != null) {
            stmt.bindString(5, payName);
        }
 
        String payImg = entity.getPayImg();
        if (payImg != null) {
            stmt.bindString(6, payImg);
        }
 
        String sortName = entity.getSortName();
        if (sortName != null) {
            stmt.bindString(7, sortName);
        }
 
        String sortImg = entity.getSortImg();
        if (sortImg != null) {
            stmt.bindString(8, sortImg);
        }
        stmt.bindLong(9, entity.getCrdate());
        stmt.bindLong(10, entity.getIncome() ? 1L: 0L);
        stmt.bindLong(11, entity.getVersion());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, ShareBill entity) {
        stmt.clearBindings();
 
        String id = entity.getId();
        if (id != null) {
            stmt.bindString(1, id);
        }
        stmt.bindDouble(2, entity.getCost());
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(3, content);
        }
 
        String userid = entity.getUserid();
        if (userid != null) {
            stmt.bindString(4, userid);
        }
 
        String payName = entity.getPayName();
        if (payName != null) {
            stmt.bindString(5, payName);
        }
 
        String payImg = entity.getPayImg();
        if (payImg != null) {
            stmt.bindString(6, payImg);
        }
 
        String sortName = entity.getSortName();
        if (sortName != null) {
            stmt.bindString(7, sortName);
        }
 
        String sortImg = entity.getSortImg();
        if (sortImg != null) {
            stmt.bindString(8, sortImg);
        }
        stmt.bindLong(9, entity.getCrdate());
        stmt.bindLong(10, entity.getIncome() ? 1L: 0L);
        stmt.bindLong(11, entity.getVersion());
    }

    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0);
    }    

    @Override
    public ShareBill readEntity(Cursor cursor, int offset) {
        ShareBill entity = new ShareBill( //
            cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0), // id
            cursor.getFloat(offset + 1), // cost
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // content
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // userid
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // payName
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // payImg
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // sortName
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // sortImg
            cursor.getLong(offset + 8), // crdate
            cursor.getShort(offset + 9) != 0, // income
            cursor.getInt(offset + 10) // version
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, ShareBill entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getString(offset + 0));
        entity.setCost(cursor.getFloat(offset + 1));
        entity.setContent(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUserid(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setPayName(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setPayImg(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSortName(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setSortImg(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCrdate(cursor.getLong(offset + 8));
        entity.setIncome(cursor.getShort(offset + 9) != 0);
        entity.setVersion(cursor.getInt(offset + 10));
     }
    
    @Override
    protected final String updateKeyAfterInsert(ShareBill entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public String getKey(ShareBill entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(ShareBill entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}

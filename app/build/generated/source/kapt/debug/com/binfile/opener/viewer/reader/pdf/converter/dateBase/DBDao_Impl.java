package com.binfile.opener.viewer.reader.pdf.converter.dateBase;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.binfile.opener.viewer.reader.pdf.converter.model.AdapterModelClass;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class DBDao_Impl implements DBDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AdapterModelClass> __insertionAdapterOfAdapterModelClass;

  private final EntityInsertionAdapter<AdapterModelClass> __insertionAdapterOfAdapterModelClass_1;

  private final EntityInsertionAdapter<AdapterModelClass> __insertionAdapterOfAdapterModelClass_2;

  private final EntityDeletionOrUpdateAdapter<AdapterModelClass> __updateAdapterOfAdapterModelClass;

  private final SharedSQLiteStatement __preparedStmtOfDeleteByUserId;

  public DBDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAdapterModelClass = new EntityInsertionAdapter<AdapterModelClass>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `AdapterModelClass` (`mId`,`myPath`,`fileName`,`fileSize`,`mDate`,`mboolean`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AdapterModelClass value) {
        stmt.bindLong(1, value.getMId());
        if (value.getMyPath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMyPath());
        }
        if (value.getFileName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFileName());
        }
        stmt.bindLong(4, value.getFileSize());
        stmt.bindLong(5, value.getMDate());
        final int _tmp = value.getMboolean() ? 1 : 0;
        stmt.bindLong(6, _tmp);
      }
    };
    this.__insertionAdapterOfAdapterModelClass_1 = new EntityInsertionAdapter<AdapterModelClass>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `AdapterModelClass` (`mId`,`myPath`,`fileName`,`fileSize`,`mDate`,`mboolean`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AdapterModelClass value) {
        stmt.bindLong(1, value.getMId());
        if (value.getMyPath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMyPath());
        }
        if (value.getFileName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFileName());
        }
        stmt.bindLong(4, value.getFileSize());
        stmt.bindLong(5, value.getMDate());
        final int _tmp = value.getMboolean() ? 1 : 0;
        stmt.bindLong(6, _tmp);
      }
    };
    this.__insertionAdapterOfAdapterModelClass_2 = new EntityInsertionAdapter<AdapterModelClass>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `AdapterModelClass` (`mId`,`myPath`,`fileName`,`fileSize`,`mDate`,`mboolean`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AdapterModelClass value) {
        stmt.bindLong(1, value.getMId());
        if (value.getMyPath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMyPath());
        }
        if (value.getFileName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFileName());
        }
        stmt.bindLong(4, value.getFileSize());
        stmt.bindLong(5, value.getMDate());
        final int _tmp = value.getMboolean() ? 1 : 0;
        stmt.bindLong(6, _tmp);
      }
    };
    this.__updateAdapterOfAdapterModelClass = new EntityDeletionOrUpdateAdapter<AdapterModelClass>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `AdapterModelClass` SET `mId` = ?,`myPath` = ?,`fileName` = ?,`fileSize` = ?,`mDate` = ?,`mboolean` = ? WHERE `mId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AdapterModelClass value) {
        stmt.bindLong(1, value.getMId());
        if (value.getMyPath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getMyPath());
        }
        if (value.getFileName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFileName());
        }
        stmt.bindLong(4, value.getFileSize());
        stmt.bindLong(5, value.getMDate());
        final int _tmp = value.getMboolean() ? 1 : 0;
        stmt.bindLong(6, _tmp);
        stmt.bindLong(7, value.getMId());
      }
    };
    this.__preparedStmtOfDeleteByUserId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM AdapterModelClass WHERE mId = ?";
        return _query;
      }
    };
  }

  @Override
  public void insert(final AdapterModelClass quizAdapterModelClass) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAdapterModelClass.insert(quizAdapterModelClass);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertReplace(final AdapterModelClass AdapterModelClass) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAdapterModelClass_1.insert(AdapterModelClass);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insertIgnore(final AdapterModelClass AdapterModelClass) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAdapterModelClass_2.insert(AdapterModelClass);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final AdapterModelClass quizAdapterModelClass) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfAdapterModelClass.handle(quizAdapterModelClass);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteByUserId(final int userId) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteByUserId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, userId);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteByUserId.release(_stmt);
    }
  }

  @Override
  public List<AdapterModelClass> getAll() {
    final String _sql = "SELECT * FROM AdapterModelClass";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfMId = CursorUtil.getColumnIndexOrThrow(_cursor, "mId");
      final int _cursorIndexOfMyPath = CursorUtil.getColumnIndexOrThrow(_cursor, "myPath");
      final int _cursorIndexOfFileName = CursorUtil.getColumnIndexOrThrow(_cursor, "fileName");
      final int _cursorIndexOfFileSize = CursorUtil.getColumnIndexOrThrow(_cursor, "fileSize");
      final int _cursorIndexOfMDate = CursorUtil.getColumnIndexOrThrow(_cursor, "mDate");
      final int _cursorIndexOfMboolean = CursorUtil.getColumnIndexOrThrow(_cursor, "mboolean");
      final List<AdapterModelClass> _result = new ArrayList<AdapterModelClass>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final AdapterModelClass _item;
        final int _tmpMId;
        _tmpMId = _cursor.getInt(_cursorIndexOfMId);
        final String _tmpMyPath;
        if (_cursor.isNull(_cursorIndexOfMyPath)) {
          _tmpMyPath = null;
        } else {
          _tmpMyPath = _cursor.getString(_cursorIndexOfMyPath);
        }
        final String _tmpFileName;
        if (_cursor.isNull(_cursorIndexOfFileName)) {
          _tmpFileName = null;
        } else {
          _tmpFileName = _cursor.getString(_cursorIndexOfFileName);
        }
        final long _tmpFileSize;
        _tmpFileSize = _cursor.getLong(_cursorIndexOfFileSize);
        final long _tmpMDate;
        _tmpMDate = _cursor.getLong(_cursorIndexOfMDate);
        final boolean _tmpMboolean;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfMboolean);
        _tmpMboolean = _tmp != 0;
        _item = new AdapterModelClass(_tmpMId,_tmpMyPath,_tmpFileName,_tmpFileSize,_tmpMDate,_tmpMboolean);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}

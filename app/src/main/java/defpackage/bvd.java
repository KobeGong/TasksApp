package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: bvd  reason: default package */
/* compiled from: PG */
public final class bvd extends SQLiteOpenHelper {
    public bvd(Context context, long j) {
        super(context, j + "_tasks.notifications.db", null, 3);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE tasks(_id INTEGER PRIMARY KEY,job_type INTEGER NOT NULL,payload BLOB);");
        } catch (Exception e) {
            bty.b("ChimeTaskDataSQLiteHelper", e, "Error creating SQLite Database", new Object[0]);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tasks");
            sQLiteDatabase.execSQL("CREATE TABLE tasks(_id INTEGER PRIMARY KEY,job_type INTEGER NOT NULL,payload BLOB);");
        } catch (Exception e) {
            bty.b("ChimeTaskDataSQLiteHelper", e, "Error upgrading SQLite Database, oldVerison: %d, newVersion: %d", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }
}

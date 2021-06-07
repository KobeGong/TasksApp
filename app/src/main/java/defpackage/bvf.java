package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: bvf  reason: default package */
/* compiled from: PG */
public final class bvf extends SQLiteOpenHelper {
    public bvf(Context context, long j) {
        super(context, new StringBuilder(45).append(j).append("_threads.notifications.db").toString(), (SQLiteDatabase.CursorFactory) null, 7);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,rendered_message BLOB,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0));");
        } catch (Exception e) {
            bty.b("ChimeThreadSQLiteHelper", e, "Error creating SQLite Database", new Object[0]);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 6) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS threads");
                sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,rendered_message BLOB,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0));");
            } catch (Exception e) {
                bty.b("ChimeThreadSQLiteHelper", e, "Error upgrading SQLite Database, oldVerison: %d, newVersion: %d", Integer.valueOf(i), Integer.valueOf(i2));
            }
        } else if (i == 6) {
            sQLiteDatabase.execSQL(String.format(null, "ALTER TABLE %s ADD COLUMN %s %s", "threads", "expiration_timestamp", "INTEGER NOT NULL DEFAULT(0)"));
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }
}

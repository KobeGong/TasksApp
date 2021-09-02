package defpackage;

/* renamed from: bvf reason: default package */
/* compiled from: PG */
public final class bvf extends android.database.sqlite.SQLiteOpenHelper {
    public bvf(android.content.Context context, long j) {
        super(context, j + "_threads.notifications.db", null, 7);
    }

    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,rendered_message BLOB,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0));");
        } catch (java.lang.Exception e) {
            defpackage.bty.b("ChimeThreadSQLiteHelper", e, "Error creating SQLite Database", new java.lang.Object[0]);
        }
    }

    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 6) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS threads");
                sQLiteDatabase.execSQL("CREATE TABLE threads(_id INTEGER PRIMARY KEY,thread_id TEXT UNIQUE NOT NULL,read_state INTEGER NOT NULL DEFAULT(0),count_behavior INTEGER NOT NULL DEFAULT(0),system_tray_behavior INTEGER NOT NULL DEFAULT(0),last_updated__version INTEGER NOT NULL DEFAULT(0),last_notification_version INTEGER NOT NULL DEFAULT(0),notification_metadata BLOB,rendered_message BLOB,payload BLOB,update_thread_state_token TEXT,group_id TEXT,expiration_timestamp INTEGER NOT NULL DEFAULT(0));");
            } catch (java.lang.Exception e) {
                defpackage.bty.b("ChimeThreadSQLiteHelper", e, "Error upgrading SQLite Database, oldVerison: %d, newVersion: %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
            }
        } else if (i == 6) {
            sQLiteDatabase.execSQL(java.lang.String.format(null, "ALTER TABLE %s ADD COLUMN %s %s", new java.lang.Object[]{"threads", "expiration_timestamp", "INTEGER NOT NULL DEFAULT(0)"}));
        }
    }

    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }
}

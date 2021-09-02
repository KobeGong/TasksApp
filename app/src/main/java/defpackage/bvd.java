package defpackage;

/* renamed from: bvd reason: default package */
/* compiled from: PG */
public final class bvd extends android.database.sqlite.SQLiteOpenHelper {
    public bvd(android.content.Context context, long j) {
        super(context, j + "_tasks.notifications.db", null, 3);
    }

    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE tasks(_id INTEGER PRIMARY KEY,job_type INTEGER NOT NULL,payload BLOB);");
        } catch (java.lang.Exception e) {
            defpackage.bty.b("ChimeTaskDataSQLiteHelper", e, "Error creating SQLite Database", new java.lang.Object[0]);
        }
    }

    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS tasks");
            sQLiteDatabase.execSQL("CREATE TABLE tasks(_id INTEGER PRIMARY KEY,job_type INTEGER NOT NULL,payload BLOB);");
        } catch (java.lang.Exception e) {
            defpackage.bty.b("ChimeTaskDataSQLiteHelper", e, "Error upgrading SQLite Database, oldVerison: %d, newVersion: %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
        }
    }

    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }
}

package defpackage;

/* renamed from: buy reason: default package */
/* compiled from: PG */
public final class buy extends android.database.sqlite.SQLiteOpenHelper {
    public buy(android.content.Context context) {
        super(context, "accounts.notifications.db", null, 4);
    }

    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE accounts(_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE NOT NULL,obfuscated_gaia_id TEXT,sync_version INTEGER NOT NULL DEFAULT(0),page_version INTEGER NOT NULL DEFAULT(0),registration_status INTEGER NOT NULL DEFAULT(0),last_registration_time_ms INTEGER NOT NULL DEFAULT(0),last_registration_request_hash INTEGER NOT NULL DEFAULT(0));");
        } catch (java.lang.Exception e) {
            defpackage.bty.b("ChimeAccountSQLiteHelper", e, "Error creating SQLite Database", new java.lang.Object[0]);
        }
    }

    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accounts");
                sQLiteDatabase.execSQL("CREATE TABLE accounts(_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE NOT NULL,obfuscated_gaia_id TEXT,sync_version INTEGER NOT NULL DEFAULT(0),page_version INTEGER NOT NULL DEFAULT(0),registration_status INTEGER NOT NULL DEFAULT(0),last_registration_time_ms INTEGER NOT NULL DEFAULT(0),last_registration_request_hash INTEGER NOT NULL DEFAULT(0));");
            } catch (java.lang.Exception e) {
                defpackage.bty.b("ChimeAccountSQLiteHelper", e, "Error upgrading SQLite Database, oldVerison: %d, newVersion: %d", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
            }
        } else {
            if (i < 3) {
                sQLiteDatabase.execSQL(java.lang.String.format("ALTER TABLE %s ADD COLUMN %s %s", new java.lang.Object[]{"accounts", "last_registration_time_ms", "INTEGER NOT NULL DEFAULT(0)"}));
                i = 3;
            }
            if (i < 4) {
                sQLiteDatabase.execSQL(java.lang.String.format("ALTER TABLE %s ADD COLUMN %s %s", new java.lang.Object[]{"accounts", "last_registration_request_hash", "INTEGER NOT NULL DEFAULT(0)"}));
            }
        }
    }

    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }
}

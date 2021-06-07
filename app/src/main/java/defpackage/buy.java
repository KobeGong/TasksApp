package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: buy  reason: default package */
/* compiled from: PG */
public final class buy extends SQLiteOpenHelper {
    public buy(Context context) {
        super(context, "accounts.notifications.db", (SQLiteDatabase.CursorFactory) null, 4);
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE accounts(_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE NOT NULL,obfuscated_gaia_id TEXT,sync_version INTEGER NOT NULL DEFAULT(0),page_version INTEGER NOT NULL DEFAULT(0),registration_status INTEGER NOT NULL DEFAULT(0),last_registration_time_ms INTEGER NOT NULL DEFAULT(0),last_registration_request_hash INTEGER NOT NULL DEFAULT(0));");
        } catch (Exception e) {
            bty.b("ChimeAccountSQLiteHelper", e, "Error creating SQLite Database", new Object[0]);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2) {
            try {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS accounts");
                sQLiteDatabase.execSQL("CREATE TABLE accounts(_id INTEGER PRIMARY KEY,account_name TEXT UNIQUE NOT NULL,obfuscated_gaia_id TEXT,sync_version INTEGER NOT NULL DEFAULT(0),page_version INTEGER NOT NULL DEFAULT(0),registration_status INTEGER NOT NULL DEFAULT(0),last_registration_time_ms INTEGER NOT NULL DEFAULT(0),last_registration_request_hash INTEGER NOT NULL DEFAULT(0));");
            } catch (Exception e) {
                bty.b("ChimeAccountSQLiteHelper", e, "Error upgrading SQLite Database, oldVerison: %d, newVersion: %d", Integer.valueOf(i), Integer.valueOf(i2));
            }
        } else {
            if (i < 3) {
                sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s", "accounts", "last_registration_time_ms", "INTEGER NOT NULL DEFAULT(0)"));
                i = 3;
            }
            if (i < 4) {
                sQLiteDatabase.execSQL(String.format("ALTER TABLE %s ADD COLUMN %s %s", "accounts", "last_registration_request_hash", "INTEGER NOT NULL DEFAULT(0)"));
            }
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        onUpgrade(sQLiteDatabase, i, i2);
    }
}

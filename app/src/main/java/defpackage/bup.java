package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: bup  reason: default package */
/* compiled from: PG */
public final class bup {
    private final buy a;

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List a() {
        /*
        // Method dump skipped, instructions count: 111
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bup.a():java.util.List");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.bul a(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bup.a(java.lang.String):bul");
    }

    public final synchronized boolean b(String str) {
        boolean z = true;
        synchronized (this) {
            cky.c();
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
                if (sQLiteDatabase.delete("accounts", "account_name=?", new String[]{str}) <= 0) {
                    z = false;
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            } catch (RuntimeException e) {
                bty.b("ChimeAccountStorageImpl", e, "Error deleting ChimeAccount [%s]", str);
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                z = false;
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        return z;
    }

    public final synchronized long a(bul bul) {
        long insertWithOnConflict;
        SQLiteDatabase sQLiteDatabase = null;
        synchronized (this) {
            cky.c();
            cld.a(bul, "Account must not be empty.");
            try {
                ContentValues c = c(bul);
                sQLiteDatabase = this.a.getWritableDatabase();
                insertWithOnConflict = sQLiteDatabase.insertWithOnConflict("accounts", null, c, 2);
                if (insertWithOnConflict <= 0) {
                    String valueOf = String.valueOf(bul.b());
                    throw new bun(valueOf.length() != 0 ? "Conflict inserting ChimeAccount: ".concat(valueOf) : new String("Conflict inserting ChimeAccount: "));
                } else if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            } catch (RuntimeException e) {
                String valueOf2 = String.valueOf(bul.b());
                throw new bun(valueOf2.length() != 0 ? "Error inserting ChimeAccount: ".concat(valueOf2) : new String("Error inserting ChimeAccount: "), e);
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        return insertWithOnConflict;
    }

    public final synchronized boolean b(bul bul) {
        boolean z = true;
        synchronized (this) {
            cky.c();
            cld.a(bul, "Account must not be empty.");
            SQLiteDatabase sQLiteDatabase = null;
            try {
                ContentValues c = c(bul);
                sQLiteDatabase = this.a.getWritableDatabase();
                if (sQLiteDatabase.update("accounts", c, "account_name=?", new String[]{bul.b()}) <= 0) {
                    z = false;
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            } catch (RuntimeException e) {
                bty.b("ChimeAccountStorageImpl", e, "Error updating ChimeAccount [%s]", bul.b());
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                z = false;
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        return z;
    }

    public bup(Context context) {
        this.a = new buy(context);
    }

    private static bul a(Cursor cursor) {
        bum j = bul.j();
        j.a = Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
        bum a2 = j.a(cursor.getString(cursor.getColumnIndex("account_name")));
        a2.b = cursor.getString(cursor.getColumnIndex("obfuscated_gaia_id"));
        return a2.a(Long.valueOf(cursor.getLong(cursor.getColumnIndex("sync_version")))).b(Long.valueOf(cursor.getLong(cursor.getColumnIndex("page_version")))).a(btk.a(cursor.getInt(cursor.getColumnIndex("registration_status")))).c(Long.valueOf(cursor.getLong(cursor.getColumnIndex("last_registration_time_ms")))).a(cursor.getInt(cursor.getColumnIndex("last_registration_request_hash"))).a();
    }

    private static ContentValues c(bul bul) {
        ContentValues contentValues = new ContentValues(7);
        contentValues.put("account_name", bul.b());
        contentValues.put("obfuscated_gaia_id", bul.c());
        contentValues.put("sync_version", bul.d());
        contentValues.put("page_version", bul.e());
        contentValues.put("registration_status", Integer.valueOf(bul.f().g));
        contentValues.put("last_registration_time_ms", bul.g());
        contentValues.put("last_registration_request_hash", Integer.valueOf(bul.h()));
        return contentValues;
    }
}

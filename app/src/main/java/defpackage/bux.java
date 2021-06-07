package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: bux  reason: default package */
/* compiled from: PG */
public final class bux {
    public Context a;
    public bup b;
    private final HashMap c = new HashMap();

    public final synchronized List a(String str) {
        return a(str, (String) null, (String[]) null);
    }

    public final synchronized List a(String str, String... strArr) {
        return a(str, bvh.a("thread_id", strArr.length), strArr);
    }

    public final synchronized boolean b(String str) {
        return b(str, (String) null, (String[]) null);
    }

    public final synchronized boolean b(String str, String... strArr) {
        return b(str, bvh.a("thread_id", strArr.length), strArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x011a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(java.lang.String r13, defpackage.buv r14) {
        /*
        // Method dump skipped, instructions count: 734
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bux.a(java.lang.String, buv):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00e7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00e8, code lost:
        r1 = r9;
        r9 = r0;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0138, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0139, code lost:
        r1 = r9;
        r9 = r0;
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0149, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014a, code lost:
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0149 A[ExcHandler: buo (r1v8 'e' buo A[CUSTOM_DECLARE]), Splitter:B:4:0x0013] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bux.a(java.lang.String, java.lang.String, java.lang.String[]):java.util.List");
    }

    private final boolean b(String str, String str2, String[] strArr) {
        boolean z = true;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = c(str).getWritableDatabase();
            if (sQLiteDatabase.delete("threads", str2, strArr) <= 0) {
                z = false;
            }
            if (sQLiteDatabase == null) {
                return z;
            }
            sQLiteDatabase.close();
            return z;
        } catch (buo | RuntimeException e) {
            bty.b("ChimeThreadStorageImpl", e, "Error deleting ChimeThreads for %s. Query: %s %s", str, str2, Arrays.toString(strArr));
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            return false;
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    private static djo a(Cursor cursor, djo djo, String str) {
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex(str));
            if (blob != null) {
                return djo.g().a(blob).d();
            }
        } catch (dir e) {
            bty.b("ChimeThreadStorageImpl", e, "Error parsing column %s for notification %s", str, cursor.getString(cursor.getColumnIndex("thread_id")));
        }
        return null;
    }

    private static List b(Cursor cursor, djo djo, String str) {
        dih dih;
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex(str));
            if (blob != null) {
                dii dii = (dii) ((dii) cbr.b.a(bg.ao)).a(blob, blob.length);
                if (dii.b) {
                    dih = dii.a;
                } else {
                    dih dih2 = dii.a;
                    djz.a.a(dih2).c(dih2);
                    dii.b = true;
                    dih = dii.a;
                }
                dih dih3 = dih;
                if (!dih.a(dih3, Boolean.TRUE.booleanValue())) {
                    throw new dkw();
                }
                cbr cbr = (cbr) dih3;
                if (cbr != null) {
                    ArrayList arrayList = new ArrayList(cbr.a.size());
                    for (dgu dgu : cbr.a) {
                        arrayList.add(djo.g().a(dgu.a).d());
                    }
                    return arrayList;
                }
            }
        } catch (dir e) {
            bty.b("ChimeThreadStorageImpl", e, "Error parsing column %s for notification %s", str, cursor.getString(cursor.getColumnIndex("thread_id")));
        }
        return null;
    }

    private final synchronized bvf c(String str) {
        Long l;
        l = -1L;
        if (str != null) {
            l = this.b.a(str).a();
        }
        if (!this.c.containsKey(l)) {
            this.c.put(l, new bvf(this.a, l.longValue()));
        }
        return (bvf) this.c.get(l);
    }
}

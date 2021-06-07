package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: buu  reason: default package */
/* compiled from: PG */
public final class buu {
    public Context a;
    public bup b;
    private final HashMap c = new HashMap();

    public final synchronized List a(String str, int i) {
        return a(str, "job_type=?", Integer.toString(i));
    }

    public final synchronized bus a(String str, int i, byte[] bArr) {
        bus bus = null;
        synchronized (this) {
            try {
                ContentValues contentValues = new ContentValues(2);
                contentValues.put("job_type", Integer.valueOf(i));
                contentValues.put("payload", bArr);
                long insert = b(str).getWritableDatabase().insert("tasks", null, contentValues);
                if (insert > 0) {
                    bus = new but().a(Long.valueOf(insert)).a(Integer.valueOf(i)).a(bArr).a();
                }
            } catch (buo | RuntimeException e) {
                bty.b("ChimeTaskDataStorageImpl", e, "Error inserting ChimeTaskData %d for account: %s", Integer.valueOf(i), str);
            }
        }
        return bus;
    }

    public final synchronized boolean a(String str, List list) {
        boolean z = false;
        synchronized (this) {
            if (!list.isEmpty()) {
                String[] strArr = new String[list.size()];
                Iterator it = list.iterator();
                int i = 0;
                while (it.hasNext()) {
                    strArr[i] = Long.toString(((bus) it.next()).a().longValue());
                    i++;
                }
                z = b(str, bvh.a("_id", list.size()), strArr);
            }
        }
        return z;
    }

    public final synchronized boolean a(String str) {
        return b(str, null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List a(java.lang.String r12, java.lang.String r13, java.lang.String... r14) {
        /*
        // Method dump skipped, instructions count: 151
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buu.a(java.lang.String, java.lang.String, java.lang.String[]):java.util.List");
    }

    private final boolean b(String str, String str2, String[] strArr) {
        try {
            return b(str).getWritableDatabase().delete("tasks", str2, strArr) > 0;
        } catch (buo | RuntimeException e) {
            bty.b("ChimeTaskDataStorageImpl", e, "Error deleting ChimeTaskData for account: %s", str);
            return false;
        }
    }

    private final synchronized bvd b(String str) {
        Long l;
        l = -1L;
        if (!TextUtils.isEmpty(str)) {
            l = this.b.a(str).a();
        }
        if (!this.c.containsKey(l)) {
            this.c.put(l, new bvd(this.a, l.longValue()));
        }
        return (bvd) this.c.get(l);
    }
}

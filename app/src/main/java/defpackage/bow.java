package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: bow  reason: default package */
/* compiled from: PG */
public final class bow {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final String[] g = {"key", "value"};
    public final ContentResolver b;
    public final Uri c;
    public final ContentObserver d;
    public final Object e = new Object();
    public volatile Map f;

    bow(ContentResolver contentResolver, Uri uri) {
        this.b = contentResolver;
        this.c = uri;
        this.d = new bpc(this);
    }

    public final Map a() {
        Map b2 = boz.b("gms:phenotype:phenotype_flag:debug_disable_caching") ? b() : this.f;
        if (b2 == null) {
            synchronized (this.e) {
                b2 = this.f;
                if (b2 == null) {
                    b2 = b();
                    this.f = b2;
                }
            }
        }
        return b2;
    }

    private final Map b() {
        HashMap hashMap = new HashMap();
        Cursor query = this.b.query(this.c, g, null, null, null);
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    hashMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return hashMap;
    }
}

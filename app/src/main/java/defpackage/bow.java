package defpackage;

/* renamed from: bow reason: default package */
/* compiled from: PG */
public final class bow {
    public static final java.util.concurrent.ConcurrentHashMap a = new java.util.concurrent.ConcurrentHashMap();
    private static final java.lang.String[] g = {"key", "value"};
    public final android.content.ContentResolver b;
    public final android.net.Uri c;
    public final android.database.ContentObserver d;
    public final java.lang.Object e = new java.lang.Object();
    public volatile java.util.Map f;

    bow(android.content.ContentResolver contentResolver, android.net.Uri uri) {
        this.b = contentResolver;
        this.c = uri;
        this.d = new defpackage.bpc(this);
    }

    public final java.util.Map a() {
        java.util.Map b2 = defpackage.boz.b("gms:phenotype:phenotype_flag:debug_disable_caching") ? b() : this.f;
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

    private final java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        android.database.Cursor query = this.b.query(this.c, g, null, null, null);
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

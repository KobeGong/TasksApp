package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: qy  reason: default package */
/* compiled from: PG */
public class qy {
    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public qy(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.c = i;
        this.a = new LinkedHashMap(0, 0.75f, true);
    }

    public final Object a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            Object obj2 = this.a.get(obj);
            if (obj2 != null) {
                this.f++;
                return obj2;
            }
            this.g++;
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r5, java.lang.Object r6) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy.a(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final synchronized String toString() {
        String format;
        int i = 0;
        synchronized (this) {
            int i2 = this.f + this.g;
            if (i2 != 0) {
                i = (this.f * 100) / i2;
            }
            format = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.c), Integer.valueOf(this.f), Integer.valueOf(this.g), Integer.valueOf(i));
        }
        return format;
    }
}

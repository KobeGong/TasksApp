package defpackage;

import android.net.Uri;

/* renamed from: bpa  reason: default package */
/* compiled from: PG */
public final class bpa {
    public final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public bpa(Uri uri) {
        this(null, uri, "", "", false, false);
    }

    public bpa(String str, Uri uri, String str2, String str3, boolean z, boolean z2) {
        this.a = str;
        this.b = uri;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = z2;
    }
}

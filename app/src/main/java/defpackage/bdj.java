package defpackage;

/* renamed from: bdj reason: default package */
/* compiled from: PG */
public final class bdj {
    public final android.accounts.Account a;
    public final java.util.Set b;
    public final java.util.Set c;
    public final java.util.Map d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final defpackage.bpn g;
    public java.lang.Integer h;

    public bdj(android.accounts.Account account, java.util.Set set, java.util.Map map, java.lang.String str, java.lang.String str2, defpackage.bpn bpn) {
        this.a = account;
        this.b = set == null ? java.util.Collections.EMPTY_SET : java.util.Collections.unmodifiableSet(set);
        if (map == null) {
            map = java.util.Collections.EMPTY_MAP;
        }
        this.d = map;
        this.e = str;
        this.f = str2;
        this.g = bpn;
        java.util.HashSet hashSet = new java.util.HashSet(this.b);
        java.util.Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next();
            hashSet.addAll(null);
        }
        this.c = java.util.Collections.unmodifiableSet(hashSet);
    }
}

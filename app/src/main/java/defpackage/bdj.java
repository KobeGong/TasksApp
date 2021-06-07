package defpackage;

import android.accounts.Account;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: bdj  reason: default package */
/* compiled from: PG */
public final class bdj {
    public final Account a;
    public final Set b;
    public final Set c;
    public final Map d;
    public final String e;
    public final String f;
    public final bpn g;
    public Integer h;

    public bdj(Account account, Set set, Map map, String str, String str2, bpn bpn) {
        this.a = account;
        this.b = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.d = map == null ? Collections.EMPTY_MAP : map;
        this.e = str;
        this.f = str2;
        this.g = bpn;
        HashSet hashSet = new HashSet(this.b);
        Iterator it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next();
            hashSet.addAll(null);
        }
        this.c = Collections.unmodifiableSet(hashSet);
    }
}

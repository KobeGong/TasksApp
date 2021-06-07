package defpackage;

import android.accounts.Account;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: avp  reason: default package */
/* compiled from: PG */
public final class avp {
    public Set a = new HashSet();
    private boolean b;
    private boolean c;
    private boolean d;
    private String e;
    private Account f;
    private String g;
    private Map h = new HashMap();

    public avp() {
    }

    public avp(GoogleSignInOptions googleSignInOptions) {
        azb.b(googleSignInOptions);
        this.a = new HashSet(googleSignInOptions.g);
        this.b = googleSignInOptions.j;
        this.c = googleSignInOptions.k;
        this.d = googleSignInOptions.i;
        this.e = googleSignInOptions.l;
        this.f = googleSignInOptions.h;
        this.g = googleSignInOptions.m;
        this.h = GoogleSignInOptions.b(googleSignInOptions.n);
    }

    public final avp a() {
        this.a.add(GoogleSignInOptions.a);
        return this;
    }

    public final avp a(Scope scope, Scope... scopeArr) {
        this.a.add(scope);
        this.a.addAll(Arrays.asList(scopeArr));
        return this;
    }

    public final GoogleSignInOptions b() {
        if (this.a.contains(GoogleSignInOptions.c) && this.a.contains(GoogleSignInOptions.b)) {
            this.a.remove(GoogleSignInOptions.b);
        }
        if (this.d && (this.f == null || !this.a.isEmpty())) {
            a();
        }
        return new GoogleSignInOptions(3, new ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h);
    }
}

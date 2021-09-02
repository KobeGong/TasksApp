package defpackage;

/* renamed from: avp reason: default package */
/* compiled from: PG */
public final class avp {
    public java.util.Set a = new java.util.HashSet();
    private boolean b;
    private boolean c;
    private boolean d;
    private java.lang.String e;
    private android.accounts.Account f;
    private java.lang.String g;
    private java.util.Map h = new java.util.HashMap();

    public avp() {
    }

    public avp(com.google.android.gms.auth.api.signin.GoogleSignInOptions googleSignInOptions) {
        defpackage.azb.b((java.lang.Object) googleSignInOptions);
        this.a = new java.util.HashSet(googleSignInOptions.g);
        this.b = googleSignInOptions.j;
        this.c = googleSignInOptions.k;
        this.d = googleSignInOptions.i;
        this.e = googleSignInOptions.l;
        this.f = googleSignInOptions.h;
        this.g = googleSignInOptions.m;
        this.h = com.google.android.gms.auth.api.signin.GoogleSignInOptions.b((java.util.List) googleSignInOptions.n);
    }

    public final defpackage.avp a() {
        this.a.add(com.google.android.gms.auth.api.signin.GoogleSignInOptions.a);
        return this;
    }

    public final defpackage.avp a(com.google.android.gms.common.api.Scope scope, com.google.android.gms.common.api.Scope... scopeArr) {
        this.a.add(scope);
        this.a.addAll(java.util.Arrays.asList(scopeArr));
        return this;
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInOptions b() {
        if (this.a.contains(com.google.android.gms.auth.api.signin.GoogleSignInOptions.c) && this.a.contains(com.google.android.gms.auth.api.signin.GoogleSignInOptions.b)) {
            this.a.remove(com.google.android.gms.auth.api.signin.GoogleSignInOptions.b);
        }
        if (this.d && (this.f == null || !this.a.isEmpty())) {
            a();
        }
        return new com.google.android.gms.auth.api.signin.GoogleSignInOptions(3, new java.util.ArrayList(this.a), this.f, this.d, this.b, this.c, this.e, this.g, this.h);
    }
}

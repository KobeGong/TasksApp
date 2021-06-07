package defpackage;

import com.google.android.gms.common.api.Scope;

/* renamed from: bpp  reason: default package */
/* compiled from: PG */
public final class bpp {
    public static final ayf a = new bpq();
    public static final ayd b = new ayd("SignIn.API", a, c);
    private static ayh c = new ayh((byte) 0);
    private static ayh d = new ayh((byte) 0);
    private static ayf e = new bpr();

    static {
        new Scope("profile");
        new Scope("email");
        new ayd("SignIn.INTERNAL_API", e, d);
    }
}

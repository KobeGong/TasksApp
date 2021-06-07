package defpackage;

import java.security.PrivilegedAction;

/* renamed from: ao  reason: default package */
/* compiled from: PG */
final class ao implements PrivilegedAction {
    private final /* synthetic */ Class a;
    private final /* synthetic */ String b;

    ao(Class cls, String str) {
        this.a = cls;
        this.b = str;
    }

    @Override // java.security.PrivilegedAction
    public final /* synthetic */ Object run() {
        return this.a.getResourceAsStream(this.b);
    }
}

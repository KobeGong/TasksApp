package defpackage;

import java.security.PrivilegedAction;

/* renamed from: am  reason: default package */
/* compiled from: PG */
final class am implements PrivilegedAction {
    private final /* synthetic */ String a;

    am(String str) {
        this.a = str;
    }

    @Override // java.security.PrivilegedAction
    public final /* synthetic */ Object run() {
        return System.getProperty(this.a);
    }
}

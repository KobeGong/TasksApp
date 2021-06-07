package defpackage;

import java.net.InetAddress;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: duq  reason: default package */
/* compiled from: PG */
final class duq extends dup {
    duq() {
    }

    /* access modifiers changed from: package-private */
    @Override // defpackage.dup
    public final dus a(String str) {
        return new dus(Arrays.asList(InetAddress.getAllByName(str)), Collections.emptyList(), Collections.emptyList());
    }
}

package defpackage;

import android.content.Context;
import org.chromium.net.impl.CronetUrlRequestContext;

/* renamed from: ekm  reason: default package */
/* compiled from: PG */
public class ekm extends ejv {
    public ekm(Context context) {
        super(context);
    }

    @Override // defpackage.eie
    public final ehy a() {
        if (this.e == null) {
            this.e = ekr.a(this.a);
        }
        return new CronetUrlRequestContext(this);
    }
}

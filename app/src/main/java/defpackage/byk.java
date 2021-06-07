package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.io.IOException;

/* renamed from: byk  reason: default package */
/* compiled from: PG */
public final class byk {
    public Context a;
    public buc b;
    public bru c;
    public avi d;

    public final String a() {
        cky.c();
        try {
            String a2 = this.c.a(this.b.d(), this.d.a());
            if (TextUtils.isEmpty(a2)) {
                throw new byl();
            }
            if (!a2.equals(this.a.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0).getString("reg_id", null))) {
                bty.a("GcmManagerImpl", "New registration ID doesn't match the previously stored one.", new Object[0]);
                this.a.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0).edit().putString("reg_id", a2).commit();
            }
            return a2;
        } catch (IOException e) {
            bty.b("GcmManagerImpl", "Exception during register with IID.", new Object[0]);
            throw new byl(e);
        }
    }
}

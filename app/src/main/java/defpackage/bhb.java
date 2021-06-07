package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: bhb  reason: default package */
/* compiled from: PG */
final class bhb implements Callable {
    private /* synthetic */ Context a;

    bhb(Context context) {
        this.a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.a.getSharedPreferences("google_sdk_flags", 0);
    }
}

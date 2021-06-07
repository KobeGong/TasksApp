package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: bgy  reason: default package */
/* compiled from: PG */
final class bgy implements Callable {
    private /* synthetic */ SharedPreferences a;
    private /* synthetic */ String b;
    private /* synthetic */ Long c;

    bgy(SharedPreferences sharedPreferences, String str, Long l) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = l;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Long.valueOf(this.a.getLong(this.b, this.c.longValue()));
    }
}

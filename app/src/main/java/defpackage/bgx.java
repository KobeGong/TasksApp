package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: bgx  reason: default package */
/* compiled from: PG */
final class bgx implements Callable {
    private /* synthetic */ SharedPreferences a;
    private /* synthetic */ String b;
    private /* synthetic */ Integer c;

    bgx(SharedPreferences sharedPreferences, String str, Integer num) {
        this.a = sharedPreferences;
        this.b = str;
        this.c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.a.getInt(this.b, this.c.intValue()));
    }
}

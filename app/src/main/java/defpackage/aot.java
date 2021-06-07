package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: aot  reason: default package */
/* compiled from: PG */
public final class aot extends aoq {
    private final String b;

    public aot(Intent intent) {
        this.b = intent.getStringExtra("query");
    }

    @Override // defpackage.aoq, defpackage.aoe
    public final aof a(Context context, String str) {
        String str2 = this.b;
        ala ala = new ala();
        Bundle bundle = new Bundle();
        bundle.putString("query", str2);
        ala.e(bundle);
        return aof.a(null, ala);
    }
}

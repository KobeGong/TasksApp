package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.List;

/* renamed from: aos  reason: default package */
/* compiled from: PG */
public final class aos extends aoq {
    private final ajo b;

    public aos(Intent intent) {
        Uri data = intent.getData();
        List<String> pathSegments = data.getPathSegments();
        if (pathSegments.size() < 4) {
            String valueOf = String.valueOf(data);
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 30).append("This is not a LinkToTask Uri: ").append(valueOf).toString());
        } else {
            this.b = new ajk(pathSegments.get(1), pathSegments.get(2), pathSegments.get(3));
        }
    }

    @Override // defpackage.aoq, defpackage.aoe
    public final String a(Context context) {
        return this.b.a();
    }

    @Override // defpackage.aoq, defpackage.aoe
    public final aof a(Context context, String str) {
        if (str.equals(this.b.a())) {
            return aof.a(this.b.b(), asi.a(this.b.b(), this.b.c(), false, -1));
        }
        return aoe.a;
    }
}

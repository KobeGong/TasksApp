package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: bqh  reason: default package */
/* compiled from: PG */
final class bqh implements bqg {
    private final Context a;

    private bqh(Context context) {
        this.a = context;
    }

    @Override // defpackage.bqg
    public final String a(String str, String str2) {
        try {
            return avb.a(this.a, str, str2);
        } catch (ave e) {
            String message = e.getMessage();
            e.a();
            throw new ayl(message, e, (byte) 0);
        } catch (avf e2) {
            String message2 = e2.getMessage();
            e2.a();
            throw new ayl(message2, (byte) 0);
        } catch (ava e3) {
            throw new ayl(e3);
        }
    }

    @Override // defpackage.bqg
    public final String a(String str) {
        try {
            return avb.b(this.a, str);
        } catch (avf e) {
            String message = e.getMessage();
            e.a();
            throw new ayl(message, (Exception) e);
        } catch (ava e2) {
            throw new ayl(e2);
        }
    }

    static {
        TimeUnit.SECONDS.toMillis(2);
    }

    public bqh(Context context, byte b) {
        this(context);
    }
}

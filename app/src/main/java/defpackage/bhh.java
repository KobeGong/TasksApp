package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bhh  reason: default package */
/* compiled from: PG */
public final class bhh {
    private static bhh a;
    private Context b;
    private final Map c = Collections.synchronizedMap(new qr());
    private final BlockingQueue d = new LinkedBlockingQueue();

    public static synchronized bhh a(Context context) {
        bhh bhh;
        synchronized (bhh.class) {
            if (a == null) {
                bhh bhh2 = new bhh();
                a = bhh2;
                bhh2.b = context.getApplicationContext();
            }
            bhh = a;
        }
        return bhh;
    }

    public bhh() {
        new Messenger(new bhj(this, Looper.getMainLooper()));
    }

    public static String a(Intent intent) {
        if (!"com.google.android.c2dm.intent.RECEIVE".equals(intent.getAction())) {
            return null;
        }
        String stringExtra = intent.getStringExtra("message_type");
        return stringExtra == null ? "gcm" : stringExtra;
    }

    static /* synthetic */ boolean a(bhh bhh, Intent intent) {
        Handler handler;
        String stringExtra = intent.getStringExtra("In-Reply-To");
        if (stringExtra == null && intent.hasExtra("error")) {
            stringExtra = intent.getStringExtra("google.message_id");
        }
        if (stringExtra == null || (handler = (Handler) bhh.c.remove(stringExtra)) == null) {
            return false;
        }
        Message obtain = Message.obtain();
        obtain.obj = intent;
        return handler.sendMessage(obtain);
    }

    static {
        new AtomicInteger(1);
    }
}

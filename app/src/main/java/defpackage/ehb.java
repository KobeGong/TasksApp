package defpackage;

import android.os.Message;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: ehb  reason: default package */
/* compiled from: PG */
final class ehb implements ehd {
    private Method a;

    ehb() {
        try {
            this.a = Message.class.getMethod("setAsynchronous", Boolean.TYPE);
        } catch (NoSuchMethodException e) {
            dpt.c("cr.SysMessageHandler", "Failed to load Message.setAsynchronous method", e);
        } catch (RuntimeException e2) {
            dpt.c("cr.SysMessageHandler", "Exception while loading Message.setAsynchronous method", e2);
        }
    }

    @Override // defpackage.ehd
    public final void a(Message message) {
        if (this.a != null) {
            try {
                this.a.invoke(message, true);
            } catch (IllegalAccessException e) {
                dpt.c("cr.SysMessageHandler", "Illegal access to async message creation, disabling.", new Object[0]);
                this.a = null;
            } catch (IllegalArgumentException e2) {
                dpt.c("cr.SysMessageHandler", "Illegal argument for async message creation, disabling.", new Object[0]);
                this.a = null;
            } catch (InvocationTargetException e3) {
                dpt.c("cr.SysMessageHandler", "Invocation exception during async message creation, disabling.", new Object[0]);
                this.a = null;
            } catch (RuntimeException e4) {
                dpt.c("cr.SysMessageHandler", "Runtime exception during async message creation, disabling.", new Object[0]);
                this.a = null;
            }
        }
    }
}

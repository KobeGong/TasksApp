package defpackage;

/* renamed from: ehb reason: default package */
/* compiled from: PG */
final class ehb implements defpackage.ehd {
    private java.lang.reflect.Method a;

    ehb() {
        try {
            this.a = android.os.Message.class.getMethod("setAsynchronous", new java.lang.Class[]{java.lang.Boolean.TYPE});
        } catch (java.lang.NoSuchMethodException e) {
            defpackage.dpt.c("cr.SysMessageHandler", "Failed to load Message.setAsynchronous method", e);
        } catch (java.lang.RuntimeException e2) {
            defpackage.dpt.c("cr.SysMessageHandler", "Exception while loading Message.setAsynchronous method", e2);
        }
    }

    public final void a(android.os.Message message) {
        if (this.a != null) {
            try {
                this.a.invoke(message, new java.lang.Object[]{java.lang.Boolean.valueOf(true)});
            } catch (java.lang.IllegalAccessException e) {
                defpackage.dpt.c("cr.SysMessageHandler", "Illegal access to async message creation, disabling.", new java.lang.Object[0]);
                this.a = null;
            } catch (java.lang.IllegalArgumentException e2) {
                defpackage.dpt.c("cr.SysMessageHandler", "Illegal argument for async message creation, disabling.", new java.lang.Object[0]);
                this.a = null;
            } catch (java.lang.reflect.InvocationTargetException e3) {
                defpackage.dpt.c("cr.SysMessageHandler", "Invocation exception during async message creation, disabling.", new java.lang.Object[0]);
                this.a = null;
            } catch (java.lang.RuntimeException e4) {
                defpackage.dpt.c("cr.SysMessageHandler", "Runtime exception during async message creation, disabling.", new java.lang.Object[0]);
                this.a = null;
            }
        }
    }
}

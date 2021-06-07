package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: cqd  reason: default package */
/* compiled from: PG */
public final class cqd {
    private static final Object a = new Object();
    private static final cqg b = new cqg(new cqh());
    private Context c;
    private cqd d;
    private final Map e;
    private final CopyOnWriteArrayList f;
    private final ThreadLocal g;
    private volatile boolean h;
    private volatile cqf i;

    public cqd(Context context) {
        this(context, (byte) 0);
    }

    private cqd(Context context, byte b2) {
        this.e = Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedSet(new HashSet());
        this.f = new CopyOnWriteArrayList();
        this.g = new ThreadLocal();
        this.i = new cqf();
        this.c = context;
        this.d = null;
        context.getClass().getName();
    }

    public cqd() {
        this.e = Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedSet(new HashSet());
        this.f = new CopyOnWriteArrayList();
        this.g = new ThreadLocal();
        this.i = new cqf();
    }

    public final cqd a(cqi cqi) {
        boolean z = this.h;
        this.f.add(cqi);
        return this;
    }

    public final Object a(Class cls) {
        cky.a(cls);
        Object c2 = c(cls);
        if (c2 != null) {
            return c2;
        }
        return null;
    }

    public final List b(Class cls) {
        cky.a(cls);
        ArrayList arrayList = new ArrayList();
        Object c2 = c(cls);
        if (c2 != null) {
            arrayList.add(c2);
        }
        return arrayList;
    }

    private final Object c(Class cls) {
        Object obj;
        boolean z = true;
        int i2 = 0;
        cky.a(cls);
        if (this.c == null) {
            throw new IllegalStateException("Binder not initialized yet.");
        }
        synchronized (this.i.a) {
            obj = this.e.get(cls);
            if (obj == null) {
                Boolean bool = (Boolean) this.g.get();
                if (bool == null || !bool.booleanValue()) {
                    z = false;
                }
                if (!z) {
                    this.g.set(true);
                }
                try {
                    int size = this.f.size();
                    while (true) {
                        if (i2 < size) {
                            cqi cqi = (cqi) this.f.get(i2);
                            Object[] objArr = {cqi, cls};
                            cqi.a(this.c, cls, this);
                            obj = this.e.get(cls);
                            if (obj == null || obj == a) {
                                i2++;
                            }
                        } else {
                            if (!z) {
                                this.g.set(false);
                            }
                            obj = this.e.get(cls);
                            if (obj == null) {
                                this.e.put(cls, a);
                            }
                        }
                    }
                } finally {
                    if (!z) {
                        this.g.set(Boolean.valueOf(false));
                    }
                }
            } else if (obj == a) {
                obj = null;
            }
        }
        return obj;
    }

    public static cqd a(Context context) {
        cqd cqd;
        boolean z;
        Context applicationContext = context.getApplicationContext();
        boolean z2 = false;
        Context context2 = context;
        while (true) {
            if (context2 instanceof cqe) {
                cqd = ((cqe) context2).a();
                if (cqd == null) {
                    String valueOf = String.valueOf(context2);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 43).append("BinderContext must not return null Binder: ").append(valueOf).toString());
                }
            } else {
                cqd = null;
            }
            if (cqd != null) {
                return cqd;
            }
            if (context2 == applicationContext) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = z | z2;
            if (context2 instanceof ContextWrapper) {
                context2 = ((ContextWrapper) context2).getBaseContext();
                if (context2 == null) {
                    throw new IllegalStateException("Invalid ContextWrapper -- If this is a Robolectric test, have you called ActivityController.create()?");
                }
            } else if (!z3) {
                context2 = applicationContext;
            } else {
                context2 = null;
            }
            if (context2 == null) {
                return b.a(applicationContext.getApplicationContext());
            }
            z2 = z3;
        }
    }

    static {
        new cqk("debug.binder.verification");
        new cqk("debug.binder.strict_mode");
        new cqk("test.binder.trace", (byte) 0);
        new cqk("test.binder.detail_trace", (byte) 0);
    }
}

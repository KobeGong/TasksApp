package defpackage;

/* renamed from: ni reason: default package */
/* compiled from: PG */
public final class ni {
    public android.content.Context a;
    public java.util.ArrayList b;
    public java.util.ArrayList c;
    public java.lang.CharSequence d;
    public java.lang.CharSequence e;
    public android.app.PendingIntent f;
    public android.graphics.Bitmap g;
    public int h;
    public boolean i;
    public java.lang.CharSequence j;
    public java.lang.String k;
    public boolean l;
    public boolean m;
    public java.lang.String n;
    public android.os.Bundle o;
    public int p;
    public int q;
    public android.app.Notification r;
    public java.lang.String s;
    public int t;
    public android.app.Notification u;
    @java.lang.Deprecated
    public java.util.ArrayList v;
    private defpackage.nk w;

    private ni(android.content.Context context) {
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
        this.i = true;
        this.m = false;
        this.p = 0;
        this.q = 0;
        this.t = 0;
        this.u = new android.app.Notification();
        this.a = context;
        this.s = null;
        this.u.when = java.lang.System.currentTimeMillis();
        this.u.audioStreamType = -1;
        this.h = 0;
        this.v = new java.util.ArrayList();
    }

    @java.lang.Deprecated
    public ni(android.content.Context context, byte b2) {
        this(context);
    }

    public final defpackage.ni a(long j2) {
        this.u.when = j2;
        return this;
    }

    public final defpackage.ni a(int i2) {
        this.u.icon = i2;
        return this;
    }

    public final defpackage.ni a(java.lang.CharSequence charSequence) {
        this.d = e(charSequence);
        return this;
    }

    public final defpackage.ni b(java.lang.CharSequence charSequence) {
        this.e = e(charSequence);
        return this;
    }

    public final defpackage.ni c(java.lang.CharSequence charSequence) {
        this.j = e(charSequence);
        return this;
    }

    public final defpackage.ni a(android.app.PendingIntent pendingIntent) {
        this.u.deleteIntent = pendingIntent;
        return this;
    }

    public final defpackage.ni d(java.lang.CharSequence charSequence) {
        this.u.tickerText = e(charSequence);
        return this;
    }

    public final defpackage.ni a(android.net.Uri uri) {
        this.u.sound = uri;
        this.u.audioStreamType = -1;
        if (android.os.Build.VERSION.SDK_INT >= 21) {
            this.u.audioAttributes = new android.media.AudioAttributes.Builder().setContentType(4).setUsage(5).build();
        }
        return this;
    }

    public final void b(int i2) {
        this.u.flags |= i2;
    }

    public final android.os.Bundle a() {
        if (this.o == null) {
            this.o = new android.os.Bundle();
        }
        return this.o;
    }

    public final defpackage.ni a(defpackage.nk nkVar) {
        if (this.w != nkVar) {
            this.w = nkVar;
            if (this.w != null) {
                this.w.a(this);
            }
        }
        return this;
    }

    public final android.app.Notification b() {
        android.app.Notification notification;
        defpackage.ne neVar = new defpackage.ne(this);
        defpackage.nk nkVar = neVar.b.w;
        if (nkVar != null) {
            nkVar.a(neVar);
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            notification = neVar.a.build();
        } else if (android.os.Build.VERSION.SDK_INT >= 24) {
            notification = neVar.a.build();
            if (neVar.e != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || neVar.e != 2)) {
                    defpackage.ne.a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && neVar.e == 1) {
                    defpackage.ne.a(notification);
                }
            }
        } else if (android.os.Build.VERSION.SDK_INT >= 21) {
            neVar.a.setExtras(neVar.d);
            notification = neVar.a.build();
            if (neVar.e != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || neVar.e != 2)) {
                    defpackage.ne.a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && neVar.e == 1) {
                    defpackage.ne.a(notification);
                }
            }
        } else if (android.os.Build.VERSION.SDK_INT >= 20) {
            neVar.a.setExtras(neVar.d);
            notification = neVar.a.build();
            if (neVar.e != 0) {
                if (!(notification.getGroup() == null || (notification.flags & 512) == 0 || neVar.e != 2)) {
                    defpackage.ne.a(notification);
                }
                if (notification.getGroup() != null && (notification.flags & 512) == 0 && neVar.e == 1) {
                    defpackage.ne.a(notification);
                }
            }
        } else if (android.os.Build.VERSION.SDK_INT >= 19) {
            android.util.SparseArray a2 = defpackage.nl.a(neVar.c);
            if (a2 != null) {
                neVar.d.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            neVar.a.setExtras(neVar.d);
            notification = neVar.a.build();
        } else {
            android.app.Notification build = neVar.a.build();
            android.os.Bundle a3 = defpackage.jd.a(build);
            android.os.Bundle bundle = new android.os.Bundle(neVar.d);
            for (java.lang.String str : neVar.d.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            android.util.SparseArray a4 = defpackage.nl.a(neVar.c);
            if (a4 != null) {
                defpackage.jd.a(build).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            notification = build;
        }
        if (nkVar != null) {
            defpackage.jd.a(notification);
        }
        return notification;
    }

    public static java.lang.CharSequence e(java.lang.CharSequence charSequence) {
        if (charSequence != null && charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }
}
